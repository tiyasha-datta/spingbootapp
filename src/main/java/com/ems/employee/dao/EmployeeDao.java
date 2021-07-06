package com.ems.employee.dao;

import com.ems.employee.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeDao extends JpaRepository<Employee, Long> {

    @Query("select e from Employee e where e.id = :id")
    public List<Employee> fetchById(@Param("id") Long id);
}
