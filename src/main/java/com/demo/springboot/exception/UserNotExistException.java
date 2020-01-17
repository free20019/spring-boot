package com.demo.springboot.exception;

/**
 * @author: xianlehuang
 * @Description:
 * @date: ${date} ${time}
 */
public class UserNotExistException extends RuntimeException{
    public UserNotExistException() {
        super("用户不存在");
    }
}
