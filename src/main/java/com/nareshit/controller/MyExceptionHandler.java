package com.nareshit.controller;

import com.nareshit.exception.EmployeeNotFoundException;
import com.nareshit.exception.model.ErrorType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class MyExceptionHandler {


    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorType> empNotFoundExHandler(EmployeeNotFoundException exception){

        return new ResponseEntity<>(new ErrorType(exception.getMessage(),
                "EMPLOYEE ID NOT EXISt","EMPLOYEE",
                "EMPLOYEE ID NOT FOUND"),
                HttpStatus.BAD_REQUEST);
    }
}
