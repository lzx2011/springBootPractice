package com.lzhenxing.myproject.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: Example <br/>
 * Function: <br/>
 *
 * @author gary.liu
 * @date 2017/5/30
 */
@RestController
@EnableAutoConfiguration
public class ExampleController {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ExampleController.class, args);
    }

}