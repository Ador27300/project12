package com.example.postgresWithHibernate.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.postgresWithHibernate.Dao.DaoIntf;
import com.example.postgresWithHibernate.Pojos.Interviewer;
@Component
public class RecruiterManagmentService{
@Autowired
DaoIntf dao; 
	public List<Interviewer> displayAllInterviewers(){
		return dao.findAll();
	}

}
