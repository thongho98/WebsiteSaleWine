<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>404 File Not Found</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
    <!-- Icon -->
    <link href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
</head>

<body>
    <%@include file="../../resources/fragments/header.jsp" %>
    
    <main>
        <div class="site-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <i class="fas fa-check-circle fa-5x text-success"></i>
                        <h2 class="display-3 text-black">404</h2>
                        <p class="lead mb-5">Không tìm thấy trang</p>
                        <p><a href="shop.html" class="btn btn-sm btn-primary">Tiếp tục mua sắm</a></p>
                    </div>
                </div>
            </div>
        </div>
    </main>
    
    <%@include file="../../resources/fragments/footer.jsp" %>
	
    <!--Bootsrap 4 js-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <!--Animation-->
    <script src="https://unpkg.com/scrollreveal"></script>
    <script src="${pageContext.request.contextPath}/resources/js/animation.js"></script>
</body>

</html>