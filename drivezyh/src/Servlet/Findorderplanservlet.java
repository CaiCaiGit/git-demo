package Servlet;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Orderplanlist;
import Service.Orderplanservice;
import Service.impl.Orderplanserviceimpl;
@WebServlet("/admin/Findorderplanservlet")
public class Findorderplanservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Findorderplanservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Orderplanservice orderplanservice =new Orderplanserviceimpl();
		List<Orderplanlist> orderplanlist=orderplanservice.findall();
		request.setAttribute("orderplanlist", orderplanlist);
		request.getRequestDispatcher("/admin/orderplan.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
