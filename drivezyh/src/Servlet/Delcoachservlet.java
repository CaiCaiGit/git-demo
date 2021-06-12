package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.Coachservice;
import Service.impl.Coachserviceimpl;


@WebServlet("/admin/Delcoachservlet")
public class Delcoachservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Delcoachservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int coachId=Integer.parseInt(request.getParameter("coachId"));
		Coachservice coachservice=new Coachserviceimpl();
		coachservice.deleteBycoachId(coachId);
		response.sendRedirect(request.getContextPath()+"/admin/Findcoachservlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
