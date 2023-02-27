package com.example.springbootproj.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.springbootproj.model.Employee;
import com.example.springbootproj.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    //@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public void saveEmployee(Employee employee)
    {
        this.employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(long id)
    {
        Optional<Employee> optional = employeeRepository.findById(id);
        Employee employee = null;
        if(optional.isPresent())
        {
            employee = optional.get();
        }else {
            throw new RuntimeException("Employee not found");
        }
        return employee;
    }

    @Override
    public void deleteEmployeeById(long id)
    {
        this.employeeRepository.deleteById(id);
    }

}
