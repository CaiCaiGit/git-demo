<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
			a{
				text-decoration: none;
			}
			.div1{
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
			.div1 a:hover{border-bottom: 3px solid cornflowerblue; color: black;}
			
			.div3{
				width: 1185px;
				height: 420px;
				align-content: center;
				background-color: white;
				position: absolute;
				left: 100px;
				top: 70px;
				
			}
			.div31{
				width: 479px;
				height: 420px;
				
			}
			.div32{
				width: 460px;
				height: 206px;
				
				position: absolute;
				left: 481px;
				top: 1px;
			}
			.div33{
				width: 460px;
				height: 210px;
				
				position: absolute;
				left: 481px;
				top: 208px;
			}
			.div34{
				background-repeat: no-repeat;
				width: 248px;
				height: 420px;
				
				position: absolute;
				left: 942px;
				top: 0px;
			}
			.div3 img{
				 cursor: pointer;  
                transition: all 0.6s; 
             
              
			}
			.div3 img:hover{
				 transform: scale(1.1);
			}
		</style>
	</head>
	<body>
	
		
		
		<div class="div3">
				<div class="div31"><a href="${pageContext.request.contextPath }/user/Findmyfront" target="bodyf"><img src="../img/21.jpg" width="479px" height="420px"></a></div>
				<div class="div32"><a href="${pageContext.request.contextPath }/user/Findorderfservlet" target="bodyf"><img src="../img/41.jpg" width="460px" height="206px"></a></div>
				<div class="div33"><a href="${pageContext.request.contextPath }/user/Findorderlistfservlet" target="bodyf"><img src="../img/51.jpg" width="460px" height="210px"></a></div>
				<div class ="div34"><a href="${pageContext.request.contextPath }/user/Finduserformservlet" target="bodyf" ><img src="../img/61.jpg" width="248px" height="420px"></a></div>
				 </div>
</body>
</html>