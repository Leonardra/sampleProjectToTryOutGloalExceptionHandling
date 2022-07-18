package com.github.projectwithcontrolleradvice.web.controller;


import com.github.projectwithcontrolleradvice.exceptions.CityNotFoundException;
import com.github.projectwithcontrolleradvice.web.dtos.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@RestControllerAdvice
public class ApiAdvice {


    @ExceptionHandler(CityNotFoundException.class)
    public ResponseEntity<ApiError> handleCityNotFoundException(Exception ex){
        ApiError apiError = ApiError.builder()
                .timestamp(Timestamp.valueOf(LocalDateTime.now()))
                .errorMessage(ex.getMessage())
                .httpStatus(HttpStatus.NOT_FOUND)
                .build();

        return new ResponseEntity<>(apiError, HttpStatus.valueOf(404));
    }
}
