package com.ems.employeemanagementsystem.Controllers;

import com.ems.employeemanagementsystem.Repository.EmployeeRepository;
import com.ems.employeemanagementsystem.Service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    private EmployeeService employeeService;
    private EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeService employeeService,
                              EmployeeRepository employeeRepository) {
        super();
        this.employeeService = employeeService;
        this.employeeRepository = employeeRepository;
    }

    @GetMapping("/employee")
    public String listEmployees(Model model){

        model.addAttribute("employees", employeeService.getAllEmployees());

        return "employees";

    }


}
