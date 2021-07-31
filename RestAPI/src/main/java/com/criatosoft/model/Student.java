package com.criatosoft.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;
@Data
@Entity
public class Student {
	@Id
	private int rollno;
	private String name;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Course> lcourse= new ArrayList<>();

}
