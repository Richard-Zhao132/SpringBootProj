package com.example.springbootproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springbootproj.model.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
