package com.api.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.api.jpa.entity.Employee;
import com.api.jpa.repo.EmployeeRepository;


@SpringBootApplication(scanBasePackages = {"com.api.jpa.repo","com.api.jpa.controller"})
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void run(String... args) throws Exception {
		List<Employee> employees=employeeRepository.findAll();
		employees.stream().forEach((emp)->{
			System.out.println(emp.getEname());
		});
		System.out.println("Select Employee by id===========");
	//	Employee emp=employeeRepository.findEmployeeById(7369);
	//	System.out.println("Name: "+ emp.getEname());
		System.out.println("Second Max Salary");
		System.out.println(employeeRepository.findSecondLargestSalary());
		System.out.println("Deleting Employee===============");
		//employeeRepository.deleteById(7369);
		System.out.println("Pageable and Sorting TEst================");
		Pageable pageable=PageRequest.of(0, 10, Sort.by("ename").ascending());
		Page<Employee> page= employeeRepository.findAll(pageable);
		page.get().forEach((emp2->{
			System.out.println(emp2.getEname());
		}));
		System.out.println("Sort By Job===============");
		Sort sort=Sort.by("job");
		List<Employee> sortByJob=employeeRepository.findAll(sort);
		sortByJob.stream().distinct().forEach((emp->{
			System.out.println(emp.getJob());
		}));
		
		
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

}
