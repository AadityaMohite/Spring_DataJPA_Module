package com.Aadi.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aadi.entity.Employee;
import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
	List<Employee> findByName(String name);
	
	List<Employee> findByDep(String dep);
	
    List<Employee> findByAddress(String address);
    
    
       List<Employee> findByGender(String gender);
       
       List<Employee> findBySalary(Double salary);
       
       List<Employee> findBySalaryGreaterThan(Double salary);

       
      List<Employee> findByDepAndGender(String dep,String gender);

	
}
