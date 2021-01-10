<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<table>
	<tr>
		<td width = 10>id</td>
		<td width = 40>${student.id }</td>
	</tr>
	<tr>
		<td>name</td>
		<td>${student.studentName }</td>
	</tr>
	<tr>
		<td>StudentID</td>
		<td>${student.studentNumber }</td>
	</tr>
	<tr>
		<td>Email</td>
		<td>${student.email }</td>
	</tr>
</table>
</body>
</html>