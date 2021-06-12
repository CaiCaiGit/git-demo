package Adminfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebFilter(filterName="Loginfilter" ,urlPatterns="/admin/*" )
public class Loginfilter implements Filter {

    
    public Loginfilter() {
    	
    }


	public void destroy() {

	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request2=(HttpServletRequest) request;
		HttpServletResponse response2=(HttpServletResponse) response;
		HttpSession session=request2.getSession();
		if (session.getAttribute("adminId")==null) {
			request.setAttribute("error", "没有登录，请先登录！");
			request.getRequestDispatcher("/errorlogin.jsp").forward(request, response);
		}
		else{
			//继续提交请求
			chain.doFilter(request, response);
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {

	}

}
