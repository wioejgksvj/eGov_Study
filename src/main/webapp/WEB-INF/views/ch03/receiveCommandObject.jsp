<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			CommandObject 데이터 읽기
		</div>
		
		<div class="card-body">	
			<p>param1: ${ch03Dto.param1}</p>		
			<p>param2: ${ch03Dto.param2}</p>
			<p>param3: ${ch03Dto.param3}</p>
			<p>param4: ${ch03Dto.param4}</p>
			<p>param5: ${ch03Dto.param5}</p>
		</div>
	</div>	
</body>
</html>