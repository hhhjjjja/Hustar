<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>폼 생성</title>
</head>
<body>
	<%-- action : 전송 버튼을 누르면 넘어갈 페이지주소 --%>
	<form action="/pro01/ch03/viewParameter.jsp" method="post">	
		
		이름: <input type="text" name="name" size="10"><br>
		주소: <input type="text" name="address" size="300"><br>
		좋아하는 동물: 
			<input type="checkbox" name="pet" value="dog">강아지
			<input type="checkbox" name="pet" value="cat">고양이
			<input type="checkbox" name="pet" value="pig">돼지<br>
		<input type="submit" value="전송">
	</form>

</body>
</html>