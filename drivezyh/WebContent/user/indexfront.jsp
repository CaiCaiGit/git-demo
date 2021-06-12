<%@page import="java.security.interfaces.RSAKey"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="zyh.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	
	</head>
	<body >
		<form  action="${pageContext.request.contextPath }/UserLoginServlet" target="post">
		<div class="a" align="center" >
		身份证号：	<input type="text" name="usercard" >
		<br/>
		<br/>
		<br/>
		
		密码：          <input type="password"  name="userpw">
		<br/>
		<input type="submit" value="登录"><img src="img/login.png">
		</div>
		</form>
</body>
</html>