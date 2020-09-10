<!-- c:choose / c:when / c:otherwise tag -->
<!-- choose tag내의 when의 조건이 충족하는 when tag내 작업 수행. 그 이후의 when은 실행X. when의 조건 모두가 참이 아니면 otherwise tag 수행 -->

<%@ page contentType = "text/html; charset=utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>choose 태그</title></head>
<body>

<ul>
<c:choose>
  <c:when test="${param.name == 'bk'}" >
    <li> 당신의 이름은 ${param.name} 입니다.
  </c:when>
  <c:when test="${param.age > 20}" >
    <li> 당신은 20세 이상입니다.
  </c:when>

  <c:otherwise>
    <li> 당신은 'bk'가 아니고 20세 이상이 아닙니다.
  </c:otherwise>
</c:choose>
</ul>

</body>
</html>
