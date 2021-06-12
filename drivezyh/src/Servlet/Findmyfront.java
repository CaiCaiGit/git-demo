package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import Entity.UserList;
import Service.Userservice;
import Service.impl.Userserviceimpl;


@WebServlet("/user/Findmyfront")
public class Findmyfront extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Findmyfront() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usercard= request.getParameter("usercard");
		Userservice userservice=new Userserviceimpl();
		UserList userlist=userservice.finduserbycard(usercard);
		request.setAttribute("userlist", userlist);
		request.getRequestDispatcher("/user/myfront.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
