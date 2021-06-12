package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Orderplanlist;
import Service.Orderplanservice;
import Service.impl.Orderplanserviceimpl;


@WebServlet("/admin/Doaddorderplanservlet")
public class Doaddorderplanservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Doaddorderplanservlet() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String ordertime=request.getParameter("ordertime");
		String coachname=request.getParameter("coachname");
		String orderadname=request.getParameter("orderadname");
		String ordersec=request.getParameter("ordersec");
		int orderyear=Integer.parseInt(request.getParameter("orderyear"));
		int ordermonth=Integer.parseInt(request.getParameter("ordermonth"));
		int orderday=Integer.parseInt(request.getParameter("orderday"));

		Orderplanlist orderplanlist=new Orderplanlist(0, orderyear,ordermonth,orderday, ordertime, coachname, orderadname, ordersec);
		Orderplanservice orderplanservice=new Orderplanserviceimpl();
		orderplanservice.addorderplan(orderplanlist);
		response.sendRedirect(request.getContextPath()+"/admin/Findorderplanservlet");


		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
