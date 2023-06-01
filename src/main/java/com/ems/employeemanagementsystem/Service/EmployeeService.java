package com.ems.employeemanagementsystem.Service;

import com.ems.employeemanagementsystem.Entity.Employee;

import java.util.List;

public interface EmployeeService {


    List<Employee> getAllEmployees();


    Employee getEmployeeById(Long id);

    Employee modifyEmployee(Employee employee);

    void deleteEmployee(Long id);
}
