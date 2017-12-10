<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title></title>
</head>
<center>
<body>
	<h1 style="font: italic;">来看看用户的情况吧</h1>
		<table border="1">
		<tr>
			<th>编号</th>
			<th>姓名</th>
			<th>公司名</th>
			<th>国家</th>
			<th>地址</th>
			<th>邮政编码</th>
			<th>Email</th>
			<th>电话</th>
		</tr>
		<c:forEach items="${userList }" var="a">
			<tr>
				<td>${a.id }</td>
				<td>${a.name }</td>
				<td>${a.companyname }</td>
				<td>${a.country }</td>
				<td>${a.address }</td>
				<td>${a.postcode }</td>
				<td>${a.email }</td>
				<td>${a.phone }</td>
			</tr>
		</c:forEach>
	</table>
</body>
</center>
</html>