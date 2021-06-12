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

@WebServlet("/admin/Doupdatecoachservlet")
public class Doupdatecoachservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Doupdatecoachservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int coachId=Integer.parseInt(request.getParameter("coachId"));
		String coachname=request.getParameter("coachname");
		String coachcard=request.getParameter("coachcard");
		String coachsex=request.getParameter("coachsex");
		String coachdec=request.getParameter("coachdec");
		String coachcar=request.getParameter("coachcar");
		String coachmo=request.getParameter("coachmo");
		
		Coachlist coachlist=new Coachlist(coachId,coachname,coachcard,coachsex,null,coachdec,coachcar,null,coachmo);
		Coachservice coachservice=new Coachserviceimpl();
		coachservice.updatecoach(coachlist);
		response.sendRedirect(request.getContextPath()+"/admin/Findcoachservlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
