package com.dreams.dream.common.exception;

@SuppressWarnings("serial")
public class ValidateException extends RuntimeException {

    public ValidateException() {
    }

    public ValidateException(String msg) {
        super(msg);
    }

    public ValidateException(int msgId) {
        super();
    }
}
