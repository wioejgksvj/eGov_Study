<!-- 태그 주석(응답에 포함) -->
<!-- JSP 주석(응답에 포함안됨) -->

<!-- page 지시자 -->
<%-- 
language: 프로그래밍 언어의 종류
pageEncoding: jsp 소스를 작성할 때 사용할 문자셋(다국어 이용 => UTF-8)
contentType: JSP의 실행결과(응답 내용)의 종류(MIME타입; charset=응답을 구성하는 문자셋)
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> <!-- jsp지시자 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="${pageContext.request.contextPath}/resources//bootstrap/bootstrap.min.css" rel="stylesheet">
      <script src="${pageContext.request.contextPath}/resources//bootstrap/bootstrap.bundle.min.js"></script>
      <script src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>
</head>
</head>
<body>
	<div class="card">
		<div class="card-header">
		pick
		</div>
		
		<div class="card-body">		
		찜한상품	
		</div>
	</div>	
</body>
</html>