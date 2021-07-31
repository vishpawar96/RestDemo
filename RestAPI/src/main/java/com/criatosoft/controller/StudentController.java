package com.criatosoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.criatosoft.model.Student;
import com.criatosoft.service.StudentService;

@RestController
@RequestMapping("/studentRest")
public class StudentController {
	
	@Autowired
	private StudentService ss;
	
	@PostMapping("/addstudent")
	public Student addStudent(@RequestBody Student stu) {
		
		return ss.addStudent(stu);
	}
	
	@GetMapping("/getStudent/{rollno}")
	public Student getStudentByID(@PathVariable("rollno") int rollno) {
		return ss.getStudentById(rollno);
	}
	

}
