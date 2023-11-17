import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/singup")
public class sign_up extends HttpServlet {

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String pass,email;
            email=request.getParameter("email");
            pass=request.getParameter("pass");
           Connection con;
            
            Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/algolab","root","1404");
            //Statement stmt=con.createStatement();  
            //ResultSet rs=stmt.executeQuery("select email,pass from users where email=? and pass=?");  
  PreparedStatement ps = con.prepareStatement("select email,pass from users where email=? and pass=?");
  ps.setString(1, email);
  ps.setString(2, pass);
  ResultSet rs=ps.executeQuery();
//getting the record of 3rd row 
if(rs.next())
        {
       
        
        response.sendRedirect("Home.html");
        }
        else
        {
                System.out.println("ENTER CORRECT USER NAME AND PASSWORD");
                RequestDispatcher rd=request.getRequestDispatcher("error.jsp");
                rd.include(request, response);
        }
            con.close();  
    } 
     catch (SQLException ex) {
            System.out.println("compler");
        } catch (Exception ex) {
            System.out.println("compler");
        }
    }

   
}