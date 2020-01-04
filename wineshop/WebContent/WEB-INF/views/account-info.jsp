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
<style>
*[id$=errors] {
	color: red;
	font-style: italic;
}
</style>
</head>

<body>

	<%@include file="../../resources/fragments/header.jsp"%>
	<main>
	<div class="site-section">
		<div class="container">
			<div class="row">
				<div class="col-lg-2 col-md-3 col-sm-3"></div>
				<div class="col-md-8" id="account">
					<div class="col-lg-12 col-md-12 col-sm-12 mt-3">
						<h2 class="h3 text-black">Thông tin tài khoản</h2>
					</div>
					<form:form action="account-info.html" method="POST"
						modelAttribute="changePassword">
						<div class="p-3 p-lg-6 border">
							<div class="form-group row">
								<div class="col-md-12">
									<p class="text-danger">${message}</p>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-4">
									<label class="text-black">Họ tên</label>
								</div>
								<div class="col-md-8">
									<input value="${sessionScope.usersession.displayName}"
										type="text" class="form-control" readonly />
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-4">
									<label class="text-black">Email</label>
								</div>
								<div class="col-md-8">
									<input value="${sessionScope.usersession.email}" type="email"
										class="form-control" readonly />
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-4">
									<label class="text-black">Số điện thoại</label>
								</div>
								<div class="col-md-8">
									<input value="${sessionScope.usersession.phone}" type="number"
										class="form-control" readonly />
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-6 justify-content-center">
									<label class="h4 mb-3 text-black">Thay đổi mật khẩu</label>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-4">
									<label class="text-black">Mật khẩu cũ</label>
								</div>
								<div class="col-md-8">
									<form:input path="password" type="password"
										class="form-control" />
									<form:errors path="password" />
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-4">
									<label class="text-black">Mật khẩu mới</label>
								</div>
								<div class="col-md-8">
									<form:input path="newPassword" type="password"
										class="form-control"/>
									<form:errors path="newPassword" />
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-4">
									<label class="text-black">Nhập lại mật khẩu mới</label>
								</div>
								<div class="col-md-8">
									<form:input path="confirmNewPassword" type="password"
										class="form-control"/>
									<form:errors path="confirmNewPassword" />
								</div>
							</div>
							<br>
							<div class="form-group row">
								<div class="col-lg-4"></div>
								<div class="col-lg-4">
									<button type="submit" class="btn btn-warning btn-lg btn-block">Cập
										nhật</button>
								</div>
							</div>
						</div>
					</form:form>
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