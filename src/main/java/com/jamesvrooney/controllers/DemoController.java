package com.jamesvrooney.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class DemoController {

    @GetMapping("demo")
    public String demo() {

        final var greeting = "TEST: Hello Lesson 05!";

        return greeting;
    }
}
