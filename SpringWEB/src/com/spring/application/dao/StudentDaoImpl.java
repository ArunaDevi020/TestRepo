/**
 * 
 */
package com.spring.application.dao;


import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.application.dto.StudentDetailsInputDto;
import com.spring.application.dto.StudentDetailsDto;
import com.spring.application.dto.StudentDetailsOutputDto;
import com.spring.application.dto.StudentsDto;
@Repository
public class StudentDaoImpl implements IDaoImpl{
	@Autowired(required=true)
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Override
	public String insertDetails(StudentDetailsInputDto student) {
		// TODO Auto-generated method stub
		StudentDetailsDto studentDto=new StudentDetailsDto();
		Session session=getSessionFactory().openSession();
		session.beginTransaction();
		/*String hql="Insert into StudentDetailsDto (studentId,studentName,dob,contactNumber,skillSet,institution) "
				+ "values(:studentId,:studentName,:dob,:contactNumber,:skillSet,:institution)";*/
		/*session.createSQLQuery(hql);*/
		studentDto.setStudentId(student.getStudentId());
		studentDto.setStudentName(student.getStudentName());
		studentDto.setDob(student.getDob());
		studentDto.setContactNumber(student.getContactNumber());
		studentDto.setSkillSet(student.getSkillSet());
		studentDto.setInstitution(student.getInstitution());
		studentDto.setScholarShip(student.getScholarShip());
		session.save(studentDto);
		session.getTransaction().commit();
		session.close();
		return "Success";
	}

	

	@Override
	public StudentDetailsOutputDto fetchDetails(StudentDetailsInputDto student) {
		StudentDetailsOutputDto outputValues=new StudentDetailsOutputDto();
		String hql="from StudentDetailsDto where studentId = :studentId";
		Query query=(Query) sessionFactory.getCurrentSession().createQuery(hql).list();
		query.setInteger("studentId", student.getStudentId());
		List<Object> dto=query.list();
		System.out.println(dto);
		for(Object outputDto :dto){
			outputValues.setStudentId(((StudentDetailsDto) outputDto).getStudentId());
			outputValues.setStudentName(((StudentDetailsDto) outputDto).getStudentName());
			outputValues.setDob(((StudentDetailsDto) outputDto).getDob());
			outputValues.setContactNumber(((StudentDetailsDto) outputDto).getContactNumber());
			outputValues.setSkillSet(((StudentDetailsDto) outputDto).getSkillSet());
			outputValues.setInstitution(((StudentDetailsDto) outputDto).getInstitution());
			outputValues.setScholarShip(((StudentDetailsDto) outputDto).getScholarShip());
			
		}
		return outputValues;
	}
}
