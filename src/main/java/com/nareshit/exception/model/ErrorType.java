package com.nareshit.exception.model;

public class ErrorType {

    private String message;
    private String error;
    private String classType;
    private String status;

    public ErrorType(){}
    public ErrorType(String message, String error, String classType, String status) {
        this.message = message;
        this.error = error;
        this.classType = classType;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
