package com.example.postgresWithHibernate.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.postgresWithHibernate.Pojos.Interviewer;

public interface ServiceIntf {

	List<Interviewer> displayAllInterviewers();



}
