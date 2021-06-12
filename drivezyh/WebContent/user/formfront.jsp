<%@page import="java.sql.ResultSet"%>
<%@page import="zyh.DBUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

	</head>
	<body>
		
		<c:choose>
		<c:when test="${inform[0]==null }">
			<h1 align="center">暂无通知信息</h1>
		
		</c:when>
		<c:otherwise >
		<table border="1" cellpadding="1" cellspacing="0" align="center">
			<tr >
				<td>通知ID</td>
				<td>通知名</td>
				<td>通知内容</td>
				<td>通知时间</td>
			</tr>
			<c:forEach items="${inform }" var="inform">
				<td>${inform.informid}</td>
				<td>${inform.inforname}</td>
				<td>${inform.infordec}</td>
				<td>${inform.infortime}</td>
			</c:forEach>
			</table>
		</c:otherwise>
		</c:choose>
		
	</body>
</html>