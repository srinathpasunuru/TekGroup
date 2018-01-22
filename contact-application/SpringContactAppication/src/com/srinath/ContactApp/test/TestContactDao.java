package com.srinath.ContactApp.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.srinath.ContactApp.Config.SpringRootConfiguration;
import com.srinath.ContactApp.Dao.ContactDao;
import com.srinath.ContactApp.Dao.UserDao;
import com.srinath.ContactApp.Domain.Contact;
import com.srinath.ContactApp.Domain.User;

public class TestContactDao {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringRootConfiguration.class);
		ContactDao contactDao = context.getBean(ContactDao.class);
		Contact c = new Contact();  //these details will be loaded from the registration form
		
		c.setUserId(1);
		c.setName("varun");
		c.setPhone("3239220232");
		c.setEmail("varun@gmail.com");
		c.setAddress("123 hyderabad");
		c.setRemark("nice person");
		
		contactDao.save(c);
		System.out.println("------------Data saved----------------");
		
		

	}

}
