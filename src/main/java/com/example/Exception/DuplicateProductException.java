package com.example.Exception;

public class DuplicateProductException extends RuntimeException{
   public DuplicateProductException(String message){
       super(message);
   }
}
