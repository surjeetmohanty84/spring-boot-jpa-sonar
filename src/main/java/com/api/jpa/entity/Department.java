package com.api.jpa.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

//@Entity(name = "Department")
//@Table(name = "dept")
@Data
@NoArgsConstructor
public class Department {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int deptid;
	@Column
	private String dname;
	@Column
	private String loc;
	@OneToMany(mappedBy="dept")
	private Set<Employee> employees;
	
}
