package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.impl.Coachdaoimpl;
import Entity.Coachlist;
import Service.Coachservice;
import Service.impl.Coachserviceimpl;


@WebServlet("/admin/Updatecoachservlet")
public class Updatecoachservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Updatecoachservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int coachId=Integer.parseInt(request.getParameter("coachId"));
		Coachservice coachservice=new Coachserviceimpl();
		Coachlist coachlist=coachservice.findcoachbyid(coachId);
		request.setAttribute("coachlist", coachlist);
		request.getRequestDispatcher("/admin/upcoach.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
