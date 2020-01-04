<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách hóa đơn</title>
</head>
<body>

	<div class="page-container">

		<div class="left-content">

			<div class="mother-grid-inner">

				<jsp:include page="header.jsp"></jsp:include>

				<div class="inner-block">
					<div class="inbox">
						<h2>Quản lí đơn hàng</h2>
						<div class="col-md-12 mailbox-content  tab-content tab-content-in">
							<div class="tab-pane active text-style" id="tab1">
								<div class="mailbox-border">
									<div class="mail-toolbar clearfix">
										<div class="float-left">
											<div class="btn btn_1 btn-default mrg5R">
												<i class="fa fa-refresh"> </i>
											</div>
											<div class="btn btn_1 btn-default mrg5R">
												<a href="admin/product/insert.html"><i
													class="fa fa-plus"></i></a>
											</div>
											<div class="clearfix"></div>
										</div>
										<div class="float-right">
											<span class="text-muted m-r-sm">Showing ${countItem}
												of ${totalItem} </span>
											<div class="btn-group">
												<a class="btn btn-default"><i class="fa fa-angle-left"></i></a>
												<c:forEach var="i" begin="0" end="${page}">
													<a class="btn btn-default" href="admin/bill/${i+1}.html"><c:out
															value="${i+1}" /></a>
												</c:forEach>
												<a class="btn btn-default"><i class="fa fa-angle-right"></i></a>
											</div>
											<div class="clearfix"></div>
										</div>
									</div>
									<table class="table tab-border">
										<tbody>
											<tr class="unread checked">
												<td class="hidden-xs">Mã đơn hàng</td>
												<td class="hidden-xs">Người đặt hàng</td>
												<td>Thời gian đặt hàng</td>
												<td>Thời gian thanh toán</td>
												<td>Tình trạng</td>
												<td></td>
											</tr>
											<c:forEach var="item" items="${listBill}">
												<tr class="unread checked">
													<td class="hidden-xs">${item.id}</td>
													<td class="hidden-xs">${item.user.displayName}</td>
													<td><fmt:formatDate pattern="dd/MM/yyyy"
														value="${item.checkin}" /></td>
													<td><fmt:formatDate pattern="dd/MM/yyyy"
														value="${item.checkout}" /></td>
													<td>${item.billStatus.name }</td>
													<td style="text-align: center; width: 150px;"><a
														class="btn btn-default"
														href="admin/bill/detail/${item.id}.html"><i
															class="fa fa-eye"></i></a> <a class="btn btn-default"
														href="admin/bill/updateStatus/${item.id}.html"><i
															class="fa fa-check"></i></a> <a class="btn btn-default"
														href="admin/bill/remove/${item.id}.html"><i
															class="fa fa-remove"></i></a></td>
												</tr>
											</c:forEach>
										</tbody>
									</table>
								</div>
							</div>
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
