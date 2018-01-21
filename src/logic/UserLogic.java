package logic;

import java.sql.ResultSet;
import java.sql.SQLException;

import db.DbManage;
import entity.UserInfo;

public class UserLogic {

	public UserInfo revise(String tel) {
		String sqlTxt="select*from userinfo where tel='"+tel+"'";
		DbManage db=new DbManage();
		UserInfo u=new UserInfo();
		ResultSet rs=null;
		try{
			rs=db.querySql(sqlTxt);
		}catch(Exception e){
			e.printStackTrace();
		}
		try {
			while(rs.next()){
				u.setTel(tel);
				u.setNickname(rs.getString("nickname"));
				u.setProfessional(rs.getString("professional"));
				u.setPs(rs.getString("ps"));
				u.setName(rs.getString("name"));
				u.setAge(rs.getString("age"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return u;
	}
	
	public int inputrevise(String tel, String name, String nickname, String age, String sex, String ps, String professional) {
		String sqlTxt="update userinfo set tel='"+tel+"',name='"+name+"',nickname='"+nickname+"',age='"+age+"',ps='"+ps+"',professional='"+professional+"' where tel='"+tel+"'";
		DbManage db=new DbManage();
		int flag=0;
		try{
			flag=db.excuteSql(sqlTxt);
		}catch(Exception e){
			e.printStackTrace();
		}
		return flag;
	}
	
}
