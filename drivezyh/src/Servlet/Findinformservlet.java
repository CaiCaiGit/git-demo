package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Inform;
import Service.Informservice;
import Service.impl.Informserviceimpl;


@WebServlet("/admin/Findinformservlet")
public class Findinformservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Findinformservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Informservice informservice =new Informserviceimpl();
		List<Inform> informlist=informservice.findall();
		//向requst中存入数据
		request.setAttribute("informlist", informlist);
		request.getRequestDispatcher("/admin/form.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
