<%@page import="java.sql.ResultSet"%>
<%@page import="zyh.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
	</head>
	<body>  
	<c:choose>
           <c:when test="${userlist[0]==null }">
			<h1 align="center">暂无学员信息</h1>
			</c:when>
           <c:otherwise>
           
			<table border="1" bordercolor="darkgray"  bgcolor="linen" cellspacing="0"  width="1000px">
			<tr>
				<td colspan="30"><strong>学员信息列表</strong></td>	
			</tr>		
			<tr>
				
				<th colspan="3">姓名</th>
				<th colspan="3">身份证</th>
				<th colspan="3">所属驾校</th>
				<th colspan="3">学习科目</th>
				<th colspan="4">手机号</th>
				
			</tr>
			<c:forEach items="${userlist}" var="user">
				<tr align="center">
				<td colspan="3">${user.username}</td>
				<td colspan="3">${user.usercard }</td>
				<td colspan="3">${user.userschool}</td>
				<td  colspan="4">${user.userdec }</td>
				<td  colspan="1">${user.usermo }</td>
	</tr>
			</c:forEach>	
			</table>	
           </c:otherwise>
           </c:choose>
  	
		
		
	</body>
</html>