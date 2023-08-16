package com.example.projectcake;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class ProjectCakeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectCakeApplication.class, args);
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }
}
