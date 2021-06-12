package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Orderlist;
import Service.Orderfservice;
import Service.Orderlistservice;
import Service.impl.Orderfserviceimpl;
import Service.impl.Orderlistserviceimpl;

@WebServlet("/user/Findorderlistfservlet")
public class Findorderlistfservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Findorderlistfservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Orderlistservice orderlistservic=new Orderlistserviceimpl();
		List<Orderlist> orderlist=orderlistservic.findall();
		request.setAttribute("orderlist", orderlist);
		//自动跳转页面 请求转发，将对象中的数据传递到下一页面
		request.getRequestDispatcher("/user/orderlistf.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
