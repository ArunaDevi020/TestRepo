package com.spring.application.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.application.dao.IDaoImpl;
import com.spring.application.dto.StudentDetailsInputDto;
import com.spring.application.dto.StudentDetailsOutputDto;
import com.spring.application.service.IServiceBS;


@Controller
public class MainController {
    @Autowired(required=true)
	private IServiceBS studentService;
	@RequestMapping(value="/studentsdetails.html",method=RequestMethod.GET)
	public ModelAndView getValue(){
		
		ModelAndView model=new ModelAndView("StudentsDetails");
		
		return model;
		
	}
	
	
	@RequestMapping(value="/updatesuccess.html", method=RequestMethod.POST)
	public ModelAndView processDetails(@Valid @ModelAttribute("student") StudentDetailsInputDto student,BindingResult results,ModelMap model){
		ModelAndView modelView=new ModelAndView();
		if(results.hasErrors()){
			ModelAndView modelAndView=new ModelAndView("StudentsDetails");
			return modelAndView;
		}
		String result=studentService.insertStudentDetails(student);
		if(result.equals("Success"))
		{
			fetchDetails(student,model);
			modelView.setViewName("UpdateSuccess");
		}
		else{
			modelView.setViewName("ProcessError");
		}
		return modelView;
	}
	
	
	public void fetchDetails(StudentDetailsInputDto student,ModelMap model){
		StudentDetailsOutputDto outputDto=studentService.fetchStudentDetails(student);
		 model.addAttribute("studentId", outputDto.getStudentId());
		 model.addAttribute("studentName", outputDto.getStudentName());
		 model.addAttribute("dob", outputDto.getDob());
		 model.addAttribute("contactNumber", outputDto.getContactNumber());
		 model.addAttribute("skillSet", outputDto.getSkillSet());
		 model.addAttribute("institution", outputDto.getInstitution());
		 model.addAttribute("scholarShip", outputDto.getScholarShip());
		
	}
	
	
	
}
