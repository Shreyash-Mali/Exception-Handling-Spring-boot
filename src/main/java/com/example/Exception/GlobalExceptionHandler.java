package com.example.Exception;

import com.example.entity.ErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

public class GlobalExceptionHandler {
    @ExceptionHandler(DuplicateProductException.class)
    public ResponseEntity<ErrorResponse> duplicateProductExceptionHandler(DuplicateProductException duplicateProductException,
                                                                          WebRequest webRequest){
        ErrorResponse errorResponse=new ErrorResponse(duplicateProductException.getMessage(),webRequest.getDescription(false),"DUPLICATE PRODUCT FOUND");
        return new ResponseEntity<>(errorResponse, HttpStatus.CONFLICT);
    }

    
    @ExceptionHandler(ProductNotFountException.class)
    public ResponseEntity<ErrorResponse> productNotFountException(ProductNotFountException productNotFountException,
                                                                  WebRequest webRequest){
        ErrorResponse errorResponse=new ErrorResponse(productNotFountException.getMessage(),webRequest.getDescription(false),"Product Not Fount ");
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);

    }
    

}
