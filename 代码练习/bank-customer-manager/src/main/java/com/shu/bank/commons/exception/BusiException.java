package com.shu.bank.commons.exception;



public class BusiException extends RuntimeException{
    protected String code;
    protected String message;

    public BusiException() {
        super();
    }
    public BusiException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusiException(ResultCodes errorCodes) {
        this.code = errorCodes.code();
        this.message = errorCodes.message();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
