package com.employee.employeemanagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.employeemanagement.entity.Employee;
import com.employee.employeemanagement.repository.EmployeeRepository;


@Service
public class EmployeeService {


    @Autowired
    private EmployeeRepository employeeRepository;


    public void addEmployee(Employee employee){

        employeeRepository.save(employee);

    }

}