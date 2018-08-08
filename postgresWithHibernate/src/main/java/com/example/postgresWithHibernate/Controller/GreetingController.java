package com.example.postgresWithHibernate.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
	
	@RequestMapping("/hi")
	public String hello(){
		return "from greeting controller method hello";
	}

}
