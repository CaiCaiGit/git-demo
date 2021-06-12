package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.UserList;
import Service.Userservice;
import Service.impl.Userserviceimpl;

@WebServlet("/admin/Doaddusersevlet")
public class Doaddusersevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Doaddusersevlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户填写的数据
		
		String username = request.getParameter("username");
		
		String usercard =request.getParameter("usercard") ;
		String userpw =request.getParameter("userpw");
		String userschool= request.getParameter("userschool");
		String userdec =request.getParameter("userdec");
		int usermo =Integer.parseInt(request.getParameter("usermo"));
		
		//封装
		UserList userlist =new UserList(0,username,usercard,userpw,userschool,userdec,usermo);
		//调用业务层进行添加
		Userservice userservice =new Userserviceimpl();
		userservice.addUser(userlist);
		
		response.sendRedirect(request.getContextPath()+"/admin/finduserservlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
