package com.example.demo.Repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	@Query("select a from User a where a.username=?1 and a.password=?2 ")
	public User findByUsernameAndPassword(String username,String password);
}
