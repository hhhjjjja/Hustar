<!-- core tag -->
<!-- c:if 태그 (흐름제어태그) -->

<%@ page contentType = "text/html; charset=utf-8" %>

<!-- tag 라이브러리 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head><title>if 태그</title></head>
<body>

<c:if test="true">
무조건 수행<br>
</c:if>

<!-- param 입력은 실행주소 뒤에   '?name=bk' -->
<c:if test="${param.name == 'bk'}">
name 파라미터의 값이 ${param.name} 입니다.<br>
</c:if>

<!-- 실행주소 뒤에   '?age=18' -->
<c:if test="${18 <= param.age}">
당신의 나이는 18세 이상입니다.
</c:if>


</body>
</html>