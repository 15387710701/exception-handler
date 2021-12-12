package com.ms.exception.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
@GetMapping("abc")
    public ResultVO resultVO(String msg) {
        if (msg.equals("111")){
            throw new SellException(3000,"密码太简单");
        }
        return ResultVOUtil.success();
    }

}
