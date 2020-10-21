package com.clean.sample.domain.exception;

public class NotAllowedException extends RuntimeException {
    public NotAllowedException(final String message) {
        super(message);
    }
}
