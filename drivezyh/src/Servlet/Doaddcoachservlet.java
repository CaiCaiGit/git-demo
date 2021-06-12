package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Coachlist;
import Service.Coachservice;
import Service.impl.Coachserviceimpl;


@WebServlet("/admin/Doaddcoachservlet")
public class Doaddcoachservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Doaddcoachservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				String coachname=request.getParameter("coachname");
				String coachcard=request.getParameter("coachcard");
				String coachsex=request.getParameter("coachsex");
				String coachph=request.getParameter("coachph");
				String coachdec=request.getParameter("coachdec");
				String coachcar=request.getParameter("coachcar");
				String coachschool=request.getParameter("coachschool");
				String coachmo=request.getParameter("coachmo");
				
				Coachlist coachlist=new Coachlist(0, coachname, coachcard, coachsex, coachph, coachdec, coachcar, coachschool, coachmo);
				Coachservice coachservice =new Coachserviceimpl();
				coachservice.addcoach(coachlist);
				response.sendRedirect(request.getContextPath()+"/admin/Findcoachservlet");
				
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
