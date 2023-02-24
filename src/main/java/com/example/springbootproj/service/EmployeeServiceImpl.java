package com.example.springbootproj.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.springbootproj.model.Employee;
import com.example.springbootproj.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    //@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
}
