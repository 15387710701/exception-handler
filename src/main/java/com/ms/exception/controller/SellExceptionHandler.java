package com.ms.exception.controller;

import com.ms.exception.controller.ResultVO;
import com.ms.exception.controller.ResultVOUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class SellExceptionHandler {

    @ExceptionHandler(value = SellException.class)
    @ResponseBody
    public ResultVO handlerSellerException(SellException e){
        System.out.println("错误信息是:"+e.getMessage());
        return ResultVOUtil.error(e.getCode(),e.getMessage());
    }

}