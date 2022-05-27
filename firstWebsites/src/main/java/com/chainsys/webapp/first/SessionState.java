package com.chainsys.webapp.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SessionState
 */
public class SessionState extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionState() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.println("<html><head> <title>Attributes</title></head><body>");
		String submitValue = request.getParameter("submit");
		HttpSession session=request.getSession(true);
		System.out.println(session.getId());
		if(submitValue.equals("result"))
		{
			//response.sendRedirect("Result");
	//	response.sendRedirect("http://www.google.com");
			RequestDispatcher rd=request.getRequestDispatcher("Result");
			rd.forward(request, response);
			
		}
		else if (submitValue.equals("set")) {
			String salaryInput = request.getParameter("salary");
			session.setAttribute("salary",salaryInput);//store data in session scope
			out.println("<h1>Value Set</h1>"+salaryInput);
		} else if (submitValue.equals("fetch")) {
			String sessionSalary = (String) session.getAttribute("salary");
			//String sessionSalary = session.getAttribute("salary").toString();
			 if (sessionSalary == null) {
		    		out.print("<h1> SESSION NOT YET SET!!! </h1>");
		     }
		    		else {
		    		out.print("<h1>Value Fetched</h1>" + sessionSalary);//returning value fro
		    		}
		    		}
		    		out.println("</body></html>");
		    		// single user httpsession create, and can be // read or modified from all other servlets.
		    		}	
	
	}


