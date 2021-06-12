package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.impl.Coachdaoimpl;
import Entity.Coachlist;
import Service.Coachservice;
import Service.impl.Coachserviceimpl;


@WebServlet("/admin/Findcoachservlet")
public class Findcoachservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Findcoachservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Coachservice coachservice =new Coachserviceimpl();
		List<Coachlist> coachlist=coachservice.findall();
		request.setAttribute("coachlist", coachlist);
		request.getRequestDispatcher("/admin/coach.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
