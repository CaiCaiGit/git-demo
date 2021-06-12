package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Orderlist;
import Service.Orderlistservice;
import Service.impl.Orderlistserviceimpl;


@WebServlet("/admin/Findorderlistservlet")
public class Findorderlistservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Findorderlistservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Orderlistservice orderlistservice=new Orderlistserviceimpl();
		List<Orderlist> orderlist=orderlistservice.findall();
		request.setAttribute("orderlist", orderlist);
		request.getRequestDispatcher("/admin/order.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
