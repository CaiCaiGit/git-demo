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
		<c:when test="${orderlist[0]==null }">
			<h1 align="center">暂无预约信息</h1>
		
		</c:when>
			<c:otherwise>
			<table border="1" cellpadding="1" cellspacing="0" align="center">
			<tr>
				<td>预约ID</td>
				<td>教练名</td>
				<td>用户名</td>
				<td>年</td>
				<td>月</td>
				<td>日</td>
				<td>具体时间</td>
				<td>预约科目</td>
				<td>练车场地</td>
				<td>完成时间</td>
			</tr>
			<c:forEach items="${orderlist }" var="orderlist">
			<tr>
				<td>${orderlist.orderId}</td>
				<td>${orderlist.coachname}</td>
				<td>${orderlist.username}</td>
				<td>${orderlist.orderyear}</td>
				<td>${orderlist.ordermonth}</td>
				<td>${orderlist.orderday}</td>
				<td>${orderlist.ordertime}</td>
				<td>${orderlist.ordersec}</td>
				<td>${orderlist.orderadname}</td>
				<td>${orderlist.oktime}</td>
				</tr>
			</c:forEach>
			</table>
			</c:otherwise>
		</c:choose>
		
		
	</body>
</html>