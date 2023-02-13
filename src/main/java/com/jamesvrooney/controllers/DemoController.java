package com.jamesvrooney.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DemoController {

    @GetMapping("demo")
    public String demo() {
        log.info("JAMES: This is a demo.");

        return "This is a demo";
    }
}
