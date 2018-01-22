package com.srinath.ContactApp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.srinath.ContactApp.Domain.Contact;
import com.srinath.ContactApp.Service.ContactService;


@Controller
public class ContactController {
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping("/user/contact_form")
	public String ContactForm(Model theModel) {
		Contact contact = new Contact();
		theModel.addAttribute("command", contact);
		return "contact_form";
	}
	
	@RequestMapping("/user/update_contact")
	public String updateContact(Model theModel, HttpSession session, @RequestParam("cid") Integer contactId) {
		session.setAttribute("contactid", contactId);
		Contact c = contactService.findById(contactId);
		theModel.addAttribute("command", c);
		return "contact_form";
	}
	
	@RequestMapping(value = "/user/save_contact")
	public String saveOrUpdateContact(@ModelAttribute("command") Contact c, Model theModel, HttpSession session) {
		Integer contactId = (Integer) session.getAttribute("contactid");
		if(contactId == null) {
			try { 
				//saving the contact
				Integer userid = (Integer) session.getAttribute("userid");  //to get the which user is logged in and the contact s set to that user.
				c.setUserId(userid);     
				contactService.save(c);
				return "redirect:contact_list?act=sv"; //redirecting to the contact list url.
			}
			catch(Exception e) {
				e.printStackTrace();
				theModel.addAttribute("err", "failed to save the contact");
				return "contact_form";
			}
		}
		else {
			//updating the contact
			try {
				c.setContactId(contactId);//primary key, with out this we cannot update the contact     
				contactService.update(c);
				session.removeAttribute("contactId");
				return "redirect:contact_list?act=up"; //redirecting to the contact list url.
			}
			catch(Exception e) {
				e.printStackTrace();
				theModel.addAttribute("err", "failed to update the contact");
				return "contact_form";
			}
		}
	
	}
	
	@RequestMapping(value= "/user/contact_list")
	public String ContactList(Model theModel, HttpSession session) {
		Integer userId = (Integer) session.getAttribute("userid");
		theModel.addAttribute("contactlist", contactService.findUserContact(userId));
		return "contact_list";
	}
	
	@RequestMapping(value= "/user/search_contact")
	public String searchContact(Model theModel, HttpSession session, @RequestParam("searchText") String searchText) {
		Integer userId = (Integer) session.getAttribute("userid");
		theModel.addAttribute("contactlist", contactService.findUserContact(userId, searchText));
		return "contact_list";
	}
	
	@RequestMapping(value= "/user/contact_del")
	public String deleteContact(@RequestParam("cid") Integer contactId) {
		contactService.delete(contactId);
		return "redirect:contact_list?act=del";
	}
	
	@RequestMapping(value= "/user/bulk_delete")
	public String deleteBulkContact(@RequestParam("cid") Integer[] contactIds) {
		contactService.delete(contactIds);
		return "redirect:contact_list?act=del";
	}
	
	
	
}
