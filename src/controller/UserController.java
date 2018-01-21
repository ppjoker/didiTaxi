package controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbManage;
import entity.HuoDe;
import entity.TripInfo;
import entity.UserInfo;
import logic.Trip;
import logic.UserLogic;


@Controller
public class UserController {
	
	private UserLogic userLogic = new UserLogic();
	
	@RequestMapping(value="/Pmain")
	public String main(Model model){
		return "Pmain";
	}

	@RequestMapping(value="/revise")
	public String revise(Model model,HttpServletRequest request, HttpSession session){
		String tel=(String) session.getAttribute("tel");
		model.addAttribute("user", userLogic.revise(tel));
		return "revise";
	}
}