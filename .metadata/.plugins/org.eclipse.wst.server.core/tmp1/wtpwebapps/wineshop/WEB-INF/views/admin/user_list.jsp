<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Danh sách người dùng</title>
</head>
<body>

	<div class="page-container">

		<div class="left-content">

			<div class="mother-grid-inner">

				<jsp:include page="header.jsp"></jsp:include>

				<div class="inner-block">
					<div class="inbox">
						<h2>Quản lí người dùng</h2>
						<div class="col-md-12 mailbox-content  tab-content tab-content-in">
							<div class="tab-pane active text-style" id="tab1">
								<div class="mailbox-border">
									<div class="mail-toolbar clearfix">
										<div class="float-left">
											<div class="btn btn_1 btn-default mrg5R">
												<i class="fa fa-refresh"> </i>
											</div>
											<div class="btn btn_1 btn-default mrg5R">
												<a href="admin/user/insert.html"><i class="fa fa-plus"></i></a>
											</div>
											<div class="clearfix"></div>
										</div>
										<div class="float-right">
											<span class="text-muted m-r-sm">Showing ${countItem} of ${totalItem} </span>
											<div class="btn-group">
												<a class="btn btn-default"><i class="fa fa-angle-left"></i></a>
												<c:forEach var="i" begin="0" end="${page}">
													<a class="btn btn-default"
														href="admin/user/${i+1}.html"><c:out
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
												<td class="hidden-xs">Mã người dùng</td>
												<td class="hidden-xs">Tên hiển thị</td>
												<td>Email</td>
												<td>Phone</td>
												<td>Vai trò</td>
												<td>Tình trạng</td>
												<td></td>
											</tr>
											<c:forEach var="item" items="${listUser}">
												<tr class="unread checked">
													<td class="hidden-xs">${item.id}</td>
													<td class="hidden-xs">${item.displayName}</td>
													<td>${item.email }</td>
													<td>${item.phone}</td>
													<td>${item.role.roleName}</td>
													<td>${item.active?'Hoạt động':'Không hoạt động'}</td>
													<td style="text-align: center; width: 150px;"><a
														class="btn btn-default"
														href="admin/user/update/${item.id}.html"><i
															class="fa fa-edit"></i></a> <a class="btn btn-default"
														href="admin/user/remove/${item.id}.html"><i
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
