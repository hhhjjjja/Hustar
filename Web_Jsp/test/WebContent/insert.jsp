<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="cal.Dbmgr" %>   
<%
 request.setCharacterEncoding("utf-8");
%>   
<jsp:useBean id="memo" class="cal.Memo" scope="request"/>
<jsp:setProperty property="*" name="memo"/>

<%
  Dbmgr db = new Dbmgr();
  db.insert(memo);
  db.Close();
  response.sendRedirect("/test/calendar.jsp?year="+memo.getYear()+"&month="+memo.getMonth()+"&day="+memo.getDay());
%>