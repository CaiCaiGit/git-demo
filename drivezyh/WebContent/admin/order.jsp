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
	<style>
			*{
				text-align: center;
				font-family: "微软雅黑";
			}
			div{
				background-color:lightskyblue;
				border-bottom: 2px solid black;
				width: 1000px;
				height: 30px;
				margin-bottom: 20px;
				border-radius: 5px;
				
			}
			.div1{
				border: 1px solid black;
				background-color: white;
				width: 100px;
				height: 28px;
				margin-left: 10px;
				float: left;
				display: block;
				text-align: center;
				border-bottom: none;
			}
		</style>
	</head>
	<body bgcolor="aliceblue">
		<div> 
           
           	<div class="div1">
           		预约信息
           	</div>
           	<h3>当前管理员：${sessionScope.loginname}</h3>
           	
           	</div>
           		
           	<c:choose>
           		<c:when test="${orderlist[0]==null }">
			<h1 align="center">暂无预约信息</h1>
		</c:when>
			<c:otherwise>
			<table border="1" bordercolor="darkgray"  bgcolor="linen" cellspacing="0"  width="1000px">
			<tr>
				<td colspan="21"><strong>预约信息列表</strong></td>
				
			</tr>		
			<tr>
				<th colspan="1">预约Id </th>
				<th colspan="3">教练名</th>
				<th colspan="3">学员名</th>
				<th colspan="1">预约年</th>
				<th colspan="1">月</th>
				<th colspan="1">日</th>
				<th colspan="3">具体时间</th>
				<th colspan="2">预约科目</th>
				<th colspan="2">预约地点</th>
				<th colspan="3">提交时间</th>
				<th></th>
			</tr>		
			<c:forEach items="${orderlist}" var="order">
					
				<tr align="center">
				<td colspan="1">${order.orderId}</td>
				<td colspan="3">${order.coachname}</td>
				<td colspan="3">${order.username}</td>
				<td colspan="1">${order.orderyear}</td>
				<td colspan="1">${order.ordermonth}</td>
				<td colspan="1">${order.orderday}</td>
				<td colspan="3">${order.ordertime}</td>
				<td colspan="2">${order.ordersec}</td>
				<td colspan="2">${order.orderadname}</td>
				<td colspan="3">${order.oktime}</td>
				<td colspan="1">
					<a href="${pageContext.request.contextPath }/admin/Delorderlistservlet?orderId=${order.orderId}">删除</a>
				</td>
			</tr>
			</c:forEach>
			</table>			
			</c:otherwise>
           	</c:choose>
           
</html>