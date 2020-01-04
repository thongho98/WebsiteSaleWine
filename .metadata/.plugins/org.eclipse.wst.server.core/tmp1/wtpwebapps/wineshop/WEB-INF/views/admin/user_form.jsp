<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Quản lí người dùng</title>
</head>
<body>
	<div class="page-container">

		<div class="left-content">

			<div class="mother-grid-inner">

				<jsp:include page="header.jsp"></jsp:include>

				<div class="inner-block">
					<div class="inbox">
						<h2>Cập nhật người dùng</h2>
						<div class="col-md-12 compose-right">
							<div class="inbox-details-default">
								<div class="inbox-details-heading">Form cập nhật người
									dùng</div>
								<div class="inbox-details-body">
									<div class="alert alert-info">${message}</div>
									<form:form action="admin/user/insert.html"
										class="com-mail" modelAttribute="user" methods="POST">
										<label>Họ và tên</label>
										<form:input type="text" path="displayName"/>
										<label>Username</label>
										<form:input type="text" path="username" />
										<label>Password</label>
										<form:input type="password" path="password"/>
										<br>
										<label>Email</label>
										<form:input type="text" path="email" />
										<br>
										<br>
										<label>Phone</label>
										<form:input type="number" path="phone" />
										<br>
										<br>
										<label>Tình trạng</label>
										<!-- Combobox -->
										<form:select path="active">
											<form:option value="true">Hoạt động</form:option>
											<form:option value="false">Không hoạt động</form:option>
										</form:select>

										<label>Quyền</label>
										<!-- Combobox -->
										<form:select path="role.id" items="${role}" itemValue="id"
											itemLabel="roleName" />
										<br>
										<br>
										<button type="submit">Thêm mới</button>
									</form:form>
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
