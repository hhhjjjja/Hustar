<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- mariaDB connection -->
<!-- connection은 예측해서 미리 생성해놓은 후 배정하는 것이 효율적(connection pool)=>이미 만들어놓은 좋은 풀이 많음.받아서 쓰면됨~ -->
<!-- 사용완료 후 닫는것(conn.close())이 아니라 반납하는 것이 효율적. 지금코드는 비효율... -->
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.ResultSet" %>


<!-- JAVA -->
<%

Class.forName("org.mariadb.jdbc.Driver");

String url = "jdbc:mysql://localhost:3306/jsp";
String user = "root";
String password = "joy123";

//Connection 객체가 생성되면 연결 됐다는 뜻
Connection conn = DriverManager.getConnection(url, user, password);
Statement stm = conn.createStatement();
ResultSet res = stm.executeQuery("select* from member");

while(res.next()) {
	out.println(res.getString("id") + "\t" + res.getString("name") + "<p>");
}

res.close();
stm.close();
conn.close();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

</body>
</html>