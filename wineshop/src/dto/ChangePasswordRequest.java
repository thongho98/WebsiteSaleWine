package dto;

import org.hibernate.validator.constraints.NotBlank;

public class ChangePasswordRequest {

	@NotBlank(message="Mật khẩu không được để trống!")
	private String password;

	@NotBlank(message="Mật khẩu mới không được để trống!")
	private String newPassword;

	@NotBlank(message="Xác nhận mật khẩu mới không được để trống!")
	private String confirmNewPassword;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public String getConfirmNewPassword() {
		return confirmNewPassword;
	}

	public void setConfirmNewPassword(String confirmNewPassword) {
		this.confirmNewPassword = confirmNewPassword;
	}

}
