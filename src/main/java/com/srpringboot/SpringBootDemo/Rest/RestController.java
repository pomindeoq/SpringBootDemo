package com.srpringboot.SpringBootDemo.Rest;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {
    @GetMapping("/")
    public String Hello() {
        return "Hello World!";
    }

}
