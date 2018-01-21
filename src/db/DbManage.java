package db;

import java.sql.*;

import com.mysql.jdbc.Statement;

public class DbManage {
	private Connection conn=null;
	public int excuteSql(String sqlTxt) throws ClassNotFoundException{
		int flag=0;
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/taxisystem";
		Statement stmt=null;
		try{
			Class.forName(driver);
			this.conn=DriverManager.getConnection(url, "root", "123456");
			stmt = (Statement) this.conn.createStatement();
			flag = stmt.executeUpdate(sqlTxt);
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}finally{
			this.closeConnection();
		}
		return flag;
	}
	
	private void closeConnection() {
		try{
			if (!this.conn.equals(null))
				this.conn.close();
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		this.conn = null;
	}
	
	//通过sql语句查询数据库
			public ResultSet querySql(String sqlTxt) throws SQLException {
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/taxisystem";
				
				Statement stmt = null;
				ResultSet rs = null;
				try{
					Class.forName(driver);
					this.conn = DriverManager.getConnection(url, "root", "123456");
					stmt = (Statement) this.conn.createStatement();
					rs = stmt.executeQuery(sqlTxt);
				}
				catch(ClassNotFoundException e){
					e.printStackTrace();
				}
				catch(SQLException e){
					e.printStackTrace();
				}
				
				return rs;
			}
			
			//多个sql语句  增加 删除 修改
			public int ExcuteSql(String[] sqlTxt) throws SQLException	{
				int flag = 0;
				java.sql.Statement stmt = null;
				String driver = "com.mysql.jdbc.Driver";
				String url = "jdbc:mysql://localhost:3306/taxisystem";
				try {
					Class.forName(driver);
					this.conn = DriverManager.getConnection(url, "root", "123456");
					this.conn.setAutoCommit(false);
					stmt = this.conn.createStatement();
					for (int i = 0; i < sqlTxt.length; i++)
						flag = stmt.executeUpdate(sqlTxt[i]);
					
					this.conn.commit();
				}
				catch (ClassNotFoundException e) {
					e.printStackTrace();
					this.conn.rollback();
				} 
				catch (SQLException s) {
					s.printStackTrace();
				} 
				finally {
					
					this.closeConnection();
				}
				return flag;
			}
}
