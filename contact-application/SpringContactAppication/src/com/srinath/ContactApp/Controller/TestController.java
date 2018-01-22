package com.srinath.ContactApp.Controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/helloworld")
	public String helloWorld() {
		
		return "hello";
	}
	
	@RequestMapping("/test/ajax_test")
	public String testingAjax() {
		
		return "ajax_test";
	}
	
	@RequestMapping("/test/server_time")
	@ResponseBody
	public String getServerTime() {
		Date d = new Date();
		return d.toString();
	}

}