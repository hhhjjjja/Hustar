<!-- redirect tag ==> 실제로 search 이동 -->

<%@ page contentType="text/html; charset=utf-8" session="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<body>

<c:redirect url="http://search.daum.net/search" >
	<c:param name="w" value="img" />		<!-- 통합검색:tot 이미지:img 블로그:blog -->
	<c:param name="q" value="공원" />			<!-- 검색할 단어 -->
</c:redirect>

</body>
</html>
