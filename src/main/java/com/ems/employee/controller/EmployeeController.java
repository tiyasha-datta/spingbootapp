package com.ems.employee.controller;

import com.ems.employee.entities.Employee;
import com.ems.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addEmployees")
    public Employee addEmployees(@RequestBody Employee employee)
    { return this.employeeService.addEmployees(employee);}

    @PutMapping("/updateEmployees")
    public Employee updateEmployees(@RequestBody Employee employee)
    { return this.employeeService.addEmployees(employee);}

    @DeleteMapping("/deleteEmployee/{id}")
    public ResponseEntity<HttpStatus> deleteEmployees(@PathVariable Long id){
        try{
            this.employeeService.deleteEmployees(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/viewEmployeeById/{id}")
    public List<Employee> viewEmployeeById(@PathVariable Long id){
        return this.employeeService.viewEmployeeById(id);
    }

}
