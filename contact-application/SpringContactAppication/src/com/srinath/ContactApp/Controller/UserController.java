package com.srinath.ContactApp.Controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srinath.ContactApp.Domain.User;
import com.srinath.ContactApp.Exception.UserBlockedException;
import com.srinath.ContactApp.Service.UserService;
import com.srinath.ContactApp.command.LoginCommand;
import com.srinath.ContactApp.command.UserCommand;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	
	@RequestMapping(value = {"/", "/index"})  //url mapping
	public String index(Model theModel) {
		theModel.addAttribute("command", new LoginCommand());
		return "index"; //return a jsp page in /web-inf/view/
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String LoginHandling(@ModelAttribute("command") LoginCommand cmd, Model theModel, HttpSession session) {
		
		try {
			
			User loggedInUser = userService.login(cmd.getLoginName(), cmd.getPassword());
			if(loggedInUser == null) {
				//if the loggedInUser is not in the database then display a error message and return to the login page
				theModel.addAttribute("err","Login Failed! Enter the valid credentials.");
				return "index"; //this is the login form
			}
			else{
				//if the role is user then redirect to the user dashboard
				if(loggedInUser.getRole().equals(UserService.role_user)) {
					//adding the user detail to the session 
					addUserToSession(loggedInUser, session);
					return "redirect:user/Dashboard";
				}
				//if the role is admin then redirect to admin dashboard
				else if(loggedInUser.getRole().equals(UserService.role_admin)) {
					//adding the user detail to the session 
					addUserToSession(loggedInUser, session);
					return "redirect:admin/Dashboard";
				}
				else {
					//if the role is something else then print the error message
					theModel.addAttribute("err", "Invalid User Role");
					return "index"; //this is the login form
				}
			}
		} catch (UserBlockedException e) {
			//add the error message and then go back to the login form
			theModel.addAttribute("err", e.getMessage());
			return "index"; //this is the login form
		}
	}
	
	@RequestMapping(value = {"/user/Dashboard"})  //url mapping
	public String userDashboard() {
		return "User_dashboard"; //return a jsp page in /web-inf/view/
	}
	
	@RequestMapping(value = {"/admin/Dashboard"})  //url mapping
	public String adminDashboard() {
		return "Admin_dashboard"; //return a jsp page in /web-inf/view/
	}
	
	@RequestMapping(value = {"/admin/users"})  //url mapping
	public String getUsersList(Model theModel) {
		theModel.addAttribute("userList", userService.getUserList());
		return "users"; //return a jsp page in /web-inf/view/
	}
	
	@RequestMapping(value = {"/logout"})  //url mapping
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:index?act=lo"; //return a jsp page in /web-inf/view/
	}
	
	@RequestMapping(value = "/reg_form")
	public String registrationForm(Model theModel) {
		UserCommand cmd = new UserCommand();
		theModel.addAttribute("command", cmd);
		return "reg_form";
	}
	
	@RequestMapping(value = "/register")
	public String registerUser(@ModelAttribute("command") UserCommand cmd, Model theModel) {
		try {
		User user = cmd.getUser();
		user.setRole(userService.role_user);
		user.setLoginStatus(userService.Login_Status_Actice);
		userService.UserRegister(user);
		return "redirect:index?act=reg";
		}
		catch(DuplicateKeyException e) {
			e.printStackTrace();
			theModel.addAttribute("err", "Username is already existed. please try another username");
			return "reg_form";
		}
	}
	
	@RequestMapping(value = "/admin/status_change")
	@ResponseBody
	public String changeLStatus(@RequestParam Integer userId, @RequestParam Integer loginStatus) {
		try {
			userService.changeLoginStatus(userId, loginStatus);
			return "success: Status Changed";
		}
		catch(Exception e) {
			e.printStackTrace();
			return "Error: failed to change status";
		}
	}
	
	@RequestMapping(value = "/check_availability")
	@ResponseBody
	public String checkAvailability(@RequestParam String userName) {
		if(userService.isUserNameAvailable(userName)) {
			return "This name is already taken. please try another";
		}
		else {
			return "Yes! this name is available";
		}
	}
	
	@SuppressWarnings("unused")
	private void addUserToSession(User u, HttpSession session) {
		
		session.setAttribute("user", u);
		session.setAttribute("userid", u.getUserId());
		session.setAttribute("user_role", u.getRole());
	}
}
