package com.ems.employee.services;


import com.ems.employee.dao.EmployeeDao;
import com.ems.employee.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public List<Employee> listEmployees() {
        return employeeDao.findAll();
    }

    @Override
    public Employee addEmployees(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployees(Employee employee) {
        return employeeDao.save(employee);
    }

    @Override
    public void deleteEmployees(Long parseLong) {
        Employee employee = employeeDao.getById(parseLong);
         employeeDao.delete(employee);
    }

    @Override
    public List<Employee> viewEmployeeById(Long id) {
        return employeeDao.fetchById(id);
    }


}
