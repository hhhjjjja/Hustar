<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<% 
	String code = request.getParameter("code");
	String viewPageURI = null;
	
	if(code.equals("A")) {
		viewPageURI = "/ch07_1/viewModule/a.jsp";
	} else if(code.equals("B")) {
		viewPageURI = "/ch07_1/viewModule/b.jsp";
	} else if(code.equals("C")) {
		viewPageURI = "/ch07_1/viewModule/c.jsp";
	}
%>
<jsp:forward page="<%= viewPageURI %>"/>