<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

<div>

<c:forEach items="${list}" var="bean">
<ul>	
	<li id="mnum">회원번호 : ${bean.mnum}</li>
	<li id="name">성명 : <a href="/member/${bean.mnum}">${bean.name}</a></li>
	<li id="id">ID : ${bean.id}</li>
	<li id="password">Password : ${bean.password}</li>
	<li id="phone">Phone : ${bean.phone}</li>
	<li id="mail">Mail : ${bean.mail}</li>
	<li id="mbirth">Mbirth : ${bean.mbirth}</li>
	<li id="addr">Addr : ${bean.addr}</li>
	<li id="addrn">Addrn : ${bean.addrn}</li>	
</ul>
</c:forEach>
</div>

</body>
</html>