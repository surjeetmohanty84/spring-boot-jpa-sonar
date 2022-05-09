package com.api.jpa.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResultEmployee {
	//Expected arguments are: int, java.lang.String, java.lang.String, java.util.Date, double, int
	private int empid;
	private String ename;
	private String job;
	private java.util.Date hiredate;
	private double salary;
	private int deptid;
}
