package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.impl.Informdaoimpl;
import Service.Informservice;
import Service.impl.Informserviceimpl;

@WebServlet("/admin/Delinformservlet")
public class Delinformservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Delinformservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int Informid=Integer.parseInt(request.getParameter("Informid"));
		Informservice informservice=new Informserviceimpl();
		informservice.deleteByInformId(Informid);
		response.sendRedirect(request.getContextPath()+"/admin/Findinformservlet");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
