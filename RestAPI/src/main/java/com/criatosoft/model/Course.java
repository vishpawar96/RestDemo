package com.criatosoft.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Course {
	@Id
	private int cid;
	private String cname;

}
