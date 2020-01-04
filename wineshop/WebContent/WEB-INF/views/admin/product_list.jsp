<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>product list</title>
</head>
<body>

	<div class="page-container">

		<div class="left-content">

			<div class="mother-grid-inner">

				<jsp:include page="header.jsp"></jsp:include>

				<div class="inner-block">
					<div class="inbox">
						<h2>Product Manage</h2>
						<div class="col-md-12 mailbox-content  tab-content tab-content-in">
							<div class="tab-pane active text-style" id="tab1">
								<div class="mailbox-border">
									<div class="mail-toolbar clearfix">
										<div class="float-left">
											<div class="btn btn_1 btn-default mrg5R">
												<i class="fa fa-refresh"> </i>
											</div>
											<div class="btn btn_1 btn-default mrg5R">
												<a href="admin/product/insert.html"><i class="fa fa-plus"></i></a>
											</div>
											<div class="clearfix"></div>
										</div>
										<div class="float-right">
											<span class="text-muted m-r-sm">Showing ${countItem} of ${totalItem} </span>
											<div class="btn-group">
												<a class="btn btn-default"><i class="fa fa-angle-left"></i></a>
												<c:forEach var="i" begin="0" end="${page}">
													<a class="btn btn-default"
														href="admin/product/${i+1}.html"><c:out
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
												<td class="hidden-xs">Mã SP</td>
												<td class="hidden-xs">Tên Sản Phẩm</td>
												<td>Số lượng</td>
												<td>Giá</td>
												<td>Nguồn gốc</td>
												<td>Tình trạng</td>
												<td></td>
											</tr>
											<c:forEach var="item" items="${listProduct}">
												<tr class="unread checked">
													<td class="hidden-xs">${item.code}</td>
													<td class="hidden-xs">${item.name}</td>
													<td>${item.quantity }</td>
													<td>${item.price} VNĐ</td>
													<td>${item.madein}</td>
													<td>${item.productstatus.name}</td>
													<td style="text-align: center; width: 150px;"><a
														class="btn btn-default"
														href="admin/product/update/${item.id}.html"><i
															class="fa fa-edit"></i></a> <a class="btn btn-default"
														href="admin/product/remove/${item.id}.html"><i
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
