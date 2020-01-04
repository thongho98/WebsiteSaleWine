<%-- 
    Document   : navigation
    Created on : 28-Nov-2018, 2:39:20 PM
    Author     : TVD
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>navigation</title>
</head>
<body>

	<div class="sidebar-menu">
		<div class="menu">
			<ul id="menu">
				<li><a
					href="${pageContext.request.contextPath}/admin/index.html"><i
						class="fa fa-home"></i><span>Home</span></a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/category.html"><i
						class="fa fa-tags"></i><span>Category</span></a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/product.html"><i
						class="fa fa-copy"></i><span>Product</span></a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/user.html"><i
						class="fa fa-users"></i><span>User</span></a></li>
				<li><a
					href="${pageContext.request.contextPath}/admin/bill.html"><i
						class="fa fa-money"></i><span>Bill</span></a></li>
				<li><a href="#"><i class="fa fa-envelope"></i><span>Mailbox</span></a>
			</ul>
		</div>
	</div>
	<div class="clearfix"></div>

	<!--slide bar menu end here-->
	<script>
		var toggle = true;

		$(".sidebar-icon").click(
				function() {
					if (toggle) {
						$(".page-container").addClass("sidebar-collapsed")
								.removeClass("sidebar-collapsed-back");
						$("#menu span").css({
							"position" : "absolute"
						});
					} else {
						$(".page-container").removeClass("sidebar-collapsed")
								.addClass("sidebar-collapsed-back");
						setTimeout(function() {
							$("#menu span").css({
								"position" : "relative"
							});
						}, 400);
					}
					toggle = !toggle;
				});
	</script>

</body>
</html>
