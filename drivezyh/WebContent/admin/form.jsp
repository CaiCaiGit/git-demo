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
		    .*{
		    	font-family: "微软雅黑";
		    }
		    .table{
		    	background-color: linen;
		    	width:1000px;
		    	border-color: blue;
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
		    
		    
			
		</style>

</head>


<body bgcolor="aliceblue">


 
  
		<div class="div">
			<div class="div1">公告信息</div>
			<h3>当前管理员：${sessionScope.loginname}</h3>
		</div>
	 	<c:choose>
		<c:when test="${informlist[0]==null }">
			<h1 align="center">暂无学员信息</h1>
		</c:when>
		<c:otherwise>
			<table border="1" cellspacing="0"     cellpadding="10" class="table"  >
			     
			      
			   	 <tr align="center">
			   	 	<th colspan="10" class="t" >公告信息列表</th>
			   	 </tr>
			   	  <tr align="center">
			   	  	<th colspan="1">通知编号</th>
			   	 	<th  colspan="2" >标题</th>
			   	 	<th colspan="4">内容</th>
			   	 	<th colspan="2">发布时间</th>
			   	 	<th ></th>
			   	 </tr>
			   	 <c:forEach items="${informlist }" var="inform">
			   	 <tr align="center">
				 <td colspan="1">${inform.informid}</td>
				 <td colspan="2">${inform.inforname}</td>
				 <td colspan="4">${inform.infordec}</td>
				 <td colspan="2">${inform.infortime}</td>
			   	 	 <td><a href="${pageContext.request.contextPath }/admin/Delinformservlet?Informid=${inform.informid}">删除</a></td>
                	 
			  </c:forEach>
			</table>
		</c:otherwise>
	</c:choose>
	
			
				
	</form>
	</body>
</html>