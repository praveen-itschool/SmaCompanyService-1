package com.nareshit.raghu.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nareshit.raghu.exception.CompanyNotFoundException;
import com.nareshit.raghu.payload.response.ErrorMessage;

@RestControllerAdvice
public class CustomExceptionHandler {
    @ExceptionHandler(CompanyNotFoundException.class)
    public ResponseEntity<ErrorMessage> handleCompanyNotFoundException(CompanyNotFoundException cnfe) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(
                new ErrorMessage(
                        new Date().toString(),
                        cnfe.getMessage(),
                        HttpStatus.INTERNAL_SERVER_ERROR.value(),
                        HttpStatus.INTERNAL_SERVER_ERROR.name()
                )
        );
    }
}
