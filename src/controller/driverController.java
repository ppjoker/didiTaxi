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
import entity.Driver;
import entity.UserInfo;
import logic.Trip;

@Controller
public class driverController {
	
	private Trip trip = new Trip();
	
	@RequestMapping(value="/driverorder")
	public String driver(Model model,HttpServletRequest request, HttpSession session) throws UnsupportedEncodingException,SQLException {
		String tel=(String) session.getAttribute("tel");
		System.out.println(tel);
		String sqlTxt=null;
		String zt = "´ý½Óµ¥";
		sqlTxt="select count(*) as r from driver where tel='"+tel+"'";
		System.out.println(sqlTxt+"***************************");
		DbManage db=new DbManage();
		ResultSet rs=null;
		int sum=0;
		
		try{
			rs=db.querySql(sqlTxt);
		}catch(Exception e){
			e.printStackTrace();
		}
		while(rs.next()){
			sum=rs.getInt("r");
			System.out.println(sum);
		}
		model.addAttribute("tripinfo_list", trip.findAllByZt(zt));
		if(sum>0){
			return "driverOrder";
		}
		else
			return "driverRegister";

	}
	@RequestMapping(value="/driverRegister")
	public String register(Model model,HttpServletRequest request,HttpSession session) throws UnsupportedEncodingException,SQLException{
		request.setCharacterEncoding("utf-8");
		String tel = (String) session.getAttribute("tel");
		String vehicleCode=request.getParameter("vehicleCode");
		String vehicleColor=request.getParameter("vehicleColor");
		String vehicleBrand=request.getParameter("vehicleBrand");
		String driverLicense=request.getParameter("driverLicense");

		String sqlTxt="insert into driver(tel,vehicleCode,vehicleColor,vehicleBrand,driverLicense) values('"+tel+"','"+vehicleCode+"','"+vehicleColor+"','"+vehicleBrand+"','"+driverLicense+"')";
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
		if(flag !=0 ){
			
			return "redirect:/driverorder";
			
		}
		else
			
			return "driverRegister";
	}
	@RequestMapping(value="/order")
	public String order(Model model,HttpServletRequest request,HttpSession session) throws UnsupportedEncodingException,SQLException{
		model.addAttribute("tripinfo", trip.findOne(request.getParameter("id")));
		return "order";
	}
	
}
