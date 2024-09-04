package com.example.demo.Services;

import java.util.List;

import com.example.demo.Model.User;




public interface UserService {

	public void saveMyUser(User user);
	public List<User> showAllUsers();
	public void deleteMyUser(int id);
	public void editUser(int id);
	public User findByUsernameAndPassword(String username,String password);
	
}
