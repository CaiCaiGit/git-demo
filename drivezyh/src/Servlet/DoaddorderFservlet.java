package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Orderlist;
import Service.Orderfservice;
import Service.impl.Orderfserviceimpl;

@WebServlet("/user/DoaddorderFservlet")
public class DoaddorderFservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public DoaddorderFservlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String coachname=request.getParameter("coachname");
		String username=request.getParameter("username");
		String orderyear=request.getParameter("orderyear");
		String ordermonth=request.getParameter("ordermonth");
		String orderday=request.getParameter("orderday");
		String ordertime=request.getParameter("ordertime");
		String ordersec=request.getParameter("ordersec");
		String orderadname=request.getParameter("orderadname");
		Orderlist orderlist=new Orderlist(0, coachname, username, orderyear, ordermonth, orderday, ordertime, ordersec, orderadname, null);
		Orderfservice orderfservice=new Orderfserviceimpl();
		orderfservice.addorderf(orderlist);
		response.sendRedirect(request.getContextPath()+"/user/Findorderlistfservlet");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
