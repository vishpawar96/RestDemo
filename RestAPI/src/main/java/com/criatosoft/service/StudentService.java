package com.criatosoft.service;

import com.criatosoft.model.Student;

public interface StudentService {
	
	
	public Student addStudent(Student stu);
	public Student getStudentById(int rollno);
	public Student updateStudent(Student stu);
	public void deleteStudentById(int rollno);

}
