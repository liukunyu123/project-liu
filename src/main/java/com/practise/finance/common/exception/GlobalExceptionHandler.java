package com.practise.finance.common.exception;



import com.practise.finance.common.result.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {
    //定义自定义异常，当有异常都会走这个方法，并返回要加ResponseBody
    @ExceptionHandler(ResException.class)
    @ResponseBody
    public Result error(ResException e){
        return Result.fail(e.getCode(),e.getMessage());
    }
    //定义全局异常，当有异常都会走这个方法，并返回要加ResponseBody
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result error(Exception e){
        e.printStackTrace();
        return Result.fail();
    }




}
