package edu.pddnew.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.pddnew.test.resource.PersonResource;

/**
 * Servlet implementation class PersonServlet
 */
public class PersonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	PersonResource pm = new PersonResource();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PersonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String json = pm.toJSON();
		response.setContentType("text/plain; charset=ISO-8859-1");
		response.setHeader("Cache-control", "no-cache");
		PrintWriter pw = response.getWriter();
		pw.print(json);
		pw.flush();
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
