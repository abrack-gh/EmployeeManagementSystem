package com.ems.employeemanagementsystem.Service.impl;

import com.ems.employeemanagementsystem.Entity.Employee;
import com.ems.employeemanagementsystem.Repository.EmployeeRepository;
import com.ems.employeemanagementsystem.Service.EmployeeService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.Thread.sleep;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        super();
        this.employeeRepository = employeeRepository;
    }

    @Cacheable("employees")
    public List<Employee> getAllEmployees() throws InterruptedException {
        sleep(1000);
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {

        return employeeRepository.findById(id).get();
    }

    @Override
    @CacheEvict(value = "employees", allEntries = true) // Will update the whole repository with new cache.
    public Employee modifyEmployee(Employee employee) {

        return employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(Long id) {

        employeeRepository.deleteById(id);

    }
}
