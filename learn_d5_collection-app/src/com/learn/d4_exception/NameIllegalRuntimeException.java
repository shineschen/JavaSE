package com.learn.d4_exception;

public class NameIllegalRuntimeException extends RuntimeException{
    public NameIllegalRuntimeException() {
    }

    public NameIllegalRuntimeException(String message) {
        super(message);
    }
}
