package com.chase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloStudentApplication.class, args);
    }

    @GetMapping("/")
    public String index(){
        return "Hello Student!";
    }

}
