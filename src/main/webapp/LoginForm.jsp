<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
	<h1> 로그인 폼 페이지 </h1>
	<hr>
	<p />
	<form method="post" action="LoginForm.do">
		<table>
			<tr><td> ID : </td>
				<td> <input type="text" name="ID"></td>
			</tr>
			<tr><td> password : </td>
				<td> <input type="password" name="password"></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="로그인"></td>
			</tr>
		</table>
		<p />
		<a href="index.jsp">
			홈으로
		</a><p />	
	</form>
	</center>

</body>
</html>