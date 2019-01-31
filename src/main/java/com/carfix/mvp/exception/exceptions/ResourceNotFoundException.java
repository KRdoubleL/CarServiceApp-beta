package com.carfix.mvp.exception.exceptions;

import com.carfix.mvp.error.ErrorType;
import com.carfix.mvp.exception.AbstractAPIException;

public class ResourceNotFoundException extends AbstractAPIException {
    @Override
    public ErrorType getErrorType() {
        return ErrorType.RESOURCE_NOT_FOUND_ERROR;
    }

    public ResourceNotFoundException(String errorMessage) {
        super(errorMessage);
    }

    public ResourceNotFoundException() {
    }
}
