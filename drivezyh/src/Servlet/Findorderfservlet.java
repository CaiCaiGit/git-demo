package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Orderplanlist;
import Service.Orderplanservice;
import Service.impl.Orderplanserviceimpl;


@WebServlet("/user/Findorderfservlet")
public class Findorderfservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Findorderfservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Orderplanservice orderplanservice=new Orderplanserviceimpl();
		List<Orderplanlist> orderplanlist=orderplanservice.findall();
		request.setAttribute("orderplanlist", orderplanlist);
		//自动跳转页面 请求转发，将对象中的数据传递到下一页面
		request.getRequestDispatcher("/user/orderf.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
