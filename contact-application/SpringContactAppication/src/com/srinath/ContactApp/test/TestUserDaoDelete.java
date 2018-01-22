package com.srinath.ContactApp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srinath.ContactApp.Config.SpringRootConfiguration;
import com.srinath.ContactApp.Dao.UserDao;
import com.srinath.ContactApp.Domain.User;

public class TestUserDaoDelete {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfiguration.class);
		UserDao userDao = context.getBean(UserDao.class);
		userDao.delete(2);
		System.out.println("------------Data Deleted----------------");

	}

}
