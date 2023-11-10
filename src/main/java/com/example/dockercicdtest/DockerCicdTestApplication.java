package com.example.dockercicdtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerCicdTestApplication {

    @GetMapping("/")
    public String hello() {
        return "HELLO";
    }
    public static void main(String[] args) {
        SpringApplication.run(DockerCicdTestApplication.class, args);
    }

}
