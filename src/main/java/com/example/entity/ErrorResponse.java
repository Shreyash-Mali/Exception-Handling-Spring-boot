package com.example.entity;

import java.time.LocalDateTime;

public class ErrorResponse {
    LocalDateTime TimeStamp;
    String errormessage;
    String errorDetails;
    String errorCode;

    public ErrorResponse() {

    }

    public LocalDateTime getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public String getErrorDetails() {
        return errorDetails;
    }

    public void setErrorDetails(String errorDetails) {
        this.errorDetails = errorDetails;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ErrorResponse(String errormessage, String errorDetails, String errorCode) {
        this.TimeStamp = LocalDateTime.now();
        this.errormessage = errormessage;
        this.errorDetails = errorDetails;
        this.errorCode = errorCode;
    }
}
