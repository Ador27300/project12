package com.example.postgresWithHibernate.Pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "InterviewerPanel")
public class Interviewer {
	//default constructor
	
	

	private Long id;
	
	public Interviewer() {
		super();
	}

	private String name;
	

	@Column(name = "email_id")
	private String emailId;
	
	
	private String grade;	
	private String skills;
	@Column(name = "skill_group")
	private String skillGroup;
	private String comments;
	@Column(name = "manager_name")
	private String managerName;

	@Id  
	@Column(nullable = false)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail_id() {
		return emailId;
	}

	public void setEmail_id(String emailId) {
		this.emailId = emailId;
	}
	
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getSkill_group() {
		return skillGroup;
	}

	public void setSkill_group(String skill_group) {
		this.skillGroup = skill_group;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getManager_name() {
		return managerName;
	}

	public void setManager_name(String manager_name) {
		this.managerName = manager_name;
	}

}
