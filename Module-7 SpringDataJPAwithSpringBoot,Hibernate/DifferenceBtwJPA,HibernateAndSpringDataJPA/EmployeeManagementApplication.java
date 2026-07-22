package com.employee.employeemanagement;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.employee.employeemanagement.entity.Employee;
import com.employee.employeemanagement.repository.EmployeeRepository;


@SpringBootApplication
public class EmployeeManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeeManagementApplication.class, args);

    }


    @Bean
    CommandLineRunner runner(EmployeeRepository repository) {

        return args -> {

            Employee employee = new Employee(
                    1,
                    "Surya",
                    "CSE"
            );

            repository.save(employee);

            System.out.println("Employee saved successfully");

        };

    }

}