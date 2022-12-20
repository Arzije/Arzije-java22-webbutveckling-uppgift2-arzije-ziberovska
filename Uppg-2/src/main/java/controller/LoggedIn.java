package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Person;


@WebServlet("/LoggedIn")
public class LoggedIn extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person person1 = new Person("Jean", "jean");
		Person person2 = new Person("Joe", "joe");
		
		if (!request.getParameter("username").equals(person1.getUsername()) && 
			!request.getParameter("password").equals(person1.getPassword()) &&
			
			!request.getParameter("username").equals(person2.getUsername()) && 
			!request.getParameter("password").equals(person2.getPassword())) {
			
			request.setAttribute("wrong", "Sorry, the username or password is incorrect. Please try again.");

			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		
		}else {	
			HttpSession session = request.getSession();

			session.setAttribute("correctUser", new Person(request.getParameter("username"), request.getParameter("password")));

			RequestDispatcher rd = request.getRequestDispatcher("/view/logInSuccess.jsp");
			rd.forward(request, response);
		}
	}
}
