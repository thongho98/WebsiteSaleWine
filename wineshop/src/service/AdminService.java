package service;

import entity.User;

public interface AdminService {
	
	public User checkLoginAdmin(String username, String password);
}
