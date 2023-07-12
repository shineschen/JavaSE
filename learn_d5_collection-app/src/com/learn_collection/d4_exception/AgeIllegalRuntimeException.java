package com.learn_collection.d4_exception;

/**
 * 必须继承为RuntimeException
 */
public class AgeIllegalRuntimeException extends RuntimeException{
    public AgeIllegalRuntimeException() {
    }

    public AgeIllegalRuntimeException(String message) {
        super(message);
    }
}
