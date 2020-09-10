<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<%@ page import = "util.Cookies" %>    
<%
	String id = request.getParameter("id");
	String password = request.getParameter("password");
	
	if(id.equals(password)) {
		response.addCookie(Cookies.createCookie("AUTH", id, "/", -1));
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>로그인 성공</title>
</head>
<body>
로그인에 성공했습니다.
</body>
</html>

<%} else {
%>
<script type="text/javascript">
alert("로그인에 실패했습니다.");
history.go(-1);
</script>
<%
	}
%>