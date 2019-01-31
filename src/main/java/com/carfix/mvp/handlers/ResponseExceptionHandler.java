package com.carfix.mvp.handlers;

import com.carfix.mvp.error.ErrorResponse;
import com.carfix.mvp.error.ErrorType;
import com.carfix.mvp.exception.AbstractAPIException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ResponseExceptionHandler {

    @ExceptionHandler(AbstractAPIException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> getAPIExceptionResponse(AbstractAPIException exception) {

        exception.printStackTrace();

        HttpStatus httpStatus = HttpStatus.valueOf(exception.getErrorType().getHttpCode());
        return new ResponseEntity<>(exception.getErrorResponse(), httpStatus);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse> getSystemExceptionResponse(Exception exception) {
        exception.printStackTrace();

        ErrorType errorType = ErrorType.SYSTEM;

        ErrorResponse errorResponse = new ErrorResponse(exception.getMessage(), errorType);

        HttpStatus httpStatus = HttpStatus.valueOf(errorType.getHttpCode());

        return new ResponseEntity<>(errorResponse, httpStatus);
    }
}
