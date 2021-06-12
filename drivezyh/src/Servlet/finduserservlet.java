package Servlet;

import java.util.List;
import java.io.IOException;

import javax.print.attribute.standard.RequestingUserName;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.UserList;
import Service.Userservice;
import Service.impl.Userserviceimpl;


@WebServlet("/admin/finduserservlet")
public class finduserservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public finduserservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//调用业务层
		Userservice userservice = new Userserviceimpl();
		List<UserList>	userlist=userservice.findall();
		//向requst中存入数据
		request.setAttribute("userlist", userlist);
		//自动跳转页面 请求转发，将对象中的数据传递到下一页面
		request.getRequestDispatcher("/admin/user.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
