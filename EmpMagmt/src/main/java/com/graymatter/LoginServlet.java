package com.graymatter;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.cj.protocol.Resultset;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        RequestDispatcher dispatcher;
        PreparedStatement ps;
        String query = "SELECT * FROM User WHERE Email = ? AND Password = ?";
        try {
            DataSource ds = new DataSource();
            Connection con = ds.getConnection();
                
                ps = con.prepareStatement(query);
                	
                	
                    ps.setString(1, email);
                    ps.setString(2, password);
                    ResultSet rs = ps.executeQuery();
                    
                    if(rs.next()) {
                    	dispatcher  = request.getRequestDispatcher("Welcome.jsp");
            			dispatcher.forward(request,response);
                    }
                    
                    
            }
         catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.sendRedirect("Login.jsp?error=1");
        }
    }

}
