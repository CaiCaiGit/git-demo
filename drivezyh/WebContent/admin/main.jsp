<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<frameset rows="10%,*" border="none" bordercolor="lightblue" >
		<frame src="top.jsp" noresize="noresize" >
		<frameset cols="15%,*">
			<frame src="left.jsp" noresize="noresize">
			<frame src="${pageContext.request.contextPath }/admin/finduserservlet" name="right" noresize="noresize">
		</frameset>
		
</frameset>
</html>