package com.example;

/**
 * Created by MTC on 1/25/2017.
 */
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        return "Greetings from the Spring Boot Starter App!";
    }
}
