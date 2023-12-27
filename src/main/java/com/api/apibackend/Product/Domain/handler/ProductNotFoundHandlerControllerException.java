package com.api.apibackend.Product.Domain.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.api.apibackend.Product.Domain.exception.ProductNotFoundException;

@ControllerAdvice
public class ProductNotFoundHandlerControllerException {
    @ExceptionHandler(ProductNotFoundException.class)
    public ResponseEntity<String> handleRegistrationFailedException(ProductNotFoundException ex) {
        String errorMessage = ex.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
    }
}