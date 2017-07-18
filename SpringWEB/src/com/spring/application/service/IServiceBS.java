package com.spring.application.service;

import com.spring.application.dto.StudentDetailsInputDto;
import com.spring.application.dto.StudentDetailsOutputDto;

public interface IServiceBS {
	
	public String insertStudentDetails(StudentDetailsInputDto studentDto);
	public StudentDetailsOutputDto fetchStudentDetails(StudentDetailsInputDto student);

}
