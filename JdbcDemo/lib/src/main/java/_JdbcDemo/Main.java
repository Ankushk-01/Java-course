package _JdbcDemo;

import java.sql.*;
public class Main {
	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/sakila";
		String uname = "root";
		String pass = "Ankush@123";
//		String query = "SELECT `name` FROM language where language_id = 5;";
//		String query = "SELECT * FROM language;";
//		String query = "insert into language values (7,'Hindi','2006-02-15 05:02:19')";
		String query = "insert into language values (?,?,?)";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		try {
//			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, uname, pass);
//			stmt = con.createStatement();
//			int count = stmt.executeUpdate(query);
//			System.out.println(count+" rows affected");
//			rs = stmt.executeQuery(query);
//			while(rs.next()) {
//				String lang = rs.getInt(1)+" : "+rs.getString(2);
//				System.out.println("id : "+lang);
//			}
			
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, 8);
			pstmt.setString(2, "punjabi");
			pstmt.setString(3, "2024-02-15 05:02:19");
			int count = pstmt.executeUpdate();
			System.out.println(count+" rows affected");
			
			
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