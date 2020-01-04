<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Chi tiết đơn hàng</title>
<style>
table {
	border-collapse: collapse;
	width: 100%;
}

th, td {
	line-height: 25px;
	border: 1px solid black;
	padding: 5px;
}

th {
	background-color: gray;
}
</style>
</head>
<body>
	<div class="page-container">

		<div class="left-content">

			<div class="mother-grid-inner">

				<jsp:include page="header.jsp"></jsp:include>

				<div class="inner-block">
					<div class="inbox">
						<h2>Chi tiết đơn hàng</h2>
						<div class="col-md-12 compose-right">
							<div class="inbox-details-default">
								<div class="inbox-details-heading">Danh sách sản phẩm của
									hóa đơn</div>
								<div class="inbox-details-body">
									<table class="table table-hover">
										<tr>
											<th>Mã sản phẩm</th>
											<th>Tên sản phẩm</th>
											<th>Giá</th>
											<th>Số lượng</th>
											<th>Tổng tiền</th>

										</tr>
										<c:forEach var="l" items="${listBillDetail}">
											<tr>
												<td>${l.products.code}</td>
												<td>${l.products.name}</td>
												<td><fmt:formatNumber pattern="#,###,###,###"
														value="${l.products.price}" /> VNĐ</td>
												<td>${l.quantity}</td>
												<td><fmt:formatNumber pattern="#,###,###,###"
														value="${l.quantity * l.products.price}" /> VNĐ</td>
											</tr>
										</c:forEach>
									</table>
								</div>
							</div>
							<br> <label>Tổng tiền</label>
							<fmt:formatNumber pattern="#,###,###,###" value="${bill.total }" />
							VNĐ <br> <br> <a
								class="btn btn-primary btn-lg py-3 btn-block mt-3"
								href="${pageContext.request.contextPath}/admin/bill.html">Trở
								về danh sách hóa đơn</a>
						</div>

						<div class="clearfix"></div>
					</div>
				</div>

				<jsp:include page="footer.jsp"></jsp:include>

			</div>

		</div>

		<jsp:include page="navigation.jsp"></jsp:include>

	</div>
</body>
</html>
