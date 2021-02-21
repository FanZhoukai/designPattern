package com.designpattern.dp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class CommonController {

    @RequestMapping("hello")
    public String hello() {
        return "hello world!";
    }
}
