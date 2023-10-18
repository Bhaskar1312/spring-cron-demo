package com.example.springcrondemo;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {
    Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @GetMapping
    public String hello() {
        logger.info(">>>> hello ", LocalDateTime.now());
        return "hello!";
    }
}
