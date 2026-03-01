package com.Aadi.BookRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Aadi.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
