package Servlet;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Service.impl.Userpageservletimpl;
import Service.impl.Userserviceimpl;


@WebServlet("/admin/Userpageservlet")
public class Userpageservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Userpageservlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int everyPage=5;
		int totalCount =1 ;
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
