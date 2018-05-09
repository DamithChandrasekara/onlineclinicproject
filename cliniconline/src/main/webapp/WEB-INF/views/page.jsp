<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<spring:url var="fonts" value="/resources/font" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Clinic Project - ${title}</title>

<script>

	window.menu = '${title}';
</script>

<!-- Bootstrap -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="${css}/font-awesome.min.css">
<link href="${css}/animate.min.css" rel="stylesheet">
<link href="${css}/prettyPhoto.css" rel="stylesheet">
<link href="${css}/main.css" rel="stylesheet">
<link href="${css}/responsive.css" rel="stylesheet">


</head>
<body class="homepage">


	<!-- Navigation Start -->
	<%@include file="./common/navbar.jsp"%>
	<!-- Navigation End -->

	<!-- SLIDER Start -->
	<c:if test="${UserClickedHome == true}">
		<%@include file="./common/slider.jsp"%>
	</c:if>
	<!-- SLIDER END -->

	<!-- SLIDER END -->

	<!-- OUR SERVICES START -->
	<%@include file="./common/services.jsp"%>
	<!--OUR SERVICES END-->


	<!-- RECENTLY WORK -->
	<%@include file="./common/recentwork.jsp"%>
	<!-- RECENTLY WORK END-->


	<!-- BOTTOM START -->
	<%@include file="./common/bottom.jsp"%>
	<!--/BOTTOM END-->

	<!-- TOP BAR -->
	<%@include file="./common/sociallink.jsp"%>
	<!-- TOP BAR -->

	<!-- FOOTER START -->

	`<%@include file="./common/footer.jsp"%>
	<!-- FOOTER END -->
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script src="${js}/jquery.js"></script>
	<script src="${js}/bootstrap.min.js"></script>
	<script src="${js}/jquery.prettyPhoto.js"></script>
	<script src="${js}/jquery.isotope.min.js"></script>
	<script src="${js}/wow.min.js"></script>
	<script src="${js}/main.js"></script>
	
	<script src="${js}/myapp.js"></script>
</body>
</html>
