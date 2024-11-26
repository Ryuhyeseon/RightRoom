<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<link href="<c:url value='/resources/css/main/searchPlace.css' />"
	rel="stylesheet" type="text/css">

<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,700,0,200" />

<br>
<br>
<h2>"성공적인 비즈니스를 위한 최적의 장소를 찾아보세요"</h2>
<div id="requirements">
	<div class="requirement">
		<span class="material-symbols-outlined"> map 지역</span>
	</div>
	<div class="requirement" style="border-left: solid 2px grey;">
		<span class="material-symbols-outlined"> groups 인원</span>
	</div>
	<div class="requirement" style="border-left: solid 2px grey;">
		<span class="material-symbols-outlined"> calendar_month 날짜</span>
	</div>
	<div class="requirement" style="border-left: solid 2px grey;">
		<span class="material-symbols-outlined"> schedule 시간</span>
	</div>
	<button type="button" onclick="location.href='userRoomList'">검색</button>
</div>

<div class="square-container">
	<div class="square"></div>
	<div class="square"></div>
	<div class="square"></div>
</div>