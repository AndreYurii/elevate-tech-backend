package com.elevate.backend.core.exceptions;

public class InvalidEMailException extends RuntimeException {
    public InvalidEMailException(String message) {
        super(message);
    }
}
