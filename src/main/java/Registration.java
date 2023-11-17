import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Registration")
public class Registration extends HttpServlet {

 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String fname,pass,mnumber,email;
            
            fname=request.getParameter("fname");
            email=request.getParameter("email");
            mnumber=request.getParameter("mnumber");
            pass=request.getParameter("pass");
            //times=request.getParameter("times");Result
           Connection conn;
           RequestDispatcher rd;
         
            try {
                
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/algolab","root","1404");
               PreparedStatement ps = conn.prepareStatement("insert into users values(?,?,?,?)");
               ps.setString(1,fname);
               ps.setString(2,email);
               ps.setString(3,mnumber);
               ps.setString(4,pass);
                
              
              System.out.println("New Record Added successfully"); 
             
                ps.executeUpdate();
                 conn.close();
               ps.close();
                rd=request.getRequestDispatcher("Home.html");
                rd.forward(request, response);
              
                
                
            }
               
            
            catch(SQLException e)
                {
                 System.out.println(e);
                }
          
        }
          catch (Exception e)
	{
         System.out.println("Exception");
	}
    }
    
  
}