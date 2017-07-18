package com.spring.application.dao;

import com.spring.application.dto.StudentDetailsInputDto;
import com.spring.application.dto.StudentDetailsOutputDto;

public interface IDaoImpl {

	public String insertDetails(StudentDetailsInputDto studentDto);
	public StudentDetailsOutputDto fetchDetails(StudentDetailsInputDto student);
	
}
