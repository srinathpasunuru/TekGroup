package com.srinath.ContactApp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srinath.ContactApp.Config.SpringRootConfiguration;
import com.srinath.ContactApp.Dao.UserDao;
import com.srinath.ContactApp.Domain.User;
import com.srinath.ContactApp.Service.UserService;

public class TestUserServiceRegistration {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfiguration.class);
		UserService userService = context.getBean(UserService.class);
		User u = new User();  //these details will be loaded from the registration form
		u.setName("nikhil");
		u.setPhone("7382223454");
		u.setAddress("waraangal");
		u.setEmail("nikhil@gmail.com");
		u.setLoginName("nikhil");
		u.setPassword("nikhil123");
		u.setRole(userService.role_admin);
		u.setLoginStatus(userService.Login_Status_Actice);
		
		userService.UserRegister(u);
		System.out.println("------------Data saved----------------");

	}

}
