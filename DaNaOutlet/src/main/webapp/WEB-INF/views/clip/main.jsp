<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div id="header"></div>
	
	<div id="contents">
	
	<c:forEach items="${clipList}" var="bean">
	
	<ul>
		<li><a href="#">${bean.danaClipLog }</a></li>
		<li><a href="#">${bean.clipSort}</a></li>
		<li><a href="#">${bean.clipName }</a></li>
		<li><a href="#">${bean.clipInfo }</a></li>
		<li><a href="#">${bean.writeNalja }</a></li>
		<li><a href="#">${bean.productUrl1}</a></li>
		<li><a href="#">${bean.productUrl2}</a></li>
		<li><a href="#">${bean.productUrl3}</a></li>
		<li><a href="#">${bean.productUrl4}</a></li>
		<li><a href="#">${bean.productUrl5}</a></li>
		<li><a href="#">${bean.productUrl6}</a></li>
		<li><a href="#">${bean.productUrl7}</a></li>
		<li><a href="#">${bean.productUrl8}</a></li>
	</ul>
	
	</c:forEach>
	
	</div>
	
	<div id="footer"></div>


</body>
</html>