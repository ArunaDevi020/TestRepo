package com.spring.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.application.dao.IDaoImpl;
import com.spring.application.dto.StudentDetailsInputDto;
import com.spring.application.dto.StudentDetailsOutputDto;

@Service
public class StudentServiceImpl implements IServiceBS{

	@Autowired(required=true)
	private IDaoImpl  StudentDao;
	
	@Transactional
	public String insertStudentDetails(StudentDetailsInputDto studentDto) {
		String result="";
		result=StudentDao.insertDetails(studentDto);
		return result;
	}

	public StudentDetailsOutputDto fetchStudentDetails(
			StudentDetailsInputDto student) {
		StudentDetailsOutputDto outputDto=new StudentDetailsOutputDto();
		outputDto=StudentDao.fetchDetails(student);
		return outputDto;
	}

}
