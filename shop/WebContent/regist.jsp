<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>注册页面</title>
</head>
<center>
	<body style="background-color: #fafad2">
		<h1>欢迎注册</h1>
		<hr>
		<form action="${s }/user/regist" method="post">
			用户名:<input type="text" name="name"><br/>
			密码:&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"><br/>
			国家:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="country"><br/>
			电话:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="phone"><br/>
			公司名称:<input type="text" name="companyname"><br/>
			具体地址:<input type="text" name="address"><br/>
			城镇:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="town"><br/>
			村落:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="county"><br/>
			邮编:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="postcode"><br/>
			邮件:&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="email"><br/>
			<br/><br/>
			<input type="submit" value="提交"><input type="reset" value="重置">
		</form><br/>
		已经有账号,点击返回<a href="${s}/login.jsp">返回登录页面</a>
	</body>
</center>
</html>