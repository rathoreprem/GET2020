package EadAssignment3;

import java.io.*;
import java.sql.*;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowDatabase
 */
@WebServlet("/ShowDatabase")
public class ShowDatabase extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
    /**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		String fstname=request.getParameter("studentFirstName");
		String lstname=request.getParameter("studentLastName");
		String fname=request.getParameter("fathersName");
		String email=request.getParameter("email");
		String class1=request.getParameter("class");
		String age=request.getParameter("age");
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
			PreparedStatement ps=con.prepareStatement("INSERT Into sdatabase VALUES(?,?,?,?,?,?)"); 
			ps.setString(1, fstname);
			ps.setString(2, lstname);
			ps.setString(3, fname);
			ps.setString(4, email);
			ps.setString(5, class1);
			ps.setString(6, age);
			int execute_variable = ps.executeUpdate();
			
			if (execute_variable > 0)
			{
				System.out.println("Successfully Inserted");
			} 
			else 
			{
				System.out.println("Insert Failed");
			}
			con.close();
			response.sendRedirect("homepage.html");
		}catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}

