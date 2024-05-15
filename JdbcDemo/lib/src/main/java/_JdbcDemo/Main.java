package _JdbcDemo;

import java.sql.*;
public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sakila";
		String uname = "root";
		String pass = "Ankush@123";
		String query = "SELECT `name` FROM language where language_id = 5;";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pass);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			while(rs.next()) {
				String lang = rs.getString("name");
				System.out.println("name : "+lang);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
				if(con != null) con.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
