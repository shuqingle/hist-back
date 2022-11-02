package com.sugo.resident.commonapi.exception;

import com.sugo.resident.commonapi.model.response.BaseResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public BaseResponse bizExceptionHandler(HttpServletRequest req, BusinessException e){
        logger.error("发生业务异常！原因是：{}",e.getMessage());
        return new BaseResponse(e.getCode(),e.getMessage());
    }

    /**
     * 处理其他异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value =Exception.class)
    @ResponseBody
    public BaseResponse exceptionHandler(HttpServletRequest req, Exception e){
        logger.error("未知异常！原因是:",e);
        return new BaseResponse("999999","系统异常，请联系系统管理员");
    }
}
