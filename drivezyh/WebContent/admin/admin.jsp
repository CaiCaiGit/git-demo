<%@page import="java.sql.ResultSet"%>
<%@page import="zyh.DBUtil"%>
<%@page import="java.sql.Connection"%>
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
           		管理员信息
           	</div>
            	<h3>当前管理员：${sessionScope.loginname}</h3>
           	</div>
          
          <c:choose>
          <c:when test="${admin[0]==null }">
          	<h1 align="center">暂无管理员信息</h1>
          </c:when>
          	<c:otherwise>
          	<table border="1" bordercolor="darkgray"  bgcolor="linen" cellspacing="0"  width="1000px">
			<tr>
				<td colspan="28"><strong>管理员信息列表</strong></td>
			</tr>		
			<tr>
				<th colspan="3">管理员Id </th>
				<th colspan="3">管理员姓名</th>
			</tr>
			<c:forEach items="${admin}" var="ad">
			<tr align="center">
			<td colspan="3">${ad.adminId}</td>
			<td colspan="3">${ad.adminname}</td>
			</tr>
			</c:forEach>
			</table>
          	</c:otherwise>
          </c:choose>
	</body>
</html>