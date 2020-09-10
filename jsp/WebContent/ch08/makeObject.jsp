<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<jsp:useBean id="member" scope="request" class="ch08.member.MemberInfo"/>
<%
	member.setId("pretty_hj");
	member.setName("박현정");
%>

<jsp:forward page="/ch08/useObject.jsp"/>