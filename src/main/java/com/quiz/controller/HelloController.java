package com.quiz.controller;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<?> sayHello() {
        return new ResponseEntity<>("Hello World !!", HttpStatusCode.valueOf(200));
    }
}
