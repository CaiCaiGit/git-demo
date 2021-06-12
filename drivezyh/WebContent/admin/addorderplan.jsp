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
				font-family: "微软雅黑";
			}
			.t{
				text-align: right;
				border-right: none;
				width: 300px;
			}
			.t1{
				border-left: none;
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
				width: 80px;
				height: 28px;
				margin-left: 10px;
				float: left;
				display: block;
				text-align: center;
				border-bottom: none;
			}
			
		</style>
	</head>
	<body  bgcolor="aliceblue"> 
          
           
             <div> 
           	
           	<div class="div1">
           		添加新学员
           	</div>
           	<h3>当前管理员：${sessionScope.loginname}</h3>
           	</div>
           	 
		<form action="${pageContext.request.contextPath }/admin/Doaddorderplanservlet" method="post" >
			<table border="1" bordercolor="darkgray"  bgcolor="linen" cellspacing="0" width="1000px">
				
			<tr>
				<td class="t">年:</td>
				<td><select name="orderyear"> 
					<c:forEach var="i" begin="2018" end="2050">
						<option >${i}</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td class="t">月:</td>
				<td><select name="ordermonth"> 
					<c:forEach var="i" begin="1" end="12">
						<option >${i}</option>
					</c:forEach>
				</select>
				</td>
			</tr>
			<tr>
				<td class="t">日:</td>
				<td><select name="orderday"> 
					<c:forEach var="i" begin="1" end="31">
						<option >${i}</option>
					</c:forEach>
				</select>
				</td>
			</tr>		
			<tr>
				<td class="t">具体时间:</td>
				<td class="t1">
				<select name="ordertime">
					<c:forEach items="${ordertime }" var="ortm">
						<option >${ortm.ordertime}</option>
					</c:forEach>
				</select>
				</td>
			</tr>		
				
			<tr>
				<td class="t">预约教练:</td>
				<td class="t1">
				<select name="coachname">
					<c:forEach items="${coach}" var="coach">
						<option >${coach.coachname}</option>
					</c:forEach> 
				</select>
				</td>
			</tr>		
			<tr>
				<td class="t">预约场地:</td>
				<td class="t1">
				<select name="orderadname">
				<c:forEach items="${orderad}" var="orderad">
						<option >${orderad.orderadname}</option>
					</c:forEach> 
				</select>
				</td>
			</tr>	
			
			<tr>
				<td class="t">预约科目:</td>
				<td class="t1"><input type="radio" name="ordersec" checked="checked" value="科二">科二
				<input type="radio" name="ordersec" value="科三">科三
				</td>
			</tr>	
			
				<tr>
				<td class="t1" align="center" colspan="2"><input type="submit" value="添加" ></td></tr>		
			</table>
			</form>
</body>
</html>