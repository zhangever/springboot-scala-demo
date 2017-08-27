package com.github.ever.handler;

import com.github.ever.pojo.ResponseData;
import com.github.ever.enums.ResponseStatus;
import com.github.ever.pojo.MyException;
import com.github.ever.pojo.ResponseData;
import com.github.ever.enums.ResponseStatus;
import com.github.ever.pojo.ResponseData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    @ExceptionHandler(value = MyException.class)
    @ResponseBody
    public ResponseData jsonErrorHandler(HttpServletRequest req, MyException e) throws Exception {
        logger.error(e.getMessage(),e);
        return new ResponseData(ResponseStatus.FAILURE, req.getRequestURL().toString(), e.getMessage());
    }

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData jsonErrorHandler2(HttpServletRequest req, Exception e) throws Exception {
        logger.error(e.getMessage(),e);
        return new ResponseData(ResponseStatus.FAILURE, req.getRequestURL().toString(), e.getMessage());
    }
}