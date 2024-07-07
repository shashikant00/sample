package com.nareshit.controller;

import com.nareshit.model.Employee;
import com.nareshit.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HomeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/get")
    public String showWishMsg(){
        return "SpringBoot project is Running..";
    }

    @PostMapping("/")
    public ResponseEntity<Employee> saveEmployeeData(@RequestBody Employee employee)
    {
        return new ResponseEntity<>(employeeService.saveEmployeeData(employee),HttpStatus.CREATED);
    }

    @GetMapping("/getAll")
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("/get/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable("id") Integer id){
        return employeeService.getEmployeeById(id);
    }

    //Write a method to find only email
    @GetMapping("/email")
    public List<String> getEmployeeByEmail(){
        return employeeService.getEmployeeByEmail();
    }

}
