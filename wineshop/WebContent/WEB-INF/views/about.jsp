<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>About</title>

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
	<div class="site-section border-bottom mt-3" data-aos="fade">
		<div class="container">
			<div class="row mb-5">
				<div class="col-md-12 mb-4">
					<div class="block-16">
						<figure>
							<img
								src="${about.img }"
								alt="Image placeholder" class="img-fluid rounded">
							<a href="#" class="play-button popup-vimeo"><span
								class="ion-md-play"></span></a>
						</figure>
					</div>
				</div>
				<div class="col-md-12 mr-auto">
					<div class="site-section-heading mb-4">
						<h2 class="text-black">GIỚI THIỆU</h2>
					</div>
					<p>${about.description}</p>
				</div>
			</div>
		</div>
	</div>
	</main>

	<%@include file="../../resources/fragments/footer.jsp" %>

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