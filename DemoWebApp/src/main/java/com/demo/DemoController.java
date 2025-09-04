package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//annotation
@Controller
@ResponseBody
public class DemoController {
	
	@RequestMapping("/test")
	public String show() {
		return "Welcome to Spring Boot Web App";
	}
}
