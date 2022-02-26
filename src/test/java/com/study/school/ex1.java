package com.study.school;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
public class ex1 {
	public static void main(String[] args){
		String url = "jdbc:mysql://localhost:3307/school";
		String user = "root";
		String password = "1234";
		// MySQL Statement here
		String mysqlStatement1 = "INSERT INTO school.student (name, chi, eng, sum) values('Marry', 80, 90, 100);";
		String mysqlStatement2 = "INSERT INTO school.student (name, chi, eng, sum) values(?, ?, ?, ?);";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver installed already!!!");
			Connection conn = DriverManager.getConnection(url, user, password);
			// Statement 語法
			Statement st = conn.createStatement();			
			st.execute(mysqlStatement1);
			// PreparedStatement 語法 ; 避免 SQL Injection
			PreparedStatement ps = conn.prepareStatement(mysqlStatement2);
			ps.setString(1, "GoGoSister");
			ps.setInt(2, 60);
			ps.setInt(3, 70);
			ps.setInt(4, 70);	
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}