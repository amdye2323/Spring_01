<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
	<h1>회원목록보기</h1>
	<div><a href="personForm.sp">회원가입</a></div>
	<table>
		<tr align="center">
			<th>Id</th>
			<th>Name</th>
			<th>Job</th>
			<th>Del</th>		
		</tr>
		<c:forEach items="${list }" var="per">
		<tr>
			<td>${per.id }</td>
			<td><a href="personDetail.sp?id=${per.id}">${per.name }</a></td>
			<td>${per.job }</td>
			<td><a href="personDelete.sp?id=${per.id }">삭제</a></td>
		</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>