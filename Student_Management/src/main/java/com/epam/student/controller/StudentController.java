package com.epam.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.epam.student.entity.Student;
import com.epam.student.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@RequestMapping("/")
	public String home() {
		return "redirect:/showStudents";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "login";
	}
	
	@RequestMapping("/logout-success")
	public String loginOutPage() {
		return "redirect:/";
	}
	
	@GetMapping("showStudents")
	public ModelAndView getStudents() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("students", studentService.getStudents());
		modelandview.setViewName("student-list");
		return modelandview;
	}
	
	
	@GetMapping(value = "/showAddStudentPage")
	public ModelAndView addStudentList() {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("student", new Student());
		modelandview.setViewName("add-student");
		return modelandview;
	}
	
	
	@PostMapping(value = "/save-student")
	public String saveStudentList(Student student) {
		if(student.getId() == 0) {
			studentService.saveStudent(student);
		}
		else {
			studentService.update(student);
		}
		return "redirect:/showStudents";
	}
	
	
	@GetMapping(value = "/updateStudent")
	public ModelAndView updateStudent(@RequestParam("userId") int id) {
		ModelAndView modelandview = new ModelAndView();
		modelandview.addObject("student", studentService.getStudent(id));
		modelandview.setViewName("add-student");
		return modelandview;
	}
	
	
	@GetMapping(value="/deleteStudent")
	public String deleteStudent(@RequestParam("userId") int id) {
		studentService.deleteStudent(id);
		return "redirect:/showStudents";
	}
	
	
}
