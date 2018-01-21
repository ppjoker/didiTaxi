package controller;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbManage;
import entity.Bank;
import entity.Driver;
import entity.UserInfo;
import logic.BankLogic;

@Controller
public class walletController {
	
	private BankLogic bankLogic = new BankLogic();
	
	@RequestMapping(value="/wallet")
	public String wallet(Model model){
		return "wallet";
	}
	@RequestMapping(value="/yue")
	public String yue(Model model){
		return "yue";
	}
	@RequestMapping(value="/moneydetail")
	public String moneydetail(Model model){
		return "moneyDetail";
	}
	@RequestMapping(value="/bank")
	public String bank(Model model, HttpSession session){
		model.addAttribute("bank_list", bankLogic.getALlBank((String) session.getAttribute("tel")));
		return "bank";
	}
	@RequestMapping(value="/addbank")
	public String addbank(Model model,HttpServletRequest request, HttpSession session) throws SQLException {
		String tel=(String) session.getAttribute("tel");
		
		String sqlTxt=null;
		sqlTxt="select count(*) as r from userinfo where tel='"+tel+"'";
		System.out.println(sqlTxt+"***************************");
		DbManage db=new DbManage();
		ResultSet rs=null;
		UserInfo u=new UserInfo();
		int sum=0;
		try{
			rs=db.querySql(sqlTxt);
		}catch(Exception e){
			e.printStackTrace();
		}
		while(rs.next()){
			sum=rs.getInt("r");
		}
		if(sum>0){
			sqlTxt="select*from userinfo where tel='"+tel+"'";	
			try{
				rs=db.querySql(sqlTxt);
			}catch(Exception e){
				e.printStackTrace();
			}
			while(rs.next()){
				u.setType(rs.getInt("type"));
				System.out.println(rs.getInt("type"));
				u.setAge(rs.getString("age"));
				u.setName(rs.getString("name"));
				u.setNickname(rs.getString("nickname"));
				u.setProfessional(rs.getString("professional"));
				u.setPs(rs.getString("ps"));
				u.setSex(rs.getString("sex"));
				u.setTel(rs.getString("tel"));
			}
		}
		
			model.addAttribute("user", u);
		return "bankRegister";
	}
	@RequestMapping(value="/bankregister")
	public String bankregister(Model model,HttpServletRequest request, HttpSession session) throws UnsupportedEncodingException,SQLException{
		request.setCharacterEncoding("utf-8");
		String tel=(String) session.getAttribute("tel");
		String bankname=request.getParameter("bankname");
		String bankcode=request.getParameter("bankcode");


		String sqlTxt="insert into bank(tel,bankname,bankcode) values('"+tel+"','"+bankname+"','"+bankcode+"')";
		System.out.println(sqlTxt);
		DbManage db=new DbManage();
		int flag=0;
		
		UserInfo u=new UserInfo();
		ResultSet rs=null;
		try{
			flag=db.excuteSql(sqlTxt);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		if(flag!=0){
			
			System.out.println(flag);
			return "redirect:/bank";
		}else
			return "bankRegister";
	}
}
