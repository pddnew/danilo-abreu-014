package edu.pddnew.test.servlet;

import java.io.IOException;
import java.util.Locale;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.jstl.core.Config;

/**
 * Servlet implementation class ChangeLanguage
 */
public class ChangeLanguage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeLanguage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String lang = request.getParameter("lang");
		if(lang==null) response.sendRedirect("index.jsp");
		
		Locale locale = null;
		if(lang.contains("pt"))
			locale = new Locale("pt", "BR");
		else if(lang.contains("ko"))
			locale = Locale.KOREA;
		else
			locale = new Locale(lang);
		
		Config.set(request.getSession(), Config.FMT_LOCALE, locale);
		Config.set(request.getSession(), Config.FMT_FALLBACK_LOCALE, locale);
		
		response.sendRedirect("index.jsp");
	}
}
