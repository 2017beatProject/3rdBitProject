<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<!-- http://apis.skplanetx.com/11st/v2/common/products?version={version}&page={page}&count={count}&searchKeyword={searchKeyword}&sortCode={sortCod -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.js"></script>
	
	<script>
	
	$(function(){
		
	$("#")	
	
		$.ajax({			
			'url': 'http://apis.skplanetx.com/11st/v2/common/products',			
			'data': {			
				'version':'1',
				'searchKeyword':'11',
				'appKey': '831b2c9b-12a4-3b28-a338-a5832c3ef3dd'
		},
			'success':function(data){
				console.log(data);
			},
			'error':function(data){
				alert("에러");
			}
			
			
		}
				);
		
	});
	
	</script>
	
</head>
<body>
<h1>
	Hello world!  
</h1>

<a href="/join">회원가입</a>

<P>  The time on the server is ${serverTime}. </P>
</body>
</html>
