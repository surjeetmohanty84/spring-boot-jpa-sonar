package com.api.jpa.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.api.jpa.entity.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
//	@Query("select new com.api.jpa.entity.ResultEmployee(emp.empid,emp.ename,emp.job,emp.hiredate,emp.salary,emp.deptid) from Employee emp")

	@Query("select e from Employee e where e.empid= :empid")
	public Employee findEmployeeById(@Param("empid") int empid);
	@Query("select max(e.salary) from Employee e where e.salary NOT IN (select max(e1.salary) from Employee e1)")
	public double findSecondLargestSalary();
	//update data
	@Modifying
	@Query("update Employee e set e.ename= :ename where e.empid= :empid")
	public void updateEmployee(@Param("ename") String ename, @Param("empid") int empid);
	@Modifying
	@Query("delete Employee e where e.empid= :empid")
	public void deleteEmployeeById(@Param("empid") int empid);
	
	//@Query("select e from emp e where e.empid= :empid")
	//public Page<Employee> findEmployee(@Param("ename")String ename,Pageable pageable);
}
