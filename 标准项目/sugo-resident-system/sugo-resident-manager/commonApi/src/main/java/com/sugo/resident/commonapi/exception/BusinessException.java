package com.sugo.resident.commonapi.exception;


import com.sugo.resident.commonapi.enumInfo.ResultCodeInterface;

public class BusinessException extends RuntimeException{
    protected String code;
    protected String message;

    public BusinessException() {
        super();
    }
    public BusinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public BusinessException(ResultCodeInterface errorCodes) {
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
