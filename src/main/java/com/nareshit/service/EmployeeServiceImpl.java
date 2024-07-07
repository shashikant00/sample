package com.nareshit.service;

import com.nareshit.model.Employee;
import com.nareshit.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;


    @Override
    public Employee saveEmployeeData(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(Integer id) {
        Optional<Employee> opt=employeeRepository.findById(id);
        if(opt.isPresent()){
            return opt;
        }
        return null;
    }

    @Override
    public List<String> getEmployeeByEmail() {

        List<Employee> empEmail=employeeRepository.findAll();

        List<String> empl=new ArrayList<>();

        for(Employee email :empEmail)
        {
            empl.add(email.getEmail());
        }
        return empl;
    }


}
