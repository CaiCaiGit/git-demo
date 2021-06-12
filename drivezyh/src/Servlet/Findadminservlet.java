package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.Admin;
import Entity.UserList;
import Service.Adminservice;
import Service.impl.Adminserviceimpl;

/**
 * Servlet implementation class Findadminservlet
 */
@WebServlet("/admin/Findadminservlet")
public class Findadminservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Findadminservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			Adminservice adminservice = new Adminserviceimpl();
			List<Admin> admin =adminservice.findalladmin();
			//向requst中存入数据
			request.setAttribute("admin", admin);
			//自动跳转页面 请求转发，将对象中的数据传递到下一页面
			request.getRequestDispatcher("/admin/admin.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
