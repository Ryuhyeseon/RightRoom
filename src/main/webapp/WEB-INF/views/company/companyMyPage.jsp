<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link href="<c:url value='/resources/css/company/companyMyPage.css' />" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0" />


<body>
	
	<div class="signUp">
	<h2>마이 페이지</h2>

	</div>
	<div class="container">
		<div class="box">
		<span class="material-symbols-outlined">badge</span>
		<p>업체정보</p>
		<p class="sub-text">조회 / 수정 / 삭제</p>
		</div>
		<div class="box">
		<span class="material-symbols-outlined">library_add</span>
		<p>장소 등록하기</p>
		<p class="sub-text">장소 등록</p>
		</div>
	</div>
	<div class="container">
		<div class="box">
		<span class="material-symbols-outlined">dashboard</span>
		<p>내 장소 목록</p>
		<p class="sub-text">조회 / 수정 / 삭제</p>
		</div>
		<div class="box">
		<span class="material-symbols-outlined">assignment_turned_in</span>
		<p>예약 관리</p>
		<p class="sub-text">예약 목록 및 예약서 확인</p>
		</div>
	</div>
</body>