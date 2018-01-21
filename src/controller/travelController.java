package controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbManage;
import entity.TripInfo;
import entity.UserInfo;
import logic.Trip;
@Controller
public class travelController {
	private Trip trip = new Trip();
	@RequestMapping(value="/ppublish")//pmain
	public String ppublish(HttpServletRequest request,Model model,HttpSession session) throws IOException, SQLException, ClassNotFoundException{
		request.setCharacterEncoding("utf-8");
		String id=request.getParameter("id");
		System.out.println(id+"***********///////////////");
		String tel=request.getParameter("tel");
		String name=request.getParameter("name");
		String sp=request.getParameter("sp");
		String end=request.getParameter("end");
		String time=request.getParameter("time");
		String cost=request.getParameter("income");
		System.out.println(time+"****************");
		String sqlTxt;
		DbManage db=new DbManage();
		ResultSet rs=null;
		int flag=0;
		UserInfo u=new UserInfo();
		UserInfo x=new UserInfo();
		u.setBacknews("不可在相近时间去不同的地方");
		model.addAttribute("c", u);
		sqlTxt="select count(*) as r from passnertravel where time like '%"+time+"%' and tel like '%"+tel+"'";
		try{
			rs=db.querySql(sqlTxt);
		}catch(Exception e){
			e.printStackTrace();
		}
		int sum=0;
		while(rs.next()){
			sum=rs.getInt("r");
			x.setName(name);
			x.setTel(tel);
			model.addAttribute("user", x);
		}
		if(sum<=0){
			sqlTxt="insert into passnertravel(id,tel,name,sp,end,time,cost,zt) values("+id+",'"+tel+"','"+name+"','"+sp+"','"+end+"','"+time+"','"+cost+"','待接单')";
			flag=db.excuteSql(sqlTxt);
			
			model.addAttribute("tripinfo_list", trip.findAllByTel(tel));
			return "travelDetail";
		}else	
			return "Pmain";
	}
	@RequestMapping(value="/traveldetail")
	public String draveldetail(Model model,HttpSession session){
		String tel=(String) session.getAttribute("tel");
		model.addAttribute("tripinfo_list", trip.findAllByTel(tel));
		return "travelDetail";
	}
	@RequestMapping(value="/arrive")
	public String arrive(Model model,HttpServletRequest request) throws SQLException{
		String id = request.getParameter("id");
		String sqlTxt ;
		
		DbManage db=new DbManage();
		
		try{
			sqlTxt = "update passnertravel set zt='完成' where id='" + id +"'";
			System.out.println(sqlTxt+"**********");
			db.excuteSql(sqlTxt);
		}catch(Exception e){
			e.printStackTrace();
		}
		return "redirect:/driverorder";
	}


}
