package com.ems.employee.controller;

import com.ems.employee.entities.Employee;
import com.ems.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/viewEmployees")
    public List<Employee> listEmployees(){
        return this.employeeService.listEmployees();
    }
}
