<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>登录页面</title>
</head>
<center>
<body style="background-color: #fafad2">
	<h1>欢迎登录</h1>
	<hr>
	<form action="User/login" method="post">
		邮箱:<input type="text" name="email"><br/>
		密码:<input type="password" name="password"><br/><br/>${wrong}
		<input type="submit" value="提交"><input type="reset" value="重置">
	</form><br/>
	还没有账户?点击注册 <a href="${s}/regist.jsp">注册</a>
	<br/><br/>
	<a href="find.jsp">忘记密码?</a>
	<br/><br/>
</body>
</center>
</html>