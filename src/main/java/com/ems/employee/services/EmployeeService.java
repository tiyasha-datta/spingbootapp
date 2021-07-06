package com.ems.employee.services;

import com.ems.employee.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

    public List<Employee> listEmployees();
}
