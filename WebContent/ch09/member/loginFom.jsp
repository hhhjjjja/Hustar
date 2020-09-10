<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>로그인 폼</title>
</head>
<body>

<form action="<%=request.getContextPath()%>/ch09/member/login.jsp" method="post">
	아이디<input type="text" name="id" size="10">
	암호<input type="password" name="password" size="10">
	<input type="submit" value="로그인">
</form>

</body>
</html>