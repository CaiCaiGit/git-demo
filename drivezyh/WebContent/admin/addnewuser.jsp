<%@page import="Service.Userservice"%>
<%@page import="Entity.UserList"%>
<%@page import="java.util.List"%>
 <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
          
           <div >
             <div> 
           	
           	<div class="div1">
           		添加新学员
           	</div>
           	
           	<h3>当前管理员：${sessionScope.loginname}</h3>
           	</div>
        
		<form action="${pageContext.request.contextPath }/admin/Doaddusersevlet" method="post"  >
			<table border="1" bordercolor="darkgray"  bgcolor="linen" cellspacing="0" width="1000px">
			
			<tr>
				<td class="t">姓名:</td>
				<td class="t1"><input type="text" name="username"></td>
			</tr>		
				
			
			<tr>
				<td class="t">身份证号:</td>
				<td class="t1"><input type="text" name="usercard"></td>
			</tr>	
			<tr>
				<td class="t">密码:</td>
				<td class="t1"><input type="text" name="userpw" value="111111"></td>
			</tr>		
			<tr>
			<td class="t">驾校:</td>
				<td class="t1"><input type="text" name="userschool" value="英弛" ></td>
			</tr>
			
				<tr>
				<td class="t">科目:</td>
				<td class="t1"><input type="radio" name="userdec" checked="checked" value="科二">科二
				<input type="radio" name="userdec" value="科三">科三
				</td>
			</tr>
				
				
					<tr>
				<td class="t">手机号:</td>
				<td class="t1"><input type="text" name="usermo"></td>
			</tr>
				<tr>
				<td class="t1" align="center" colspan="2"><input type="submit" value="添加" ></td></tr>		
			</table>
			
		</form>
	</div>
	</body>
</html>