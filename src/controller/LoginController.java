package controller;

import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbManage;
import entity.UserInfo;

@Controller
public class LoginController {
	@RequestMapping(value="/userlogin")
	public String userlogin(Model model){
		return "userlogin";
	}
	
	@RequestMapping(value="/checklogin")
	public String checklogin(Model model,HttpServletRequest request, HttpSession session, HttpServletResponse res) throws SQLException{

		String tel=request.getParameter("tel");
		String pwd=request.getParameter("pwd");
		String sqlTxt=null;
		sqlTxt="select count(*) as r from userinfo where tel='"+tel+"' and pwd='"+pwd+"'";
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
			sqlTxt="select*from userinfo where tel='"+tel+"' and pwd='"+pwd+"'";	
			try{
				rs=db.querySql(sqlTxt);
			}catch(Exception e){
				e.printStackTrace();
			}
			while(rs.next()){
				session.setAttribute("tel", rs.getString("tel"));
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
		int t=u.getType();
		model.addAttribute("user", u);
		return "Pmain";
	}
	@RequestMapping(value="/registerform")
	public String registerform(Model model){
		return "register";
	}
	@RequestMapping(value="/register")
	public String register(Model model,HttpServletRequest request) throws UnsupportedEncodingException, ClassNotFoundException{
		request.setCharacterEncoding("utf-8");
		String tel=request.getParameter("tel");
		String pwd=request.getParameter("pwd");
		String name=request.getParameter("name");
		String type=request.getParameter("type");
		String nickname=request.getParameter("nickname");
		String age=request.getParameter("age");
		String sex=request.getParameter("sex");
		String ps=request.getParameter("ps");
		String professional=request.getParameter("professional");
		String sqlTxt="insert into userinfo(tel,name,pwd,sex,age,nickname,professional,ps,type) values('"+tel+"','"+name+"','"+pwd+"','"+sex+"','"+age+"','"+nickname+"','"+professional+"','"+ps+"',2)";
		System.out.println(sqlTxt);
		DbManage db=new DbManage();
		int flag=0;
		flag=db.excuteSql(sqlTxt);
		try{
			sqlTxt="insert into wallet(name,tel,pwd) values("+"'"+name+"',"+"'"+tel+"',"+"'"+pwd+"')";
			System.out.println(sqlTxt);
			flag=db.excuteSql(sqlTxt);
		}catch(Exception e){
			e.printStackTrace();
		}
		if(flag!=0){
			UserInfo userInfo=new UserInfo();
			userInfo.setBacknews("×¢²á³É¹¦!");
			model.addAttribute("userInfo", userInfo);
			return "userlogin";
		}else
			return "register";
	}
}
