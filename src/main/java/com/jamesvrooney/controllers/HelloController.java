package com.jamesvrooney.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("hello")
    public String hello(Authentication authentication) {

        log.info("Authentication: " + authentication.getName());

        final var greeting = "Hello Lesson 03!";

        return greeting;
    }
}
