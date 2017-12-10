<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<title>用户登录</title>

<link rel="stylesheet" href="css1/style.css" />

<body>

<div class="login-container">
	<div class="connect">
		<p style="font-size: 40px">欢迎登录</p>
	</div>
	<form action="User/login" method="post" id="loginForm">
		<div>
			<input type="text" name="email" class="username" placeholder="邮箱" autocomplete="off"/>
		</div>
		<div>
			<input type="password" name="password" class="password" placeholder="密码" oncontextmenu="return false" onpaste="return false" />
		</div>
		${wrong}
		<button id="submit" type="submit">登 陆</button>
	</form>

	<a href="register.jsp">
		<button type="button" class="register-tis">还有没有账号?</button>
	</a><br/>
	<a href="#">
		<button type="button" class="register-tis">忘记密码?</button>
	</a>
	<br/>
	<a href="adminLogin.jsp">
		<button type="button" class="register-tis">管理员登录点击这里</button>
	</a>
</div>
<script src="js1/jquery.min.js"></script>
<script src="js1/common.js"></script>
<!--背景图片自动更换-->
<script src="js1/supersized.3.2.7.min.js"></script>
<script src="js1/supersized-init.js"></script>
<!--表单验证-->
<script src="js1/jquery.validate.min.js?var1.14.0"></script>

</body>
</html>