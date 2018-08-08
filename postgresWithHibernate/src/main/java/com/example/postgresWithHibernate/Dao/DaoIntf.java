package com.example.postgresWithHibernate.Dao;

import java.util.List;



import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.postgresWithHibernate.Pojos.Interviewer;
@Transactional
@Repository
public interface DaoIntf extends CrudRepository<Interviewer,Long>{
	
//	@Query(
//			  value = "SELECT u FROM public.interviewer_panel u", 
//			  nativeQuery = true)
//			List<InterviewerPojos> findAllActiveInterviewerPojosNative();

	
	public List<Interviewer> findAll();
}
