package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Inform;
import Service.Informservice;
import Service.impl.Informserviceimpl;


@WebServlet("/admin/Doaddinformsevlet")
public class Doaddinformsevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Doaddinformsevlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String inforname =request.getParameter("Inforname");
			String infordec = request.getParameter("Infordec");
			Inform inform=new Inform(0, inforname, infordec, null);
			Informservice informservice=new Informserviceimpl();
			informservice.addInform(inform);
			response.sendRedirect(request.getContextPath()+"/admin/Findinformservlet");

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
