package com.carfix.mvp.exception;


import com.carfix.mvp.error.ErrorType;
import com.carfix.mvp.error.errors.InputValidationError;

import java.util.List;

public abstract class ValidationException extends AbstractAPIException {

    public ValidationException(String errorMessage) {
        super(errorMessage);
    }

    public ValidationException() {
    }

    public abstract ErrorType getErrorType();

    @Override
    public InputValidationError getErrorResponse() {
        return new InputValidationError(getErrorMessage(), getErrorType(), getErrors());
    }

    protected abstract List<String> getErrors();
}