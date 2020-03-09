<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>개인 정보 입력</h2>
<form action="personInsert.sp" method="post">
이름 : <input type="text" name="name"><br>
아이디 : <input type="text" name="id"><br>
패스워드 : <input type="text" name="pass"><br>
성별 : <input type="radio" name="gender" value="남자">남자
<input type="radio" name="gender" value="여자">여자<br>
직업 : <select name="job">
<option value="회사원">회사원</option>
<option value="학생">학생</option>
<option value="주부">주부</option>
</select><br>
<button>확인</button>
<button>취소</button>
</form>
</body>
</html>