<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="author" content="Cho">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../resources/css/jquery.mobile-1.4.5.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="../resources/js/address.js"></script>
<script src="../resources/js/joinValidation.js"></script>
<script src="../resources/js/Calender.js"></script>
<script src="../resources/js/IdDoubleCheck.js"></script>
<script src="../resources/js/idValidation.js"></script>
<script src="../resources/js/jquery.mobile-1.4.5.js"></script>

<script>
	var errList = [ "pwInputErr", "pwInputReErr", "nameErr", "bDayErr",
			"genErr", "phoErr", "emErr", "addressErr" ];
	var inputList = [ "pwInput", "pwInputRe", "userName", "bDay", "gender",
			"phoneFirst", "email", "address" ];
	var pwToggle;

	/*  아래부터는 메인*/
	var returnTfCount;
	var datakit = "";
	var midlist = "";
	var mid;
	var tmp;
	var idchk;
	var mmail;
	var maildata;
	var mailchk;

	var stringRegx = new RegExp(/[~!@\#$%<>^&*\()\-=+_\’]|[ㄱ-ㅎ]|[가-힣]/gi);
	var EngRegx = new RegExp(/[a-zA-Z]/gi);
	var numRegx =new RegExp(/[0-9]/gi);


	function getTextLength(str) {
		var len = 0;
		for (var i = 0; i < str.length; i++) {
			if (escape(str.charAt(i)).length == 6) {
				len++;
			}
			len++;
		}
		return len;
	}

	function waitingConfirm() {
		$.ajax({
			'url' : '/BEAT_LMS/confirm',
			'type' : 'POST',						
			'success' : function(conData) {
				maildata = conData.confirm[0].mail;			
				if (conData.confirm[0].mail == "check") {
					mailchk=true;
					$('span').remove();					
					$('<span>본인이 인증되었습니다</span>').appendTo('#mail');
					$('span').css({
						"color" : "deeppink",
						"font-size" : "13px",
						"position" : "absolute",
						"left" : "350px",
						"top" : "0px"
					});
				}
			}
		});
	}

	
	
	$(function() {
		idchk = false;
		mailchk= false;
		resetText();
		dateSelect();
		IddoubleCheck();
		var idChk = $('#id input').eq(0).val();
		$('#btn button').on('click', function() {
			var result = false;
			resetText();
			idValidation();//id validation 검사
			submitCheck();//id를 제외한 나머지 text부분 null값 검사		

			if (returnTfCount == 0 && idchk && mailchk) {
				result = true;
			}
			returnTfCount = 0;
			return result;
		});

		$("#mail button").on(
				'click',
				function() {
					mmail = $('#email').find('input').eq(0).val();
					$.ajax({
						'url' : 'target/mailchk.lms',
						'type' : 'POST',
						'data' : $('#email').serialize(),
						'error' : function() {
							alert('발송실패');
						},
						'success' : function(data) {
							var tf = true;
							maildata = data.list[0].result;
							<%
							session=request.getSession();
							session.setAttribute("confirm","uncheck");%>
							if (maildata == "success") {
								$('<span>이메일이 발송되었습니다</span>')
										.appendTo('#mail');
								$('span').css({
									"color" : "deeppink",
									"font-size" : "13px",
									"position" : "absolute",
									"left" : "350px",
									"top" : "0px"
								});
								
								setInterval(waitingConfirm, 1000);

							} else if (data.response[0].result == "failure") {
								$('<span>이메일 발송 실패, 다시 시도해주세요</span>')
										.appendTo('#mail');
								$('span').css({
									"color" : "deeppink",
									"font-size" : "13px",
									"position" : "absolute",
									"left" : "350px",
									"top" : "0px"
								});
							}
						}
					});
				});
	});
</script>
</head>
<body>
<div data-role="page">
<div data-role="header">
<h1>행복해</h1>
</div>
<div data-role="content">
		<form id="joinForm" name="JoinForm" role="form" action="join.lms"
			method="post">		
			
			<div id="id">
				<label for="id">아이디</label> <input type="text" name="id"
					id="idInput" />
				<button type="button" id="idDoubleCheck">중복확인</button>
			</div>
			<div id="pw">
				<label 
				for="password">비밀번호</label> <input type="password" name="password"
					id="pwInput" />
				<div id="pwInputErr">암호를 입력해주세요.</div>
			</div>

			<div id="pw2">
				<label for="password2">비밀번호 확인</label> <input type="password"
					id="pwInputRe" name="password2" />
				<button type="button" onclick="showPW();">보기</button>
				<div id="pwInputReErr">암호를 확인해주세요.</div>
			</div>
			<div id="name">
				<label for="name">이름</label> <input type="text" id="userName"
					name="name">
				<div id="nameErr">이름을 입력해주세요.</div>
			</div>
			<div id="birth">
				<label for="birth">생년월일</label> <input type="text" id="bDay"
					name="birth" readonly="readonly">
				<div id="bDayErr">생년월일을 입력해주세요.</div>
			</div>
			<div id="number">
				<label for="number">연락처</label> <input type="text" id="phoneFirst"
					name="phone">
				<div id="phoErr">전화번호를 입력해주세요.</div>
			</div>
			<div id="mail">
				<label for="mail">e_mail</label> <input type="email" name="mail"
					id="email" />
				<button type="button" id="send">인증메일전송</button>
				<div id="emErr">올바른 이메일 주소를 입력해주세요.</div>
			</div>
			<div id="address">
				<label for="address">주소</label> <input type="text" id="postcode"
					placeholder="우편번호" name="maddnum"> <input type="button"
					onclick="execDaumPostcode()" value="우편번호 찾기"><br> <input
					type="text" id="roadAddress" placeholder="도로명주소" name="maddress"><br>
				<input type="text" id="jibunAddress" placeholder="지번주소"> <span
					id="guide" style="color: #999"></span>
				<div id="addressErr">올바른 주소를 입력해주세요.</div>
			</div>
			<div id="gender">
				<label for="gender">성별</label> <select name="mzen">
					<option value="">성별을 선택해주세요</option>
					<option value="1">남성</option>
					<option value="2">여성</option>
				</select>
				<div id="genErr">성별을 선택해주세요.</div>
			</div>
			<div id="btn">
				<button type="submit" id="jbtn">가입</button>
				<button type="reset" id="cbtn">취소</button>
			</div>
		</form>
	</div>
</div>
</body>
</html>