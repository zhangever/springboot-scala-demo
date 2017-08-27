package com.github.ever.controller;

import com.github.ever.pojo.MyException;
import com.github.ever.pojo.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ever on 2017/8/16.
 */
@Controller
public class DemoController {
    @RequestMapping(value = "/login")
    public String login() {
        return "login";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/exception", method = RequestMethod.GET)
    public String exception() throws MyException {
        throw new MyException("异常范例");
    }
}

