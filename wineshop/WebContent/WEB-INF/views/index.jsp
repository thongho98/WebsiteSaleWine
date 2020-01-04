<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Home</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
<!-- Icon -->
<link
	href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css"
	rel="stylesheet">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/slideshow-product.css">
<!--Carousel-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendor/owlcarousel/css/owl.carousel.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/vendor/owlcarousel/css/owl.theme.default.min.css">
</head>
<body>
	<%@include file="../../resources/fragments/header.jsp"%>
	<main>
	<div class="container-fluid p-0">
		<div class="site-content">
			<div class="d-flex justify-content-center">
				<div class="d-flex flex-column text-center">
					<h1 class="site-title">RƯỢU VANG CHÍNH HÃNG</h1>
					<p class="site-desc">Nhấn vào để vào cửa hàng ngay</p>
					<div class="d-flex flex-row">
						<a href="shop.html"
							class="btn btn-danger site-btn1 px-4 py-3 mr-4">Vào cửa hàng
							ngay</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!--Slide Show-->
	<div class="section-1">
		<div class="container text-center">
			<div class="category-title">
				<h1 class="heading-1">SẢN PHẨM MỚI NHẤT</h1>
			</div>
		</div>
	</div>
	<div class="carousel slide carousel-multi-item mb-3"
		data-ride="carousel">
		<div class="carousel-inner">
			<div class="container">
				<div class="owl-carousel owl-theme">
					<c:forEach var="l" items="${listNewProduct}">
						<div class="col-md-4 item" style="width: 5rem;">
							<div class="card">
								<img src="${l.url }" alt="Img1" class="card-img-top">
								<div class="card-body">
									<h4 class="card-title">${l.name }</h4>
									<p class="card-text">
										<span>Giá: </span><fmt:formatNumber pattern ="#,###,###,###" value = "${l.price}"/> VNĐ
									</p>
									<a href="shopping-cart/add/${l.id}.html" class="btn btn-danger ml-3">Mua ngay</a> 
									<a href="detail/${l.id}.html" class="btn btn-success ml-3">Xem
									chi tiết</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<!--End Slide Show--> 
	 <!--Slide Show-->
	<div class="section-1">
		<div class="container text-center">
			<div class="category-title">
				<h1 class="heading-1">VANG Ý</h1>
			</div>
		</div>
	</div>
	<div class="carousel slide carousel-multi-item mb-3"
		data-ride="carousel">
		<div class="carousel-inner">
			<div class="container">
				<div class="owl-carousel owl-theme">
					<c:forEach var="listItalia" items="${listProductItalia}">
						<div class="col-md-4 item" style="width: 5rem;">
							<div class="card">
								<img src="${listItalia.url}" alt="Img1" class="card-img-top">
								<div class="card-body">
									<h4 class="card-title">${listItalia.name}</h4>
									<p class="card-text">
										<span>Giá: </span><fmt:formatNumber pattern ="#,###,###,###" value = "${listItalia.price}"/> VNĐ
									</p>
									<a href="shopping-cart/add/${listItalia.id}.html" class="btn btn-danger ml-3">Mua ngay</a>  <a
										href="detail/${listItalia.id}.html" class="btn btn-success ml-3">Xem
										chi tiết</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<!--End Slide Show-->
	<!--Slide Show-->
	<div class="section-1">
		<div class="container text-center">
			<div class="category-title">
				<h1 class="heading-1">VANG PHÁP</h1>
			</div>
		</div>
	</div>
	<div class="carousel slide carousel-multi-item mb-3"
		data-ride="carousel">
		<div class="carousel-inner">
			<div class="container">
				<div class="owl-carousel owl-theme">
					<c:forEach var="listFrance" items="${listProductFrance}">
						<div class="col-md-4 item" style="width: 5rem;">
							<div class="card">
								<img src="${listFrance.url}" alt="Img1" class="card-img-top">
								<div class="card-body">
									<h4 class="card-title">${listFrance.name}</h4>
									<p class="card-text">
										<span>Giá: </span><fmt:formatNumber pattern ="#,###,###,###" value = "${listFrance.price }"/> VNĐ
									</p>
									<a href="shopping-cart/add/${listFrance.id}.html" class="btn btn-danger ml-3">Mua ngay</a>  
									<a href="detail/${listFrance.id}.html" class="btn btn-success ml-3">Xem
										chi tiết</a>
								</div>
							</div>
						</div>
					</c:forEach>
				</div>
			</div>
		</div>
	</div>
	<!--End Slide Show-->
	<div class="section-2">
		<div class="container-fluid p-0">
			<div class="d-flex justify-content-end">
				<div class="d-flex flex-column m-4">
					<h1 class="heading-1">Like & Share</h1>
					<p class="para">Lorem ipsum dolor sit amet consectetur,
						adipisicing elit.</p>
					<input type="text" class="btn btn-danger" value="Show">
				</div>
			</div>
		</div>
	</div>

	<div class="section-3">
		<div class="container">
			<div class="row">
				<div class="col-md-4 mt-3">
					<div class="d-flex flex-row">
						<i class="fas fa-phone-alt fa-3x m-2"></i>
						<div class="d-flex flex-column">
							<h3 class="m-2">Tư vấn tận tâm</h3>
							<p class="m-2">Gọi ngay: 0784360899</p>
						</div>
					</div>
				</div>

				<div class="col-md-4 mt-3">
					<div class="d-flex flex-row">
						<i class="fas fa-truck fa-3x m-2"></i>
						<div class="d-flex flex-column">
							<h3 class="m-2">Giao hàng tận nơi</h3>
							<p class="m-2">Giao hàng miễn phí giao hàng nội thành tại
								TPHCM, Hà Nội, Đà Nẵng</p>
						</div>
					</div>
				</div>
				<div class="col-md-4 mt-3">
					<div class="d-flex flex-row">
						<i class="fas fa-thumbs-up fa-3x m-2"></i>
						<div class="d-flex flex-column">
							<h3 class="m-2">Sản phẩm</h3>
							<p class="m-2">Cam kết hàng chính hãng</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div class="section-4 bg-dark">
		<div class="container">
			<div class="row">
				<div class="col-md-7">
					<img
						src="http://blog.logoart.vn/wp-content/uploads/2018/02/Bolden_preview-600x375.png"
						alt="" width="590px">
				</div>
				<div class="col-md-5">
					<h1 class="text-white">Khám phá về rượu chúng tôi</h1>
					<a href="about.html" class="btn btn-success text-light">Tìm hiểu ngay</a>
				</div>
			</div>
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
	<!--Carousel-->
	<script defer
		src="${pageContext.request.contextPath}/resources/vendor/owlcarousel/js/owl.carousel.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/vendor/owlcarousel/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/animation.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/slideshow-product.js"></script>
</body>
</html>