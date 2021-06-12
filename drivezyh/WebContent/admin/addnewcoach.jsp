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
			.div2{
				border: 1px solid #87CEFA;
				width: 1000px;
				background-color: lime;
			}
			
		</style>
	</head>
	<body  bgcolor="aliceblue"> 
          
         
             <div> 
           	
           	<div class="div1">
           		添加新教练
           	</div>
           	<h3>当前管理员：${sessionScope.loginname}</h3>
           	</div>
           	
		<form action="${pageContext.request.contextPath }/admin/Doaddcoachservlet" method="post" >
			<table border="1" bordercolor="darkgray"  bgcolor="linen" cellspacing="0" width="1000px">
				
			<tr>
				<td class="t">姓名:</td>
				<td class="t1"><input type="text" name="coachname"></td>
			</tr>		
			<tr>
				<td class="t">身份证号:</td>
				<td class="t1"><input type="text" name="coachcard"></td>
			</tr>		
				<tr>
				<td class="t">性别:</td>
				<td class="t1"><input type="radio" name="coachsex" value="男">男
				<input type="radio" name="coachsex" value="女">女
				</td>
			</tr>
			<tr>
				<td class="t" >照片:</td>
				<td class="t1"><input type="file" name="coachph" value="上传照片"></td>
			</tr>
			<tr>
				<td class="t">负责科目:</td>
				<td class="t1"><input type="radio" name="coachdec" value="科二">科二
				<input type="radio" name="coachdec" value="科三">科三
				</td>
			</tr>
			<tr>
				<td class="t">负责车辆:</td>
				<td class="t1"><input type="text" name="coachcar"></td>
			</tr>
				<tr>
				<td class="t">所属驾校:</td>
				<td class="t1"><input type="text" name="coachschool" value="英弛"></td>
			</tr>
					
				<tr>
				<td class="t">手机号:</td>
				<td class="t1"><input type="text" name="coachmo"></td>
			</tr>
			<tr>
				
				<td class="t1" align="center" colspan="2"><input type="submit" value="添加" ></td></tr>		
			</table>
			
		</form>
	</body>
</html>