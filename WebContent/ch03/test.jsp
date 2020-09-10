<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<%-- 두 번의 요청 : test.jsp -> naver.com --%>
<%--
<%
	response.sendRedirect("http://naver.com");
%>
 --%>
 
<%
	response.sendRedirect("form.jsp");	// 상대주소
	response.sendRedirect("/pro01/ch03/form.jsp");	// 절대주소(위에서부터 쭉 타고옴)
%>

</body>
</html>