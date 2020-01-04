<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login</title>
        
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
        <link href="${pageContext.request.contextPath}/resources/admin/css/bootstrap.css" rel='stylesheet' type='text/css'/>
        <!-- Custom Theme files -->
        <link href="${pageContext.request.contextPath}/resources/admin/css/style.css" rel='stylesheet' type='text/css'/>
        <!--icons-css-->
        <link href="${pageContext.request.contextPath}/resources/admin/css/font-awesome.css" rel="stylesheet" type="text/css"/> 
        
    </head>
    <body>

        <div class="login-page">
            <div class="login-main">  	
                <div class="login-head">
                    <h1>Login</h1>
                </div>
                <div class="login-block">
                    <form:form method="POST" action="login.html" modelAttribute="loginRequest">
                        <p style="color: red">${message}</p><br />
                        <p>Username:</p>
                        <form:input path="username"/>
                        <p>Password:</p>
                        <form:password path="password"/>
                        <div class="forgot-top-grids">
                            <div class="forgot">
                                <a href="#">Forgot password?</a>
                            </div>
                            <div class="clearfix"> </div>
                        </div>
                        <input type="submit" name="Sign In" value="Login">	
                        <h2>or login with</h2>
                        <div class="login-icons">
                            <ul>
                                <li><a href="#" class="facebook"><i class="fa fa-facebook"></i></a></li>
                                <li><a href="#" class="twitter"><i class="fa fa-twitter"></i></a></li>
                                <li><a href="#" class="google"><i class="fa fa-google-plus"></i></a></li>						
                            </ul>
                        </div>
                    </form:form>
                </div>
            </div>
        </div>
        <!--inner block end here-->
        <!--copy rights start here-->
        <div class="copyrights">
            <p>Design by  <a href="https://teamvietdev.com/" target="_blank">WineShop</a> </p>
        </div>	

    </body>
</html>
