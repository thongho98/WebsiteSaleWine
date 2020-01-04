<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
	<div class="site-section mt-3 mb-3">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h2 class="h3 mb-3 text-black">Đăng nhập</h2>
				</div>
				<div class="col-md-6">

					<form:form action="sign-in.html" method="POST"
						modelAttribute="loginRequest">
						<div class="p-3 p-lg-6 border">
							<div class="form-group row">
								<div class="col-md-12">
									<label class="text-black">Tên tài khoản<span
										class="text-danger">*</span></label>
									<form:input type="text" class="form-control"
										placeholder="Vui lòng nhập tên tài khoản của Quý khách"
										path="username" required="required" />
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-12">
									<label class="text-black">Mật khẩu<span
										class="text-danger">*</span></label>
									<form:input type="password" class="form-control"
										placeholder="Vui lòng nhập password của Quý khách"
										path="password" required="required" />
								</div>
							</div>

							<div class="form-group row">
								<div class="col-md-12">
									<p class="text-danger">${message}</p>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-lg-12">
									<button type="submit" class="btn btn-primary btn-lg btn-block">ĐĂNG
										NHẬP</button>
								</div>
							</div>
						</div>
					</form:form>

				</div>
				<div class="col-md-6 ml-auto">
					<label class="text-black">HOẶC ĐĂNG NHẬP BẰNG</label>
					<hr>
					<div class="form-group row">
						<div class="col-lg-6">
							<a href="#" class="btn btn-primary btn-lg btn-block"><i
								class="fa fa-facebook-square"></i> FACEBOOK</a>
						</div>
						<div class="col-lg-6">
							<a href="#" class="btn btn-danger btn-lg btn-block"><i
								class="fa fa-google-plus-official"></i> GOOGLE +</a>
						</div>
					</div>
					<label class="text-black">BẠN CHƯA CÓ TÀI KHOẢN?</label>
					<hr>
					<div class="form-group row">
						<div class="col-lg-12">
							<a href="sign-up.html" class="btn btn-primary btn-lg btn-block">TẠO
								TÀI KHOẢN MỚI</a>
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
</body>

</html>