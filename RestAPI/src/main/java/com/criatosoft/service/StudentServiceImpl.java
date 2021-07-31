package com.criatosoft.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.criatosoft.model.Student;
import com.criatosoft.repository.StudentRepository;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository sr;
	
	
	@Override
	public Student addStudent(Student stu) {
		Student stud = sr.save(stu);
		return stud;
	}

	@Override
	public Student getStudentById(int rollno) {
		
		return null;
	}

	@Override
	public Student updateStudent(Student stu) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteStudentById(int rollno) {
		// TODO Auto-generated method stub
		
	}

}
