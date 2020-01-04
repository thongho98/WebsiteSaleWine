package dto;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class RegisterRequest {

	@NotBlank(message="Họ và tên không được để trống!")
	private String displayName;

	@NotBlank(message="Tên người dùng không được để trống!")
	private String username;

	@NotBlank(message="Email không được để trống!")
	@Email
	private String email;

	@NotBlank(message="Số điện thoại không được để trống!")
	private String phone;

	@NotBlank(message="Mật khẩu không được để trống!")
	private String password;
	
	@NotBlank(message="Xác nhận lại mật khẩu không được để trống!")
	private String confirmPassword;

	private boolean active = true;
	
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}
	
}
