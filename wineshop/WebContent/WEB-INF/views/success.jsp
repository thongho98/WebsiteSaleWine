<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css">
    <!-- Icon -->
    <link href="${pageContext.request.contextPath}/resources/vendor/fontawesome-free/css/all.min.css" rel="stylesheet">
</head>

<body>
    <%@include file="../../resources/fragments/header.jsp"%>
    <main>
        <div class="site-section">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <i class="fas fa-check-circle fa-5x text-success"></i>
                        <p class="lead mb-5">Bạn đã đăng kí tài khoản thành công.</p>
                        <p><a href="sign-in.html" class="btn btn-sm btn-primary">Đăng nhập ngay!</a></p>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <%@include file="../../resources/fragments/footer.jsp"%>

    <!--Bootsrap 4 js-->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"></script>
    <!--Animation-->
    <script src="https://unpkg.com/scrollreveal"></script>
    <script src="${pageContext.request.contextPath}/resources/js/animation.js"></script>
</body>

</html>