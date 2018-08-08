package com.example.postgresWithHibernate.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.postgresWithHibernate.Pojos.Interviewer;
import com.example.postgresWithHibernate.Service.RecruiterManagmentService;
import com.example.postgresWithHibernate.Service.ServiceIntf;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/rm")
public class RecruiterManagmentController {

@Autowired

//ServiceIntf recruitService;
RecruiterManagmentService recruitService;
	@RequestMapping("/display")
	public ResponseEntity<?> displayList(){
		System.out.println("Inside Display List");
		List<Interviewer> ip = new ArrayList<>();
		ip = (List<Interviewer>) recruitService.displayAllInterviewers();
		System.out.println(ip);
	   return new ResponseEntity<List<Interviewer>>(ip, HttpStatus.OK);

		
	}

}
