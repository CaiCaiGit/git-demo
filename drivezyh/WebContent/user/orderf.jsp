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
	
		<table border="1" cellpadding="0" cellspacing="0" align="center" >
			<tr>
				<td >
					按时间查找：
				</td>
				<td>
					<input type="text" name="ordertime"/>
				</td>
				<td>
					<input type="submit" value="查找" />
				</td>
			</tr>
		</table>
		<br/>
		<br/>
		<br/>
		<c:choose>
		<c:when test="${orderplanlist[0]==null }">
			<h1 align="center">暂无预约安排信息</h1>
		
		</c:when>
		<c:otherwise >
		<form action="${pageContext.request.contextPath }/user/DoaddorderFservlet" method="post" >
		<table border="1" cellpadding="0" cellspacing="0" align="center">
			<tr  >
				<td>预约安排ID</td>
				<td>年</td>
				<td>月</td>
				<td>日</td>
				<td>具体时间</td>
				<td>教练</td>
				<td>练车场地</td>
				<td>预约科目</td>
				<td></td>
			</tr>
			<c:forEach  items="${orderplanlist }" var="orderplan">
			<tr>	
				<td><input type="text" name="orderplanId" value="${orderplan.orderplanId}" ></td>
				<td><input type="text" name="orderyear" value="${orderplan.orderyear}" ></td>
				<td><input type="text" name="ordermonth" value="${orderplan.ordermonth}" ></td>
				<td><input type="text" name="orderday" value="${orderplan.orderday}" ></td>
				<td><input type="text" name="ordertime" value="${orderplan.ordertime}" ></td>
				<td><input type="text" name="coachname" value="${orderplan.coachname}" ></td>
				<td><input type="text" name="orderadname" value="${orderplan.orderadname}"></td>
				<td><input type="text" name="ordersec" value="${orderplan.ordersec}" ></td>
				<td><input type="submit" value="预约"></td>
				</tr>
			</c:forEach>
			</table>
			</form>
		</c:otherwise>
		</c:choose>
	
	</body>
</html>