<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="s" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product</title>
</head>
<center>
<body>
	<table border="1">
		<tr>
			<c:forEach items="${allProductType }" var="a">
			<th>${a.id }</th>
			</c:forEach>
		</tr>
		<tr>
			<c:forEach items="${allProductType }" var="a">
			<td>${a.type }</td>
			</c:forEach>
		</tr>
	</table>
	<br/><br/><br/>
	
	<table border="2">
		<tr>
			<th>编号</th>
			<th>名字</th>
			<th>价格</th>
			<th>打折后价格</th>
			<th>描述</th>
			<th>图片</th>
			<th>标签</th>
			<th>商品类型</th>
			<th width="45">修改</th>
			<th>删除</th>
		</tr>
		<c:forEach items="${allProduct }" var="b">
		<form action="${s }/Product/updateProduct?img1=${b.img1}" enctype="multipart/form-data" method="post">
		<tr>
			<th><input style="border: none" type ="text" value="${b.id }" name="productId" /></th>
			<th><input style="border: none" type="text" value="${b.name }" name="productName" /></th>
			<th><input style="border: none"type="text" value="${b.price }" name="productPrice" /></th>
			<th><input style="border: none" type="text" value="${b.discount }" name="productDiscount" /></th>
			<th><input style="border: none" type="text" value="${b.desc }" name="productDesc" /></th>
			<th><img alt="" height="100" width="100" src="../../${b.img1 }" /><input type="file" name="upfile" ></th>
			<th><input style="border: none" type="text" value="${b.tags }" name="productTags" /></th>
			<th><input style="border: none" type="text" value="${b.producttype_id }" name="productProducttype_id" /></th>
			<th><input type="submit" value="修改"/></th>
			<th><a href="${s}/Product/deleteProduct?id=${b.id}">×</a></th>
		</tr>
		</form>					
		</c:forEach>
	</table>
</body>
</center>
</html>