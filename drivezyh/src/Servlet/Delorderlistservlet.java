package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.Orderlistservice;
import Service.impl.Orderlistserviceimpl;


@WebServlet("/admin/Delorderlistservlet")
public class Delorderlistservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Delorderlistservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int orderId=Integer.parseInt(request.getParameter("orderId"));
		Orderlistservice orderlistservice=new Orderlistserviceimpl();
		orderlistservice.deletebyorderId(orderId);
		response.sendRedirect(request.getContextPath()+"/admin/Findorderlistservlet");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
