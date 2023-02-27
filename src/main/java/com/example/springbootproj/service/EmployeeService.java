package com.example.springbootproj.service;

import java.util.List;
import com.example.springbootproj.model.Employee;
public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
}
