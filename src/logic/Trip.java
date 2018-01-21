package logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import db.DbManage;
import entity.TripInfo;

public class Trip {
	
	
	public List<TripInfo> findAllByZt(String zt) {
		String sqlTxt="select*from passnertravel where zt= '" + zt +"'";
		System.out.println(sqlTxt);
		List<TripInfo> allTripInfo=new ArrayList<TripInfo>();
		ResultSet rs=null;
		DbManage db=new DbManage();
		try {
			rs=db.querySql(sqlTxt);
			while(rs.next()){
				TripInfo t=new TripInfo();
				t.setEnd(rs.getString("end"));
				t.setId(rs.getInt("id"));
				t.setName(rs.getString("name"));
				t.setSp(rs.getString("sp"));
				t.setTime(rs.getString("time"));
				t.setTel(rs.getString("tel"));
				t.setCost(rs.getFloat("cost"));
				allTripInfo.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allTripInfo;
	}
	

	
	public TripInfo findOne(String id) {
		String sqlTxt="select*from passnertravel where id='" + id + "'";
		System.out.println(sqlTxt);
		TripInfo t = new TripInfo();
		ResultSet rs=null;
		DbManage db=new DbManage();
		try {
			rs=db.querySql(sqlTxt);
			while(rs.next()){
				t.setEnd(rs.getString("end"));
				t.setId(rs.getInt("id"));
				t.setName(rs.getString("name"));
				t.setSp(rs.getString("sp"));
				t.setTime(rs.getString("time"));
				t.setTel(rs.getString("tel"));
				t.setCost(rs.getFloat("cost"));
				t.setZt(rs.getString("zt"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return t;
	}
	
	public List<TripInfo> findAllByTel(String tel) {
		String sqlTxt="select*from passnertravel where tel='" + tel + "'";
		System.out.println(sqlTxt);
		List<TripInfo> allTripInfo=new ArrayList<TripInfo>();
		ResultSet rs=null;
		DbManage db=new DbManage();
		try {
			rs=db.querySql(sqlTxt);
			while(rs.next()){
				TripInfo t=new TripInfo();
				t.setEnd(rs.getString("end"));
				t.setId(rs.getInt("id"));
				t.setName(rs.getString("name"));
				t.setSp(rs.getString("sp"));
				t.setTime(rs.getString("time"));
				t.setTel(rs.getString("tel"));
				t.setCost(rs.getFloat("cost"));
				t.setZt(rs.getString("zt"));
				allTripInfo.add(t);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allTripInfo;
	}
	
	
	public ArrayList<TripInfo> get_trip_list(String sp,String end,String time) throws SQLException{
		String sqlTxt="select*from dalltripinfo where sp like '%"+sp+"%' and end like '%"+end+"%' and time like '%"+time+"%'";
		System.out.println(sqlTxt);
		ArrayList<TripInfo> alltrip=new ArrayList<TripInfo>();
		ResultSet rs=null;
		DbManage db=new DbManage();
		rs=db.querySql(sqlTxt);
		while(rs.next()){
			TripInfo t=new TripInfo();
			t.setEnd(rs.getString("end"));
			t.setId(rs.getInt("id"));
			t.setName(rs.getString("name"));
			t.setSp(rs.getString("sp"));
			t.setTime(rs.getString("time"));
			t.setTel(rs.getString("tel"));
			t.setIncome(rs.getString("income"));
			alltrip.add(t);
		}
		return alltrip;
	}
	public ArrayList<TripInfo> get_trip_list2(String sp,String end,String time) throws SQLException{
		String sqlTxt="select*from palltripinfo where sp like '%"+sp+"%' and end like '%"+end+"%' and time like '%"+time+"%'";
		System.out.println(sqlTxt);
		ArrayList<TripInfo> alltrip=new ArrayList<TripInfo>();
		ResultSet rs=null;
		DbManage db=new DbManage();
		rs=db.querySql(sqlTxt);
		while(rs.next()){
			TripInfo t=new TripInfo();
			t.setEnd(rs.getString("end"));
			t.setId(rs.getInt("id"));
			t.setName(rs.getString("name"));
			t.setSp(rs.getString("sp"));
			t.setTime(rs.getString("time"));
			t.setTel(rs.getString("tel"));
			alltrip.add(t);
		}
		return alltrip;
	}
	public ArrayList<TripInfo> get_trip_list3(String tel,String startPage,String pageSize) throws SQLException{
		int sp=(Integer.parseInt(startPage)-1)*3;
		startPage=Integer.toString(sp);
		System.out.println(startPage+"00***/*/");
		System.out.println(pageSize+"00***/*/");
		String sqlTxt="select*from ptripinfo where tel like '%"+tel+"%'"+" limit "+startPage+","+pageSize ;
		System.out.println(sqlTxt);
		ArrayList<TripInfo> alltrip=new ArrayList<TripInfo>();
		ResultSet rs=null;
		DbManage db=new DbManage();
		rs=db.querySql(sqlTxt);
		while(rs.next()){
			TripInfo t=new TripInfo();
			t.setEnd(rs.getString("end"));
			t.setId(rs.getInt("id"));
			t.setName(rs.getString("name"));
			t.setSp(rs.getString("sp"));
			t.setTime(rs.getString("time"));
			t.setTel(rs.getString("tel"));
			t.setCost(rs.getFloat("cost"));
			t.setDname(rs.getString("dname"));
			alltrip.add(t);
		}
		return alltrip;
	}
	public ArrayList<TripInfo> get_trip_list4(String tel,String startPage,String pageSize) throws SQLException{
		int sp=(Integer.parseInt(startPage)-1)*3;
		startPage=Integer.toString(sp);
		System.out.println(startPage+"00***/*/");
		System.out.println(pageSize+"00***/*/");
		String sqlTxt="select*from dtripinfo where tel like '%"+tel+"%'"+" limit "+startPage+","+pageSize ;
		System.out.println(sqlTxt);
		ArrayList<TripInfo> alltrip=new ArrayList<TripInfo>();
		ResultSet rs=null;
		DbManage db=new DbManage();
		rs=db.querySql(sqlTxt);
		while(rs.next()){
			TripInfo t=new TripInfo();
			t.setEnd(rs.getString("end"));
			t.setId(rs.getInt("id"));
			t.setName(rs.getString("name"));
			t.setSp(rs.getString("sp"));
			t.setTime(rs.getString("time"));
			t.setTel(rs.getString("tel"));
			t.setCost(rs.getFloat("income"));
			t.setPname(rs.getString("pname"));
			alltrip.add(t);
		}
		return alltrip;
	}
}
