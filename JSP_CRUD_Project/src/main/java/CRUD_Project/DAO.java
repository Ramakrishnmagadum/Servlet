package CRUD_Project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO  {
	
	public static Connection getconnection() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RamDB", "root", "root");
		return conn;
	}

	public static int savestudent(StudentsBean bean) throws ClassNotFoundException, SQLException {
		Connection conn=getconnection();
		PreparedStatement excute = conn.prepareStatement("insert into jspstudent (name , email ,sex , country ) values(?,?,?,?)");
		excute.setString(1, bean.getName());
		excute.setString(2, bean.getEmail());
		excute.setString(3, bean.getSex());
		excute.setString(4, bean.getCountry());
		return excute.executeUpdate();
	}
	
	public static List<StudentsBean> getAllRecords() throws ClassNotFoundException, SQLException{
		List<StudentsBean> list=new ArrayList<StudentsBean>();
		Connection conn=getconnection();
		PreparedStatement ps = conn.prepareStatement("select * from jspstudent");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			StudentsBean bean = new StudentsBean();
			bean.setName(rs.getString(1));
			bean.setEmail(rs.getString(2));
			bean.setSex(rs.getString(3));
			bean.setCountry(rs.getString(4));
			list.add(bean);
		}
		return list;
	}
	
	
	public static StudentsBean getrecord(String name) throws ClassNotFoundException, SQLException {
		StudentsBean bean=new StudentsBean();
		Connection conn=getconnection();
		System.out.println("nameis  "+name);
		PreparedStatement ps = conn.prepareStatement("select * from jspstudent where name ='"+name+"'");
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			bean.setName(rs.getString(1));
			bean.setEmail(rs.getString(2));
			bean.setSex(rs.getString(3));
			bean.setCountry(rs.getString(4));
		}
		return bean;
	}
	
	public static void deletestudent(String name) throws ClassNotFoundException, SQLException {
		Connection conn=getconnection();
		PreparedStatement ps = conn.prepareStatement("delete from jspstudent where name='"+name+"'");
		ps.executeUpdate();
		
	}
	


}
