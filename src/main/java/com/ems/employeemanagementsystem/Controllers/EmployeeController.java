package com.ems.employeemanagementsystem.Controllers;

import com.ems.employeemanagementsystem.Entity.Employee;
import com.ems.employeemanagementsystem.Repository.EmployeeRepository;
import com.ems.employeemanagementsystem.Service.EmployeeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/employees")
    public String listEmployees(Model model){

        model.addAttribute("employees", employeeService.getAllEmployees());

        return "employees";

    }

    @GetMapping("/employees/new")
    public String newEmployee(Model model){

        Employee employee = new Employee();
        model.addAttribute("employee", employee);

        return "new_employee";
    }

    @PostMapping("/employees")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){

        employeeRepository.save(employee);

        return "redirect:/employees";
    }

    @GetMapping("/employees/edit/{id}")
    public String updateEmployee(@PathVariable Long id, Model model){
        model.addAttribute("employee", employeeService.getEmployeeById(id));

        return "edit_employee";
    }

    @PostMapping("/employees/{id}")
    public String modifyEmployee(@PathVariable Long id,
                                 @ModelAttribute("employee") Employee employee,
                                 Model model){

        Employee existingEmployee = employeeService.getEmployeeById(id);

        existingEmployee.setFirstName(existingEmployee.getFirstName());
        existingEmployee.setLastName(existingEmployee.getLastName());
        existingEmployee.setFirstLineAddress(existingEmployee.getFirstLineAddress());
        existingEmployee.setSecondLineAddress(existingEmployee.getSecondLineAddress());
        existingEmployee.setCity(existingEmployee.getCity());
        existingEmployee.setPostCode(existingEmployee.getPostCode());
        existingEmployee.setContactNumber(existingEmployee.getContactNumber());
        existingEmployee.setEmail(existingEmployee.getEmail());
        existingEmployee.setPosition(existingEmployee.getPosition());

        employeeService.modifyEmployee(employee);

        return "redirect:/employees";

    }

    @GetMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);

        return "employees";
    }


}
