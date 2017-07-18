package com.spring.application.dto;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.Pattern;


public class StudentDetailsInputDto {
	private int studentId;
	@Pattern(regexp="[^0-9]*")
	private String studentName;
	private Date dob;
	private String contactNumber;
	private ArrayList<String> skillSet;
	private String institution;
	private String scholarShip;
	
	public String getScholarShip() {
		return scholarShip;
	}
	public void setScholarShip(String scholarShip) {
		this.scholarShip = scholarShip;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public ArrayList<String> getSkillSet() {
		return skillSet;
	}
	public void setSkillSet(ArrayList<String> skillSet) {
		this.skillSet = skillSet;
	}
	public String getInstitution() {
		return institution;
	}
	public void setInstitution(String institution) {
		this.institution = institution;
	}
}
