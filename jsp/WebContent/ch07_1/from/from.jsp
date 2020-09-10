<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>from.jsp의 제목</title>
</head>
<body>
이 페이지는 from.jsp가  생성한 것입니다.
<jsp:forward page="/ch07_1/to/to.jsp"/> <!-- 출력버퍼 비우고 to.jsp로 다시 채움 -->

</body>
</html>