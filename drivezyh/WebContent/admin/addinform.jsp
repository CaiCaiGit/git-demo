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
<style>
			.*{
		    	font-family: "微软雅黑";
		    	
		    }
		    .t{
				text-align: right;
				
				width: 300px;
				
			}
		    .t1{
				border-left: none;
				
			}
		    .div{
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
			.div5{
				
				text-align: center;
			
			}
		    
		</style>
			
       
  </head>
	<body bgcolor="aliceblue">
		<div class="div">
			<div class="div1">添加公告</div>
			<h3>当前管理员：${sessionScope.loginname}</h3>
		</div>
		
		<form action="${pageContext.request.contextPath }/admin/Doorderfservlet" method="post" >
			
						<table border="1" cellspacing="0"     cellpadding="10" width="1000px" bgcolor="linen">
							
							<tr>
								<td class="t" align="left">公告标题：</td>
								<td  colspan="2"><input type="text" name="Inforname" ></td>
							</tr>
							<tr>
								<td class="t" align="left">公告内容：</td>
								<td class="t1"  colspan="2"><textarea cols="50" rows="10" name="Infordec"></textarea></td>
							</tr>
							
							
							
							<tr  align="center" >
								<td  colspan="3" class="div5" ><input type="submit" value="添加"></td>
							</tr>
							
						</table>								
					
				
		</form>
	</body>
</html>