package com.nareshit.service;

import com.nareshit.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EmployeeService {
    Employee saveEmployeeData(Employee employee);

    List<Employee> getAllEmployee();

    Optional<Employee> getEmployeeById(Integer id);

   List<String> getEmployeeByEmail();
}
