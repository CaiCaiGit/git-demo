package Servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.Userservice;
import Service.impl.Userserviceimpl;


@WebServlet("/admin/Deluserservlet")
public class Deluserservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Deluserservlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取员工编号 ，根据标识码删除
		int userId=Integer.parseInt(request.getParameter("userId"));
		//2.调用业务层，根据标识码删除
		Userservice userservice = new Userserviceimpl();
		userservice.deleteByUserId(userId);
		//当前页面刷新
		response.sendRedirect(request.getContextPath()+"/admin/finduserservlet");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
