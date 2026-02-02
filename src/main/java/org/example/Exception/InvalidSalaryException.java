package org.example.Exception;

public class InvalidSalaryException extends RuntimeException{
    public InvalidSalaryException(String message) {
        super(message);
    }
}
