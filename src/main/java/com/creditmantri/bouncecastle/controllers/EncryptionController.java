package com.creditmantri.bouncecastle.controllers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    private static final String  = "Greetings, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public EncryptAlgorithm encrpty(@RequestParam(value = "code", defaultValue = "Hello World") String name)
    {
        return new Greeting(counter.incrementAndGet(), String.format(template, code));
    }
}
