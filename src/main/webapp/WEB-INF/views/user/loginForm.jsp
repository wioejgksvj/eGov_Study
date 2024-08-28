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
		로그인
		</div>
		
		<div class="card-body">	
			<form method="post" action="login">
				<div class="mb-3">
					<label for="bno" class="form-label">아이디를 입력해주세요</label>
					<input type="text" class="form-control" id="mid" name="mid" value="user1">
				</div>
				
				<div class="mb-3">
					<label for="mpassword" class="form-label">비밀번호를 입력해주세요</label>
					<input type="password" class="form-control" id="mpassword" name="mpassword" value="free">			
				</div>
				
				<input type="submit" value="로그인" class="btn btn-info btn-sm"/>
				<br/>
			
			</form>		
			
			<hr/>
			
			<a href="logout" class="btn btn-danger btn-sm">로그아웃</a>		
		</div>
	</div>	
</body>
</html>