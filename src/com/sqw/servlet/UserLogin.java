package com.sqw.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sqw.dao.UserDao;
import com.sqw.dao.impl.UserDaoimpl;
import com.sqw.model.User;

/**
 * Servlet implementation class UserLogin
 */
@WebServlet("/userlogin")
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		UserDao ud = new UserDaoimpl();
		User u = new User();
		u = ud.login(u);
		PrintWriter out = response.getWriter();
		int stat = u.getStat();
		if(stat > 0){
//			HttpSession s = request.getSession();
//			s.setAttribute("user", u);
			out.println("{\"stat\":" + stat + ",\"user\"" + u.toString() + "}");
		} else {
			out.println("{\"stat\":" + stat + "}");
		}
	}

}
