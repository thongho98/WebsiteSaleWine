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
</head>

<body>

	<%@include file="../../resources/fragments/header.jsp"%>

	<main>
	<div class="section-1">
		<div class="container text-center">
			<div class="category-title">
				<h1 class="heading-1">GIỎ HÀNG</h1>
			</div>
		</div>
	</div>
	<div class="site-section mb-3">
		<div class="container">
			<div class="row mb-3">
				<form class="col-md-12" method="post">
					<div class="site-blocks-table">
						<table class="table table-bordered">
							<thead>
								<tr>
									<th class="product-thumbnail">Hình ảnh</th>
									<th class="product-name">Sản phẩm</th>
									<th class="product-price">Giá</th>
									<th class="product-quantity">Số lượng</th>
									<th class="product-total">Tổng cộng</th>
									<th class="product-remove">Xóa khỏi giỏ hàng</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="map" items="${sessionScope.myCartItems}">
									<tr>
										<td class="product-thumbnail"><img
											src="${map.value.product.url}" style="max-width: 50px;"
											alt="Image" class="img-fluid"></td>
										<td class="product-name">
											<h2 class="h5 text-black">${map.value.product.name}</h2>
										</td>
										<td><fmt:formatNumber pattern ="#,###,###,###" value = "${map.value.product.price}"/> VNĐ</td>
										<td>
											<div class="input-group mb-3" style="max-width: 120px;">
												<input type="number" name="quantity"
													class="form-control text-center" value="<c:out value="${map.value.quantity}"/>" placeholder=""
													aria-label="Example text with button addon"
													aria-describedby="button-addon1" min="1" readonly>
											</div>
										</td>
										<td><fmt:formatNumber pattern ="#,###,###,###" value = "${map.value.product.price * map.value.quantity}"/> VNĐ</td>
										<td><a
											href="${pageContext.request.contextPath}/shopping-cart/remove/${map.value.product.id}.html"
											class="btn btn-primary btn-sm">X</a></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</form>
			</div>

			<div class="row">
				<div class="col-md-6">
					<div class="row mb-5">
						<div class="col-md-6">
							<a href="product.html"
								class="btn btn-outline-primary btn-sm btn-block">Tiếp tục
								mua sắm</a>
						</div>
					</div>
				</div>
				<div class="col-md-6 pl-5">
					<div class="row justify-content-end">
						<div class="col-md-7">
							<div class="row">
								<div class="col-md-12 text-right border-bottom mb-5">
									<h3 class="text-black h4 text-uppercase">Tổng giỏ hàng</h3>
								</div>
							</div>
							<div class="row mb-5">
								<div class="col-md-6">
									<span class="text-black">Tổng tiền</span>
								</div>
								<div class="col-md-6 text-right">
									<strong class="text-black"><fmt:formatNumber pattern ="#,###,###,###" value = "${sessionScope.myCartTotal}"/> VNĐ</strong>
								</div>
							</div>

							<div class="row">
								<div class="col-md-12">
									<a class="btn btn-primary btn-lg py-3 btn-block"
										href="${pageContext.request.contextPath}/shopping-cart/paying.html">Thanh Toán</a>
								</div>
							</div>
						</div>
					</div>
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
	<script
		src="${pageContext.request.contextPath}/resources/js/animation.js"></script>
	<script
		src="${pageContext.request.contextPath}/resources/js/slideshow-product.js"></script>
</body>

</html>