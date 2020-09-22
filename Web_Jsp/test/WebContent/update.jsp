<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="cal.Dbmgr" %>

<jsp:useBean id="memo" class="cal.Memo" scope="request"/>
<jsp:setProperty property="*" name="memo"/>

     
<%
String no = request.getParameter("no");
Dbmgr db = new Dbmgr();
db.update(memo, no);
db.Close();

%>   
<!DOCTYPE html>
<html>
<head>
<meta http-equiv ="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
response.sendRedirect("/test/calendar.jsp?year="+memo.getYear()+"&month="+memo.getMonth()+"&day="+memo.getDay());
%>
</body>
</html>