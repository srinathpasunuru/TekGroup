package com.srinath.ContactApp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srinath.ContactApp.Config.SpringRootConfiguration;
import com.srinath.ContactApp.Dao.UserDao;
import com.srinath.ContactApp.Domain.User;

public class TestUserDaoUpdate {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfiguration.class);
		UserDao userDao = context.getBean(UserDao.class);
		User u = new User();  //these details will be loaded from the registration form
		u.setUserId(2);
		u.setName("akhil reddy");
		u.setPhone("7382225545");
		u.setAddress("123 kadapa");
		u.setEmail("akhil.sannapureddy@gmail.com");
		u.setRole(1);
		u.setLoginStatus(1);
		
		userDao.update(u);
		System.out.println("------------Data updated----------------");

	}

}