<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- jsp지시자 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/resources/bootstrap/bootstrap.min.css"
	rel="stylesheet">
<script
	src="${pageContext.request.contextPath}/resources/bootstrap/bootstrap.bundle.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/jquery/jquery.min.js"></script>
</head>
<body>

<%-- <link href="${pageContext.request.contextPath}/views/homeMethod.jsp"/> --%>


<div class="card">
	<div class="card-header">
	홈
	</div>
	<div class="card-body">
		<img
				src="${pageContext.request.contextPath}/resources/image/photos/photo1.jpg"
				height="100" /> 
			<img src="resources/image/photos/photo2.jpg"
				height="100" />
		</div>
	</div>	
</div>			
<%-- <jsp:include page="/WEB-INF/views/common/bottom.jsp"></jsp:include>	 --%>
												
			 