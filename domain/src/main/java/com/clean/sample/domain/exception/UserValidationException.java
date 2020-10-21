package com.clean.sample.domain.exception;

public class UserValidationException extends RuntimeException {

    public UserValidationException(final String message) {
        super(message);
    }

}
