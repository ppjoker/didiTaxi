package logic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import db.DbManage;
import entity.Bank;

public class BankLogic {
	
	public ArrayList<Bank> getALlBank(String tel) {
		String sqlTxt="select * from bank where tel = '" + tel + "'" ;
		System.out.println(sqlTxt);
		ArrayList<Bank> allBank=new ArrayList<Bank>();
		ResultSet rs=null;
		DbManage db=new DbManage();
		try {
			rs=db.querySql(sqlTxt);
			while(rs.next()){
				Bank b=new Bank();
				b.setTel(tel);
				b.setBancode(rs.getString("bankcode"));
				b.setBankname(rs.getString("bankname"));
				allBank.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allBank;
	}

}
