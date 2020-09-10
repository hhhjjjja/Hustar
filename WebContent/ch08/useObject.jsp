<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<jsp:useBean id="member" scope="request" class="ch08.member.MemberInfo" />


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>인사말</title>
</head>
<body>

<%= member.getName() %> (<%= member.getId() %>) 회원님 안녕하세요.
</body>
</html>