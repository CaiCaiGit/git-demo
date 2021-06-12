<%@page import="java.security.interfaces.RSAKey"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="zyh.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
			.a{
				border: 1px solid white;
				width: 500px;
				height: 300px;
				background-color: #FFFFFF;
				position: absolute;
				top:200px;
				left: 500px;
				text-align:center;
			}
			body{      

        background-image: url(img/login-content-bg.gif);      

        background-size:cover;    /*铺满覆盖*/

     }      
		</style>
	</head>
	<body >
	
	<!-- 根目录绝对路径
		1.链接，表单action，客户端重定向 根目录（项目名称）/URL
		2.请求转发/URL
	 -->
	<form action="${pageContext.request.contextPath }/LoginServlet" method="post">
		<div class="a" >
		账号：	<input type="text" name="adminId" >
		<br/>
		<br/>
		<br/>
		密码：          <input type="password"  name="adminpw">
		<br/>
		<input type="submit"  value="登录">&nbsp;<img src="img/login.png">
		</div>
		</form>
	</body>
</html>