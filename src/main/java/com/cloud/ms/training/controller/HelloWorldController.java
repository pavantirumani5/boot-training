package com.cloud.ms.training.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;
@SpringBootApplication
@RestController
public class HelloWorldController {
    @GetMapping("/hello-world")
    public String getHelloWorld() {

        return "HelloWorld 1";
    }

    @PostMapping("/hello-world ")
    public String insertHelloWorld() {
        return "HelloWorld 1";
    }

    @PutMapping("/hello-world ")
    public String updateHelloWorld() {
        return "HelloWorld 1";
    }

    @DeleteMapping("/hello-world ")
    public String deleteHelloWorld() {
        return "HelloWorld 1";
    }

    @PatchMapping("/hello-world")
    public String partialUpdateHelloWorld() {
        return "HelloWorld 1";
    }
}
