package com.ems.employeemanagementsystem.Service;

import com.ems.employeemanagementsystem.Entity.Employee;
import org.springframework.cache.annotation.Cacheable;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees() throws InterruptedException;


    Employee getEmployeeById(Long id);

    Employee modifyEmployee(Employee employee);

    void deleteEmployee(Long id);
}
