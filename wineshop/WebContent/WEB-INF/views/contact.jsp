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
<style>
*[id$=errors]{
	color:red;
	font-style: italic;
}
</style>
</head>

<body>

	<%@include file="../../resources/fragments/header.jsp"%>

	<main>
	<div class="site-section mb-3">
		<div class="container">
			<div class="row">
				<div class="col-md-12 mt-3">
					<h2 class="h3 mb-3 text-black">Ý KIẾN</h2>
				</div>
				<div class="col-md-7">
					<form:form action="contact/insert.html" method="post" modelAttribute="contact">
						<div class="p-3 p-lg-5 border">
						${message}
							<div class="form-group row">
								<div class="col-md-12">
									<label for="c_fname" class="text-black">Họ tên <span
										class="text-danger">*</span></label> 
									<form:input type="text"
										class="form-control" id="c_fname" name="c_fname" path="name"/>
										<form:errors path="name" cssClass="error"/>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-12">
									<label for="c_email" class="text-black">Email<span
										class="text-danger">*</span></label> <form:input type="email"
										class="form-control" id="c_email" name="c_email"
										placeholder="" path="email"/>
										<form:errors path="email" cssClass="error"/>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-md-12">
									<label for="c_subject" class="text-black">Tiêu đề </label> <form:input
										type="text" class="form-control" id="c_subject"
										name="c_subject" path="title"/>
										<form:errors path="title" cssClass="error"/>
								</div>
							</div>

							<div class="form-group row">
								<div class="col-md-12">
									<label for="c_message" class="text-black">Nội dung </label>
									<form:textarea name="c_message" id="c_message" cols="30" rows="7"
										class="form-control" path="content"></form:textarea>
										<form:errors path="content" cssClass="error"/>
								</div>
							</div>
							<div class="form-group row">
								<div class="col-lg-12">
									<input type="submit" class="btn btn-primary btn-lg btn-block"
										value="GỬI">
								</div>
							</div>
						</div>
					</form:form>
				</div>
				<div class="col-md-5 ml-auto">
					<div class="p-4 border mb-3">
						<span class="d-block text-primary h6 text-uppercase">Hà Nội</span>
						<p class="mb-0">97, Man Thiện, Quận 9</p>
					</div>
					<div class="p-4 border mb-3">
						<span class="d-block text-primary h6 text-uppercase">Đã Nẵng</span>
						<p class="mb-0">97, Man Thiện, Quận 9</p>
					</div>
					<div class="p-4 border mb-3">
						<span class="d-block text-primary h6 text-uppercase">Thành phố Hồ Chí Minh</span>
						<p class="mb-0">97, Man Thiện, Quận 9</p>
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