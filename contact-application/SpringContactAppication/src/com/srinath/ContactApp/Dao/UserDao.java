package com.srinath.ContactApp.Dao;

import java.util.List;

import com.srinath.ContactApp.Domain.User;

public interface UserDao {
	
	public void save(User u);
	public void update(User u);
	public void delete(User u);
	public void delete(Integer userId);
	public User fingById(Integer userId);
	public List<User> findAll();
	public List<User> findByProperty(String propName, Object propValue);
	

}
