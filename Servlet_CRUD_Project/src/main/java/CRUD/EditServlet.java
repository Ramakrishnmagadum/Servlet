package CRUD;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		try {
			StudentsBean std=StudentDao.getStudent(id);
			out.print("<form action= 'EditServlet2' method= 'post'> "
					+ "		<table> "
					+ "		<tr> "
					+ "		<td></td> "
					+ "		<td><input type='hidden' name='rollno' value='"+std.getRollno()+"'</td> "
					+ "		</tr> "
					+ "			<tr> "
					+ "				<td>Name </td> "
					+ "				<td>: <input type='text' placeholder='Enter the Name' name='name' value='"+std.getName()+"'></td> "
					+ "			</tr> "
					+ " "
					+ "			<tr> "
					+ "				<td>Gender </td> "
					+ "				<td>: Male<input type='radio' name='gender' value='male'> "
					+ "					FeMale<input type='radio'name='gender' value='female'></td> "
					+ "			</tr> "
					+ " "
					+ "			<tr> "
					+ "				<td>Subject</td> "
					+ "				<td>:  "
					+ "				<select name='subject' > "
					+ "				<option value='Java'>Java</option> "
					+ "				<option value='Html'>Html</option> "
					+ "				<option value='CSS'>CSS</option> "
					+ "				<option value='Other'>Other</option> "
					+ "				</select> "
					+ "				</td> "
					+ "			</tr> "
					+ " "
					+ "			<tr> "
					+ "				<td>Country</td> "
					+ "				<td>: "
					+ "				<select name='country'> "
					+ "				<option value='India'>India</option> "
					+ "				<option value='China'>China</option> "
					+ "				<option value='America'>America</option> "
					+ "				</select> </td> "
					+ "			</tr> "
					+ "			<tr> "
					+ "				<td></td> "
					+ "				<td><input type='submit' value='Edit & Save'> </td> "
					+ "			</tr> "
					+ "		</table> "
					+ "	</form>");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
