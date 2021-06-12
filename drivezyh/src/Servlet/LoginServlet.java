package Servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import Entity.Admin;
import Service.Adminservice;
import Service.impl.Adminserviceimpl;
import zyh.DBUtil;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//请求
		//获取用户名，密码
		int  adminId=Integer.parseInt(request.getParameter("adminId"));
		String  adminpw=request.getParameter("adminpw");
		//调用业务层
		Adminservice adminservice =new Adminserviceimpl();
		Admin admin =adminservice.findByNaP(adminId, adminpw);
		String adminname = null ;
		//根据行为进行不同的响应
		if(admin==null) {
			request.setAttribute("error", "登录失败！");
			request.getRequestDispatcher("/errorlogin.jsp").forward(request, response);
		}
		else {
			//获取Session
			Connection conn =DBUtil.getConn();
			try {
				String sql="select adminname from admin where adminId=? ";
				ResultSet rs=DBUtil.executeQuery(sql, conn, adminId);
				while(rs.next()) {
					adminname=new String(rs.getString("adminname"));
				}
				HttpSession session =request.getSession();
				//向Session存入数据
				session.setAttribute("adminId", adminId);
				session.setAttribute("loginname", adminname);
				response.sendRedirect(request.getContextPath()+"/admin/main.jsp");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
