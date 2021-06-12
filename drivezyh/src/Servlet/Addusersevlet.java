package Servlet;

import java.util.List;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.UserList;
import Service.Userservice;
import Service.impl.Userserviceimpl;


@WebServlet("/admin/Addusersevlet")
public class Addusersevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Addusersevlet() {
        super();

    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//请求转发到添加页面
		response.sendRedirect(request.getContextPath()+"/admin/addnewuser.jsp");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
