<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>商品添加</title>
</head>
<body>
		<center>
		<form action="${s }/Product/addProduct" enctype="multipart/form-data" method="post" boreder=1>
			<input  type="text" placeholder="产品名字" name="productName" /><br>
			<input type="text" placeholder="产品原价格" name="productPrice" /><br>
			<input  type="text"  placeholder="打折后价格" name="productDiscount" /><br>
			<input  type="text" placeholder="产品描述 " name="productDesc" /><br>
			<input type="file" name="upfile" ><br>
			<input  type="text" placeholder="产品标签" name="productTags" /><br>
			<input  type="text"  placeholder="产品类型id" name="productProducttype_id" /><br>
			<input type="submit" value="提交">
		</form>
		</center>		
</body>
</html>