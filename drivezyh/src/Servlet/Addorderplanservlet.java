package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Coachlist;
import Entity.Orderadlist;
import Entity.Ordertimelist;
import Service.Coachservice;
import Service.Orderadservice;
import Service.Ordertimeservice;
import Service.impl.Coachserviceimpl;
import Service.impl.Orderadserviceimpl;
import Service.impl.Ordertimeserviceimpl;


@WebServlet("/admin/Addorderplanservlet")
public class Addorderplanservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Addorderplanservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//查询所有的具体时间信息
		Ordertimeservice ordertimeservice=new Ordertimeserviceimpl();
		List<Ordertimelist> ordertime= ordertimeservice.findall();
		//查询所有的教练信息
		Coachservice coachservice=new Coachserviceimpl();
		List<Coachlist> coach=coachservice.findall();
		//查询所有的场地信息
		Orderadservice orderadservice=new Orderadserviceimpl();
		List<Orderadlist> orderad=orderadservice.findall();
		//向request中储存
		request.setAttribute("ordertime", ordertime);
		request.setAttribute("coach", coach);
		request.setAttribute("orderad", orderad);
		
		request.getRequestDispatcher("/admin/addorderplan.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
