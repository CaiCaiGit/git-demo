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
				text-align: center;
				font-family: "微软雅黑";
			}
			.div1{
				
				width: 1000px;
				height: 500px;
				border-color: beige;
				align-content: center;
				padding: 100px;
				margin:0px auto;
			}
			a{
				text-decoration: none;
			}
			td{
				text-align: center;
				width:200px;
			}
			.div2{
				display: block;
				float: left;
				border: 1px solid darkgray;
				width: 1700px;
				height: 45px;
				border-left: none;
				border-right: none;
				
				text-decoration: none;
				font-size: 20px;
				line-height: 40px;
			}
			.div2 a:hover{border-bottom: 3px solid cornflowerblue; color: black;}
			
		</style>
	</head>
	<body>
	
		<div class="div2">
		&nbsp;&nbsp;&nbsp;
				<a href="bodyf.jsp" target="bodyf">首页</a>
				<a href="${pageContext.request.contextPath }/user/Findorderfservlet"  target="bodyf" >预约中心</a>&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath }/user/Findmyfront"  target="bodyf">用户中心</a>&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath }/user/Findorderlistfservlet" target="bodyf" >预约记录</a>&nbsp;&nbsp;&nbsp;
				<a href="${pageContext.request.contextPath }/user/Finduserformservlet" target="bodyf" >通知中心</a>&nbsp;&nbsp;&nbsp;
				<a href="indexfront.jsp" target="_top" >登录</a>&nbsp;&nbsp;&nbsp;
				<a href="indexfront.jsp"  target="_top">注销退出</a>
		</div>
		
</body>
</html>