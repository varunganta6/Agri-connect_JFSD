package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	  @Autowired
	  private  UserRepository userRepository;
	  
	  
	  
	@Override
	public void saveMyUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
	}

//	@Override
//	public List<User> showAllUsers() {
//		List<User> users=new ArrayList<>();
//	    for(User user:userRepository.findAll())
//	    {
//	      users.add(user);
//	    }
//	    return users;
//	}
	
	@Override
	  public List<User> showAllUsers() {
	    
	    return (List<User>) userRepository.findAll();
	  }

	@Override
	public void deleteMyUser(int id) {
		// TODO Auto-generated method stub
		userRepository.deleteById(id);
	}
	
	public void editUser(int id)
	{
		userRepository.findById(id);
	}
	
	public User findByUsernameAndPassword(String username,String password)
	{
		return userRepository.findByUsernameAndPassword(username, password);
	}

	
}
