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
			.div2{
				width: 200px;
				height: 40px;
				text-align: center;
				background-color: oldlace;
				text-color: red;
				border-top: 3px solid cornflowerblue;
				border-right: 1px solid cornflowerblue;
				border-bottom: 1px gainsboro solid;
				border-left: 1px gainsboro solid;
				background:url(../img/login_bg.jpg);
			}
			.div1{
				width: 200px;
				height: 80px;
				text-align: center;

			}
			
			
			body{      

        background-image: url(../img/login_bg.jpg);      

        background-size:cover;    

     }   
		</style>
		<script type="text/javascript">
		//将参数存放在数组中
		var items=new Array("user","coach","inform","order");
		function show(param){
			for(var i=0;i<4;i++){
				if(items[i]==param){
					document.getElementById(items[i]).style.display="block";
					
				}
				else{
					document.getElementById(items[i]).style.display="none";
				}
			}
		}
		</script>
	</head>
	<body >
	<div>
		<div class="div2">
		<a href="javascript:onClick=show('user')"><p>学员信息管理</p></a>
		</div>
		<div id="user" style="display:block;" class="div1">
			<a href="${pageContext.request.contextPath }/admin/Addusersevlet" target="right" style="text-decoration: none;" >添加新学员</a><br>
			<a href="${pageContext.request.contextPath }/admin/finduserservlet" target="right" style="text-decoration: none;">学员信息管理列表</a><br>
		</div>   
		
		<div class="div2" >
		<a href="javascript:onClick=show('coach')"><p>教练信息管理</p></a>
		</div>
		<div id="coach"  class="div1">
			<a href="${pageContext.request.contextPath }/admin/Addcoachservlet" target="right" style="text-decoration: none;">添加新教练</a><br>
			<a href="${pageContext.request.contextPath }/admin/Findcoachservlet" target="right" style="text-decoration: none;">教练信息管理列表</a><br>
		</div>
		
		<div class="div2"><a href="javascript:onClick=show('inform')"><p>公共信息管理</p></a>
		</div>
		<div id="inform"   class="div1">
			<a href="${pageContext.request.contextPath }/admin/Addinformservlet"  target="right" style="text-decoration: none;">添加新公告</a><br>
			<a href="${pageContext.request.contextPath }/admin/Findinformservlet" target="right" style="text-decoration: none;">公告信息列表</a><br>
		</div>
		
		<div class="div2"><a href="javascript:onClick=show('order')"><p>预约信息管理</p></a>
		</div>
		<div id="order"  class="div1">
		<a href="${pageContext.request.contextPath }/admin/Findorderplanservlet" target="right" style="text-decoration: none;">预约设定</a><br>
		<a href="${pageContext.request.contextPath }/admin/Findorderlistservlet" target="right" style="text-decoration: none;">预约信息列表</a><br>
		</div>
		
		
		<p align="center"><a href="${pageContext.request.contextPath }/admin/Findadminservlet" target="right" style="text-decoration: none;">系统用户管理</a></p>
		<p align="center"><a href="${pageContext.request.contextPath }/index.jsp"  target="_top" style="text-decoration: none;">注销退出</a></p>
	
		</div>
		
	</body>
</html>