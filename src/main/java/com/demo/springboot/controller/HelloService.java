package com.demo.springboot.controller;

import com.demo.springboot.exception.UserNotExistException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xianlehuang
 * @Description:
 * @date: ${date} ${time}
 */

@RestController
public class HelloService {

    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "hello ";
    }
}
