package com.srinath.ContactApp.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srinath.ContactApp.Config.SpringRootConfiguration;
import com.srinath.ContactApp.Dao.UserDao;
import com.srinath.ContactApp.Domain.User;

public class TestUserDaoFindAll {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfiguration.class);
		UserDao userDao = context.getBean(UserDao.class);
		List<User> users = userDao.findAll();
		System.out.println("------------User Detail----------------");
		for(User u: users) {
			System.out.println(u.getUserId()+" "+u.getName()+" "+u.getAddress());
		}
	}

}
