<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="css" value="/resources/css" />
<spring:url var="js" value="/resources/js" />
<spring:url var="images" value="/resources/images" />
<c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Online Shopping - ${title}</title>
<script>
	window.menu = '${title}';

	window.contextRoot = '${contextRoot}'
</script>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" rel="stylesheet">

<!-- Custom styles for readable-theme template -->
<link href="${css}/bootstrap-readable-theme.css" rel="stylesheet">

</head>

<body>

	<div class="wrapper">
		<!-- Navigation -->
		<%@include file="./shared/navbar.jsp"%>

		<!-- Page Content -->

		<div class="content">
			<!-- Loading the home content -->
			<c:if test="${userClickHome==true }">
				<%@include file="home.jsp"%>
			</c:if>


			<!-- Loading the about content -->
			<c:if test="${userClickAbout==true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Loading the Contact content -->
			<c:if test="${userClickContact==true }">
				<%@include file="about.jsp"%>
			</c:if>

			<!-- Loading the List of products content -->
			<c:if
				test="${userClickAllProducts==true or userClickcategoryProducts==true }">
				<%@include file="listProducts.jsp"%>
			</c:if>
		</div>
		<!-- /.container  -->
		<!-- Footer -->
		<%@include file="./shared/footer.jsp"%>

		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.min.js"></script>
		<!-- self coded java script -->
		<script src="${js}/myapp.js"></script>
		<!-- j query data table plug in-->
		<script src="${js}/jquery.dataTables.js"></script>
		
	</div>
</body>

</html>