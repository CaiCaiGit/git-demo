package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Entity.UserList;
import Service.Userservice;
import Service.impl.Userserviceimpl;

@WebServlet("/admin/Updateusersevlet")
public class Updateusersevlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Updateusersevlet() {
        super();
  
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//得到要修改的学员编号
		int userId=Integer.parseInt(request.getParameter("userId"));
		//调用业务层根据编号查询学员信息
		Userservice userservice = new Userserviceimpl();
		UserList userlist =userservice.finduserbyid(userId);
		//存储requset
		request.setAttribute("userlist", userlist);
		//请求转发到下一页面
		request.getRequestDispatcher("upright.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
