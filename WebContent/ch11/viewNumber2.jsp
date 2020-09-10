<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import="util.FormatUtil" %>
<%
	request.setAttribute("price", 12345L);
%>
<html>
<head><title>EL 함수 호출</title></head>
<body>
<!-- FormatUtil = 클래스명, number = formatUtil 내의 함수 -> web.xml등...에서 해줘야 함 -->
가격은 <b>${FormatUtil.number(price, '#,##0') }</b>원 입니다.

</body>
</html>
