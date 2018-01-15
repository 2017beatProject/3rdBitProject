<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport"
	content="user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, width=device-width" />
<title>Insert title here</title>

<script src="../resources/js/jquery-1.12.4.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.js"></script>
<script src="//developers.kakao.com/sdk/js/kakao.min.js"></script>

<script>
	$(function() {
		$(function() {
			//<![CDATA[
			// 사용할 앱의 JavaScript 키를 설정해 주세요.
			Kakao.init('1ed0a4ca651380fc768bf01eb21201e5');
			// 카카오 로그인 버튼을 생성합니다.
			Kakao.Auth.createLoginButton({
				'container' : '#kakao-login-btn',
				'success' : function(authObj) {
					alert(JSON.stringify(authObj));
					$('p').append(authObj.access_token);
					/* 	        $('p').append(authObj.token_type);
					 $('p').append(authObj.refresh_token);
					 $('p').append(authObj.expires_in);
					 $('p').append(authObj.scope); */
				},
				'fail' : function(err) {
					alert(JSON.stringify(err));
				}
			});
			//
			$('#loginchk').on(
					'click',
					function() {
						Kakao.Auth.getStatus(function(statusObj) {
							user = statusObj;
							if (statusObj.user != null) {
								console.log(statusObj.status + ":"
										+ statusObj.user.properties.nickname);
							} else {
								logoutMsg();
							}
						});
					});//로그인체크 function		  
			$('#logout').on('click', function() {
				Kakao.Auth.logout(function() {
					alert("로그아웃");
				});
			});
		});
		$('form').on('submit', function() {
			var param = {
				'loginId' : $('#loginId').val(),
				'loginPw' : $('#loginPw').val()
			}
			$.ajax({
				'url' : '/login',
				'type' : 'post',
				'data' : param,
				'success' : function(data) {
					alert("통신성공" + data);
				},
				'err' : function(data) {
					alert("로그인에러");
				}
			});
			return false;
		});
	});
</script>

</head>
<body>

	<form>
		<div id="loginIdDiv">
			<label for="loginId">아&nbsp;이&nbsp;디&nbsp;</label> <input type="text"
				id="loginId" name="loginId" placeholder="아이디" />
		</div>
		<div id="loginPwDiv">
			<label for="loginPw">비밀번호</label> <input type="password" id="loginPw"
				name="loginPw" placeholder="비밀번호" />
		</div>

		<div id="kakaoLogin">
			<a id="kakao-login-btn"></a> <a
				href="http://developers.kakao.com/logout"></a>
		</div>

		<div>
			
			<button type="button" id="loginchk">로그인체크</button>
			<button type="button" id="logout">로그아웃</button>
			<button type="submit">확인</button>
		</div>
	</form>
</body>
</html>