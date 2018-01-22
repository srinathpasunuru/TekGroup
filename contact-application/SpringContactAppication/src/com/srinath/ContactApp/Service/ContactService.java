package com.srinath.ContactApp.Service;

import java.util.List;

import com.srinath.ContactApp.Domain.Contact;

public interface ContactService {

	public void save(Contact c);
	public void update(Contact c);
	public void delete(Integer contactId);
	public void delete(Integer[] contactIds);
	public Contact findById(Integer contactId);
	
	//this method will return all the users that are logged in
	public List<Contact> findUserContact(Integer userId);
	
	//this method searches the contact of the user based on the given string criteria
	public List<Contact> findUserContact(Integer userId, String txt);
	
}