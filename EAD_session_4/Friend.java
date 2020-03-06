package ead_4;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 * Servlet implementation class Friend
 */
@WebServlet("/Friend")
public class Friend extends HttpServlet
{
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter show = response.getWriter();
		  HttpSession session=request.getSession();  
	        String s=(String)session.getAttribute("company");  
	    
	        try 
			{
				
				Class.forName("com.mysql.jdbc.Driver");  
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee","root","root"); 
				PreparedStatement ps=con.prepareStatement(" select * from user join vehicle where user.empid=vehicle.empid;");
				ResultSet resultSet = ps.executeQuery();
				show.print("<html><head><title>Students</title></head><body>");
				show.print("<table border = '2'>");
				show.print("<tr><th>FullName</th><th>Gender</th><th>Email</th><th>Organization</th><th>Password</th><th>Mobile No.</th>"
						+ "<th>Vehicle_cname</th><th>Vehicle Type</th><th>Vehicle no</th><th>Description</th><th>empid</th></tr>");
				while (resultSet.next())
				{
					
					
						if(resultSet.getString(3).equals(s))
						{	
							show.print("<tr><form >"+ 
										"<td>" +resultSet.getString(1) + 
										"</td><td>" + resultSet.getString(2) + 
										"</td><td>" + resultSet.getString(4) + 
										"</td><td>" + resultSet.getString(3) + 
										"</td><td>" + resultSet.getString(5) + 
										"</td><td>" + resultSet.getString(7) + 
										"</td><td>" + resultSet.getString(9) + 
										"</td><td>" + resultSet.getString(10) + 
										"</td><td>" + resultSet.getString(11) +
										"</td><td>" + resultSet.getString(12) +
										"</td><td>" + resultSet.getString(13) +
										"</td><td></form>"+
										"<button> <a href='registration.html'</a>update</button></td></tr>");
						}
				}
			}
			catch (SQLException e) 
			{
				e.printStackTrace();
			}
	        catch (ClassNotFoundException e)
	        {
	        	e.setStackTrace(null);
	        }
	}
}

