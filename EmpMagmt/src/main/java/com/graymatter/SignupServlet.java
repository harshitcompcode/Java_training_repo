package com.graymatter;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignupServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
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
        String name = request.getParameter("name");
        String mobileNo = request.getParameter("mobileNo");
        String password = request.getParameter("password");
        RequestDispatcher dispatcher;
        try {
            DataSource ds = new DataSource();
            try (Connection con = ds.getConnection()) {
                String query = "INSERT INTO User (Email, Name, MobileNo, Password) VALUES (?, ?, ?, ?)";
                try (PreparedStatement ps = con.prepareStatement(query)) {
                    ps.setString(1, email);
                    ps.setString(2, name);
                    ps.setString(3, mobileNo);
                    ps.setString(4, password);
                    ps.executeUpdate();
                }
            }
//            
            dispatcher  = request.getRequestDispatcher("Login.jsp");
			dispatcher.forward(request,response);
        } catch ( ClassNotFoundException| SQLException e) {
            e.printStackTrace();
//            
            dispatcher  = request.getRequestDispatcher("Signup.jsp");
			dispatcher.forward(request,response);
        }
    }

}
