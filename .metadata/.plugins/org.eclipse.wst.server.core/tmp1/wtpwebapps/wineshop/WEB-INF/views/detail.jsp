<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Detail</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<!-- Icon -->
<link
	href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet">
</head>

<body>

	<%@include file="../../resources/fragments/header.jsp"%>
	<main>
	<div class="site-section">
		<div class="container">
			<form:form action="/detail/{id}.html" modelAttribute="productDetail">
				<div class="row pt-3">
					<div class="col-lg-5 col-md-3 col-sm-3">
						<img class="d-block w-70" src="${productDetail.url}" alt="">
					</div>
					<div class="info col-md-7">
						<h2>${productDetail.name }</h2>
						<p>
							<b>Giới thiệu: </b>
						</p>
						<p>${productDetail.description }</p>
						<p>
							<b>Mã sản phẩm:</b> ${productDetail.code}
						</p>
						<p>
							<b>Độ cồn:</b> ${productDetail.alcohol} %
						</p>
						<p>
							<b>Giá: </b> <b class="text-danger"> <fmt:formatNumber pattern ="#,###,###,###" value = "${productDetail.price}"/></b>VNĐ
						</p>
						<p>
							<b>Hãng sản xuất:</b> ${productDetail.madein}
						</p>
						<br>
						<a href="shopping-cart/add/${productDetail.id}.html" class="btn btn-danger mt-3 mr-3">THÊM GIỎ HÀNG</a>
						<a href="shopping-cart.html" class="btn btn-success mt-3">MUA
							NGAY</a>
					</div>
				</div>
			</form:form>
		</div>
	</div>
	</main>

	<%@include file="../../resources/fragments/footer.jsp"%>

	<!--Bootsrap 4 js-->
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
	<!--Animation-->
	<script src="https://unpkg.com/scrollreveal"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/animation.js"></script>
</body>

</html>