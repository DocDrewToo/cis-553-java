package com.cis553.project.greeting;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingAPI {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greetingGet(@RequestParam(
                              value = "name",
                              defaultValue = "World")
                             String name) {
        long uniqueGreetingId = counter.incrementAndGet();
        String greetingMessage = String.format(template, name);
        return new Greeting(uniqueGreetingId, greetingMessage);
    }
}
