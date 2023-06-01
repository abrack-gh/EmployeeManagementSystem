package com.ems.employeemanagementsystem.Repository;

import com.ems.employeemanagementsystem.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
