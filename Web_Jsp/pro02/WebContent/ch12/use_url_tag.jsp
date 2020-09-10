<%@ page contentType="text/html; charset=utf-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<c:url value="http://search.daum.net/search" var="searchUrl">
	<c:param name="w" value="blog" />
	<c:param name="q" value="공원" />
</c:url>

<ul>
	<li>${searchUrl}</li>				<!-- 위 c:url에서 조합한 searchUrl 변수에 값을 저장해놓고 출력 -->
	
	<!-- 변수가 없으므로 화면에 바로 출력 -->
	<li><c:url value="/use_if_tag.jsp" /></li>		<!-- 맨앞 /로 시작 ==> 절대경로 개념 -->
	<li><c:url value="./use_if_tag.jsp" /></li>		<!-- .한개는 현재경로 ==> 상대경로 -->
</ul>

</body>
</html>
