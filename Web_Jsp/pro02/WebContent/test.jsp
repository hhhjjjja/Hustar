<!-- ***코어 태그*** -->
<!-- set tag -->


<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!-- Java src에 만들어논 MemberInfo.java import -->
<%@ page import ="ch12.member.MemberInfo" %>

<!-- WEB-INF/lib 안에 jstl-1.2.jar 파일 추가해줘야 함 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%
	MemberInfo member = new MemberInfo();
	//*
	//pageContext는 현재 페이지(하나의 페이지)에서 사용
	pageContext.setAttribute("mem", member);
	
	int a=7;
	//a값을 자바영역 외의 아래에서 찍는 방법
	//1. pageContext 사용
	pageContext.setAttribute("a", a);
	//2. c:set(코어태그)에서 표현식을 사용해서 값 땡겨오기
%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>

<!-- java bin 객체를 변수 m에 담는다 -->
<c:set var="m" value="<%=member %>" />

<!-- m(memberInfo)의 속성 중 name에 최범균을 담음 -->
<c:set target="${m}" property="name" value="최범균"/>
<c:set target="${m}" property="id" value="hhhjjjja"/>

===> ${m} <br>
===> ${m.name } <br>
===> ${m.id } <br>

<p>

<!-- java에 있는 변수 member는 el이 인식 못함. member 찍어도 출력X -->
<!-- 인식할 수 있게 할려면 위 MemberInfo member= ... 아래에 (*)pageContext를 만들어줘야함! -->
<!-- 자바영역에서 처리해줘야 함 -->
<c:set target="<%=member %>" property="name" value="홍길동"/>
===> ${mem.name}

<p>

<!-- 자바영역에서 pageContext 생성해줌 -->
===> ${a} <br>
<!-- pageContext없이 코어태그 사용하는 방법 -->
<c:set var = "a" value="<%=a %>"/>
===> ${a}

</body>
</html>