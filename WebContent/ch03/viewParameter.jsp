<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%
	request.setCharacterEncoding("utf-8");	//get말고 post사용할 때 인코딩, get은 없어도 인코딩됨
%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.Enumeration" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>요청 파라미터 출력</title>
</head>
<body>
	<b>request.getParameter()메서드 사용</b><br>
	name 파라미터 = <%=request.getParameter("name") %> <br>
	address 파라미터 = <%=request.getParameter("address") %> <p>
	
	<b>request.getParameterValues()메서드 사용</b><br>
	<%
		String[] values = request.getParameterValues("pet");
		if(values != null) {							// 없으면 NullPointException 발생
			for(int i=0;i<values.length;i++) {
	%>
				<%= values[i] %>
	<%
			}
		}
	%>
	
	<p>
	<b>request.getParamenterNames()메서드 사용</b> <br>
	<%
		Enumeration paramEnum = request.getParameterNames();
		while(paramEnum.hasMoreElements()) {
			String name = (String)paramEnum.nextElement();
	%>
			<%= name %>
	<%
		}
	%>
	
	<p>
	<b>request.getParameterMap() 메서드 사용</b> <br>
	<%
		Map<String, String[]> parameterMap = request.getParameterMap();
		String[] nameParam = (String[])parameterMap.get("name");
		if(nameParam != null) {
	%>
			name = <%= nameParam[0] %>
	<%
		}
	%>
</body>
</html>