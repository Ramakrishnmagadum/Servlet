package CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

	public static Connection getconnection() throws SQLException, ClassNotFoundException {
		Connection conn = null;
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/RamDB", "root", "root");
		return conn;
	}

	public static int savestudents(StudentsBean student) throws ClassNotFoundException, SQLException {
		Connection conn = StudentDao.getconnection();
		PreparedStatement ps = conn.prepareStatement(
				"insert into StudentsBean (rollno , name , gender,subject , country)" + "values(?,?,?,?,?)");
		ps.setInt(1, student.getRollno());
		ps.setString(2, student.getName());
		ps.setString(3, student.getGender());
		ps.setString(4, student.getSubject());
		ps.setString(5, student.getCountry());
		return ps.executeUpdate();
	}

	public static List<StudentsBean> getAllStudent() throws ClassNotFoundException, SQLException {
		Connection conn = StudentDao.getconnection();
		List<StudentsBean> list = new ArrayList<StudentsBean>();
		PreparedStatement ps = conn.prepareStatement("select * from StudentsBean");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			StudentsBean bean = new StudentsBean();
			bean.setRollno(rs.getInt(1));
			bean.setName(rs.getString(2));
			bean.setGender(rs.getString(3));
			bean.setSubject(rs.getString(4));
			bean.setCountry(rs.getString(5));
			list.add(bean);
		}
		return list;
	}

	public static StudentsBean getStudent(int id) throws SQLException, ClassNotFoundException {
		Connection conn = StudentDao.getconnection();
		PreparedStatement ps = conn.prepareStatement("select * from StudentsBean where rollno=" + id);
		ResultSet rs = ps.executeQuery();
		StudentsBean bean = new StudentsBean();
		if(rs.next()) {
		bean.setRollno(rs.getInt(1));
		bean.setName(rs.getString(2));
		bean.setGender(rs.getString(3));
		bean.setSubject(rs.getString(4));
		bean.setCountry(rs.getString(5));
		}
		return bean;
	}
	
	public static int updateStudent(StudentsBean std) throws SQLException, ClassNotFoundException {
		Connection conn = StudentDao.getconnection();
		PreparedStatement ps = conn.prepareStatement("update StudentsBean set name='"+std.getName()+"',gender='"+std.getGender()+"',subject='"+
		std.getSubject()+"',country='"+std.getCountry()+"' where rollno="+std.getRollno());
		return ps.executeUpdate();
	}
	
	public static int DeleteStudent(int id) throws SQLException, ClassNotFoundException {
		Connection conn = StudentDao.getconnection();
		PreparedStatement ps = conn.prepareStatement("Delete from StudentsBean where rollno="+id);
				return ps.executeUpdate();
		
	}

}
