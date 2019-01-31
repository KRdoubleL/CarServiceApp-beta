package com.carfix.mvp.exception.exceptions;


import com.carfix.mvp.error.ErrorType;
import com.carfix.mvp.exception.AbstractAPIException;

public class SystemException extends AbstractAPIException {

    public SystemException(String errorMessage) {
        super(errorMessage);
    }

    public SystemException() {
    }

    @Override
    public ErrorType getErrorType() {
        return ErrorType.SYSTEM;
    }

}
