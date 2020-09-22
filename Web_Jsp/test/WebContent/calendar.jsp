<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<%@ page import="cal.Calen"%>
<%@ page import="cal.Dbmgr" %>
<%@ page import="cal.Memo" %>
<%@ page import="java.util.*" %>  
<%
request.setCharacterEncoding("utf-8");

Calen cal = new Calen();

cal.set(request.getParameter("year"),request.getParameter("month"),request.getParameter("day"));
int year = cal.getYear();
int month = cal.getMonth();
int day = cal.getDay();
int last = cal.getLast();
int week = cal.getWeek();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calendar</title>
</head>
<body>

<table align="center" width="810" cellpadding="2" cellspacing="1">
	<tr>
		<td><br>
		<table align="center" width="210" cellpadding="2" cellspacing="1">
			<tr height="30">
				<td align="center"><a href="calendar.jsp?year=<%=cal.getPryear()%>&month=<%=cal.getPrmonth()%>&day=<%=1%>">◀</a>
					<b>&nbsp;&nbsp;<%=cal.getYear()%>년&nbsp;&nbsp;<%=cal.getMonth()%>월&nbsp;&nbsp;</b>
					<a href="calendar.jsp?year=<%=cal.getNextyear()%>&month=<%=cal.getNextmonth()%>&day=<%=1%>">▶</a></td>
			</tr>
		</table>
		
		<table align="center" width="400" cellpadding="0" cellspacing="1" border = "1">
			<tr height="30">
				<td align="center"><font color="red">일</font></td>
				<td align="center">월</td>
				<td align="center">화</td>
				<td align="center">수</td>
				<td align="center">목</td>
				<td align="center">금</td>
				<td align="center"><font color="blue">토</font></td>
			</tr>
			
			<%
			int newLine = 0;
			out.print("<tr height='40'>");
			for(int i=1; i<cal.getWeek(); i++) {
				out.print("<td bgcolor='#ffffff'>&nbsp;</td>");
				newLine++;
			}
			for (int i = 1; i <= cal.getLast(); i++) {
				String bgColor = (String.valueOf(cal.getYear()).equals(year)) && (String.valueOf(cal.getMonth()).equals(month)) && (day == i) ? "#e6e6e6" : "#ffffff";
				out.print("<td align='center' bgcolor='" + bgColor + "'>");
			%>
			
			<a href="calendar.jsp?year=<%=cal.getYear()%>&month=<%=cal.getMonth()%>&day=<%=i%>"><%=i%></a>
			
			<%
				out.print("</td>");
				newLine++;
				
				if(newLine == 7 && i != cal.getLast()) {
					out.print("</tr><tr height='40'>");
					newLine = 0;
				}
			}
			while (newLine > 0 && newLine < 7) {
				out.print("<td bgcolor='#ffffff'>&nbsp;</td>");
				newLine++;
			}
			out.print("</tr>");
			%>
		</table>
		
		<br>
		<center>
		<table aligh="center">
			<tr>
				<td align="center"><%=cal.getYear()%>년 <%=cal.getMonth()%>월 <%=day%>일 일정 작성</td>
			</tr>
		</table>
		</center>
		
		<center>
		<form name="all" action="/test/insert.jsp" >
			<table border="1" style="text-align:center">
				<input type="hidden" name="year" value="<%=cal.getYear()%>">
				<input type="hidden" name="month" value="<%=cal.getMonth()%>">
				<input type="hidden" name="day" value="<%=day%>">
				
				<tr>
					<td>제&nbsp;&nbsp;&nbsp;목</td>
					<td align="left"><input type="text" name="name" maxlength="10" ></td>
				</tr>
				<tr>
					<td>메&nbsp;&nbsp;&nbsp;모</td>
					<td><input type="text" name="memo" size="50" maxlength="50"></td>
				</tr>
				
				<tr>
					<td>비밀번호</td>
					<td align="left"><input type="password" name="pass" size="50" maxlength="10"></td>
				</tr>
			</table>
			<br>
				<input type="submit" value="등록">
				<input type="reset" value="취소">
		</form>
		</center>

		</td>
		</tr>

		<tr>
		<td>
		<center>
		<br><hr>
		<table align="center"  width="370" cellpadding="10" cellspacing="1">
			<tr>
				<td align="center"><font color="blue">< <%=cal.getYear()%>년 <%=cal.getMonth()%>월 <%=day%>일 일정 ></font><br></td>
			</tr>
			<tr>
				<td>
				<br>
<%
				Dbmgr db=new Dbmgr();
				ArrayList<Memo> al = db.selectlist(String.valueOf(cal.getYear())+"", String.valueOf(cal.getMonth())+"", String.valueOf(day));
				
				db.Close();
				if(al.size()>0){
					for(int i=0;i<al.size();++i){
						out.print((i+1) + ". ");
						out.print(al.get(i).getName()+" : ");
						out.print(al.get(i).getMemo());
%>
						&nbsp;
						<input type="button" value="삭제" onclick='document.location.href="/test/delete.jsp?no=<%=al.get(i).getNo()%>&year=<%=al.get(i).getYear()%>&month=<%=al.get(i).getMonth()%>&day=<%=al.get(i).getDay()%>"'><br>
						<hr>
<%
					}
				}else{
					out.print("등록된 사항이 없습니다.");
				}
%>
				</td>
			</tr>
		</table>
		</center>
		</td>
	</tr>
</table>
</body>
</html>

 
