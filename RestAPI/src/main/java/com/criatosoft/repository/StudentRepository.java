package com.criatosoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.criatosoft.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
