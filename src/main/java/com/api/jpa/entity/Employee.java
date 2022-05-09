package com.api.jpa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "Employee")
@Table(name = "emp")
@NoArgsConstructor
@Data
@ToString
public class Employee {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	@Column
	private String ename;
	@Column
	private String job;
	@Column
	private java.util.Date hiredate;
	@Column
	private double salary;
	//@Column(nullable = true)
	//private double comm;
	  @Column 
	  private int deptid;
	 
	//@ManyToOne
	//@JoinColumn(name = "deptid")
	//private Department dept;
}
