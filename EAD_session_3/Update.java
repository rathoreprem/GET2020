package EadAssignment3;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Update
 */
@WebServlet("/Update")
public class Update extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		try
		{
			String firstName=request.getParameter("studentFirstName");
			String lastName=request.getParameter("studentLastName");
			String fatherName=request.getParameter("fathersName");
			String email=request.getParameter("email");
			String studentClass=request.getParameter("class");
			String age=request.getParameter("age");
			String previousEmail=request.getParameter("previousemail");
			Class.forName("com.mysql.jdbc.Driver");  
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
			PreparedStatement ps=con.prepareStatement("DELETE FROM sdatabase WHERE email=?");
			ps.setString(1,previousEmail);
			ps.executeUpdate();

			PreparedStatement preparedstmt=con.prepareStatement("INSERT INTO sdatabase VALUES(?,?,?,?,?,?)");
			preparedstmt.setString(1,firstName);
			preparedstmt.setString(2,lastName);
			preparedstmt.setString(3,fatherName);
			preparedstmt.setString(4,email);
			preparedstmt.setString(5,studentClass);
			preparedstmt.setString(6,age);
			preparedstmt.executeUpdate();
			response.sendRedirect("homepage.html");
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}



