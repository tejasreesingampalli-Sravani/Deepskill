package com.employee.employeemanagement.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.employee.employeemanagement.entity.Employee;
import com.employee.employeemanagement.service.EmployeeService;

@RestController
public class EmployeeController {


@Autowired
EmployeeService service;


@PostMapping("/employees")
public String addEmployee(@RequestBody Employee employee){

    service.addEmployee(employee);

    return "Employee Added";

}

}