<%@page import="Entity.UserList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
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
           		学员信息
           	</div>
           	<h3>当前管理员：${sessionScope.loginname}</h3>
           	</div>
	<c:choose>
		<c:when test="${userlist[0]==null }">
			<h1 align="center">暂无学员信息</h1>
		</c:when>
		<c:otherwise>
		<table border="1" bordercolor="darkgray"  bgcolor="linen" cellspacing="0"  width="1000px">
			<tr>
				<td colspan="33"><strong>学员信息列表</strong></td>
			</tr>		
			<tr>
				<th colspan="3">用户Id</th>
				<th colspan="3">姓名</th>
				
				<th colspan="1">身份证</th>
				<th colspan="3">密码</th>
				<th colspan="2">驾校名</th>
				<th colspan="1">科目</th>
				<th colspan="2">手机号</th>
				<th></th>
				<th></th>
			</tr>	
			<c:forEach items="${userlist }" var="user">
			<tr align="center">
				<td colspan="3">${user.userId}</td>
				<td colspan="3">${user.username}</td>
				<td colspan="1">${user.usercard}</td>
				<td colspan="3">${user.userpw}</td>
				<td colspan="2">${user.userschool}</td>
				<td colspan="1">${user.userdec}</td>
				<td colspan="2">${user.usermo}</td>
				<td colspan="1">
				<a href="${pageContext.request.contextPath }/admin/Updateusersevlet?userId=${user.userId}">修改</a>
				</td>
				<td colspan="1">
				<a href="${pageContext.request.contextPath }/admin/Deluserservlet?userId=${user.userId}">删除</a>
				</td>
				
			</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
	
	
	
	
		
</body>
</html>