package EadAssignment3;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Addstudent
 */
@WebServlet("/Addstudent")
public class Addstudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException	{
		PrintWriter show = response.getWriter();
		try 
		{
			
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root"); 
			PreparedStatement ps=con.prepareStatement(" select * from sdatabase;");
			ResultSet resultSet = ps.executeQuery();
			
			show.print("<html><head><title>Students</title></head><body>");
			show.print("<table border = '2'>");
			show.print("<tr><th>FirstName</th><th>LastName</th><th>Father'sName</th><th>Email</th><th>Age</th><th>Class</th></tr" + ">");
			while (resultSet.next()) 
			{ 
				
				
				show.print("<tr><form><td>" + resultSet.getString(1) + "</td><td>"
						+ resultSet.getString(2) + "</td><td>" + resultSet.getString(3) + "</td><td >"
						+ resultSet.getString(4) + "</td><td>" + resultSet.getString(5) + "</td><td>"
                        + resultSet.getString(6) +  "</td><td></form><button> <a href='update.html'</a>update</button></td></tr>");
			}
			
		}catch (SQLException e) 
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.setStackTrace(null);
		}
	}
}

