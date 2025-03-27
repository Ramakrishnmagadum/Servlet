package com.tech.blog.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;

import com.tech.blog.Entities.UserBean;

public class UserDao {
	
	public static Connection conn;

	public UserDao(Connection conn) {
		super();
		this.conn = conn;
	}
	
	
	public static boolean saveuser(UserBean user) {
		
		
		String query="insert into user (name, email , password , gender , about , Rdate) values(?,?,?,?,?,?)";
		boolean f=false;
			try {
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getEmail());
			pstmt.setString(3, user.getPassword());
			pstmt.setString(4, user.getGender());
			pstmt.setString(5, user.getAbout());
			 LocalDate currentDate = LocalDate.now(); 
			pstmt.setString(6,currentDate.toString());
			
			pstmt.executeUpdate();
			f=true;
			
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return f;
		
	}
	

}
