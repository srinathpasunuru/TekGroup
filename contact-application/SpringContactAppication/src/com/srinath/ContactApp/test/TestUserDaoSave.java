package com.srinath.ContactApp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srinath.ContactApp.Config.SpringRootConfiguration;
import com.srinath.ContactApp.Dao.UserDao;
import com.srinath.ContactApp.Domain.User;

public class TestUserDaoSave {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfiguration.class);
		UserDao userDao = context.getBean(UserDao.class);
		User u = new User();  //these details will be loaded from the registration form
		u.setName("akhil");
		u.setPhone("7382225545");
		u.setAddress("123 kadapa");
		u.setEmail("akhil@gmail.com");
		u.setLoginName("akhil");
		u.setPassword("akhil123");
		u.setRole(1);
		u.setLoginStatus(1);
		
		userDao.save(u);
		System.out.println("------------Data saved----------------");

	}

}