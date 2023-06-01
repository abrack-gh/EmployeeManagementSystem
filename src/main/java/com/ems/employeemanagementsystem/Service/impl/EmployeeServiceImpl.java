package com.ems.employeemanagementsystem.Service.impl;

import com.ems.employeemanagementsystem.Entity.Employee;
import com.ems.employeemanagementsystem.Repository.EmployeeRepository;
import com.ems.employeemanagementsystem.Service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
}
