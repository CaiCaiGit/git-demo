package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Entity.UserList;
import Service.Userloginservice;
import Service.impl.Userloginserviceimpl;
import zyh.DBUtil;

/**
 * Servlet implementation class UserLoginServlet
 */
@WebServlet("/UserLoginServlet")
public class UserLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     
    public UserLoginServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String usercard=request.getParameter("usercard");
		String userpw=request.getParameter("userpw");
		String username=null;
		Userloginservice userloginservice=new Userloginserviceimpl();
		UserList userList=userloginservice.findBycap(usercard, userpw);
		if(userList==null) {
			request.setAttribute("error", "登录失败！");
			request.getRequestDispatcher("/erroruserlogin.jsp").forward(request, response);
		}else {
			//获取Session
			Connection conn =DBUtil.getConn();
			try {
				String sql="select username from userlist where usercard=? ";
				ResultSet rs=DBUtil.executeQuery(sql, conn, username);
				while(rs.next()) {
					username=new String(rs.getString("username"));
				}
				HttpSession session =request.getSession();
				//向Session存入数据		
				session.setAttribute("usercard", usercard);
				session.setAttribute("username", username);
				response.sendRedirect(request.getContextPath()+"/user/mainfront.jsp");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
