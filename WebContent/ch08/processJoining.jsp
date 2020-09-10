<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<% request.setCharacterEncoding("utf-8"); %>
    
<jsp:useBean id="memberInfo" class="ch08.member.MemberInfo" />
<jsp:setProperty property="*" name="memberInfo"/>
<jsp:setProperty property="password" name="memberInfo" value="<%=memberInfo.getId() %>"/>


<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>가입</title>
</head>
<body>
	<table width="400" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td>아이디</td>
			<td><jsp:getProperty property="id" name="memberInfo"/></td>
			<td>암호</td>
			<td><jsp:getProperty property="password" name="memberInfo"/></td>
		</tr>
		
		<tr>
			<td>이름</td>
			<td><jsp:getProperty property="name" name="memberInfo"/></td>
			<td>이메일</td>
			<td><jsp:getProperty property="email" name="memberInfo"/></td>
		</tr>
	</table>
</body>
</html>