<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Select Option</title>
</head>
<body>

<form action="<%=request.getContextPath() %>/ch07_1/view.jsp">
	보고싶은 페이지 선택 : 
		<select name="code">
			<option value="A">A 페이지</option>
			<option value="B">B 페이지</option>
			<option value="C">C 페이지</option>
		</select>
	<input type="submit" value="이동">
</form>

</body>
</html>