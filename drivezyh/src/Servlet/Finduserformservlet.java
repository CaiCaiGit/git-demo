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

@WebServlet("/user/Finduserformservlet")
public class Finduserformservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public Finduserformservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Informservice informservice=new Informserviceimpl();
		List<Inform> inform=informservice.findall();
		request.setAttribute("inform", inform);
		//自动跳转页面 请求转发，将对象中的数据传递到下一页面
		request.getRequestDispatcher("/user/formfront.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
