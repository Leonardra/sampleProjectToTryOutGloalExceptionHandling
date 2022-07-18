package com.github.projectwithcontrolleradvice.web.dtos;

import lombok.Builder;
import org.springframework.http.HttpStatus;

import java.sql.Timestamp;


@Builder
public class ApiError {
    private Timestamp timestamp;
    private String errorMessage;
    private HttpStatus httpStatus;
}
