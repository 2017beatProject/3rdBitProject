<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>파일 업로드 페이지</h1>
	<form action="/upload" method="post" enctype="multipart/form-data">
	productName<input type="text" name="productName"/><br/>
	price<input type="number" name="price"><br/>
	productIntro<input type="text" name="productIntro"></br>
	link<input type="text" name="link"></br>
	file<input type="file" name="file"/><br/>
	<button type="submit">전송</button>
	</form>
</body>
</html>