package com.spring.application.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class StudentDetailsDto {
	@Id 
	@Column(name="STUDENT_ID")
	private int studentId;
	@Column(name="STUDENT_NAME")
	private String studentName;
	@Column(name="STUDENT_DOB")
	private Date dob;
	@Column(name="STUDENT_CONTACTNUM")
	private String contactNumber;
	@Column(name="STUDENT_SKILLSET")
	private ArrayList<String> skillSet;
	@Column(name="STUDENT_INSTITUTION")
	private String institution;
	@Column(name="STUDENT_SCHOLARSHIP")
	private String scholarShip;
	
	public String getScholarShip() {
		return scholarShip;
	}
	public void setScholarShip(String scholarShip) {
		this.scholarShip = scholarShip;
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

	@Override
	public String toString() {
		return "StudentDetailsDto [studentId=" + studentId + ", studentName="
				+ studentName + ", dob=" + dob + ", contactNumber="
				+ contactNumber + ", skillSet=" + skillSet + ", institution="
				+ institution + ", scholarShip=" + scholarShip + "]";
	}

}
