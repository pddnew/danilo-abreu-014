package edu.pddnew.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.Days;
import org.joda.time.LocalDate;
import org.joda.time.Months;
import org.joda.time.Years;

import edu.pddnew.test.bean.SomethingAging;
import edu.pddnew.test.resource.SomethingAgingResource;

/**
 * Servlet implementation class AgingServlet
 */
public class AgingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SomethingAgingResource rs = new SomethingAgingResource();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 proccessRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		proccessRequest(request, response);
	}

	protected void proccessRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/plain; charset=ISO-8859-1");
		response.setHeader("Cache-control", "no-cache");
		PrintWriter pw = response.getWriter();
		Random ran = new Random();
		SomethingAging s = new SomethingAging();
		s.setBegin(new Date());
		s.setEnd(new Date(System.currentTimeMillis()-ran.nextLong()/10000000));
		Years y = Years.yearsBetween(new LocalDate(s.getBegin().getTime()), 
				new LocalDate(s.getEnd().getTime()));
		
		Months m = Months.monthsBetween(new LocalDate(s.getBegin().getTime()), 
				new LocalDate(s.getEnd().getTime()));
		
		Days d = Days.daysBetween(new LocalDate(s.getBegin().getTime()), 
				new LocalDate(s.getEnd().getTime()));
		s.setHowManyYears(y.getYears());
		s.setHowManyMonths(m.getMonths());
		s.setHowManyDays(d.getDays());
		String json = rs.toJSON(s);
		pw.print(json);
		pw.flush();
		pw.close();
	}
}
