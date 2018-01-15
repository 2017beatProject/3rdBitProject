<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>hotdeal page</h1>
	<c:forEach items="${list}" var="bean">
		<ul>
			<li>${bean.price }</li>
			<li>${bean.hotDealNum }</li>
			<li>${bean.link }</li>
			<li><img src="../resources/imgs/hotdealimgs/${bean.productName }"></li>
			<li>${bean.productIntro }</li>
		</ul>
	</c:forEach> 
	
</body>
</html>
