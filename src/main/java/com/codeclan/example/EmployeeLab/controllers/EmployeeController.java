package com.codeclan.example.EmployeeLab.controllers;

import com.codeclan.example.EmployeeLab.models.Employee;
import com.codeclan.example.EmployeeLab.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value = "/")
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }


}
