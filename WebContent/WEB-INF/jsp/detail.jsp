<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<form action="personUpdate.sp" method="post">
<input type="hidden" value="${person.id }" name="id">
<table>
	<tr>
		<td>${person.name }</td>
		<td><input type="text" name="name">
	</tr>
	<tr>
		<td>${person.pass }</td>
		<td><input type="text" name="pass">
	</tr>
	<tr>
		<td>${person.job }</td>
		<td><input type="text" name="job">
	</tr>
	<tr>
		<td><input type="submit" value="수정하기"></td>
		<td></td>
	</tr>
</table>
</form>
</div>
<script>
//성별
	if("${person.gender}"=="남"){
		$("input:radio[value='남']").prop("checked",true);
		}
	else{
			$("input:radio[value='여']").prop("checked",true);
		}
	//직업
	$("#job option").each(function(){
		if($(this).val()=="${person.job}"){
				$(this).prop("selected",true);
			}

		})
	
</script>
</body>
</html>