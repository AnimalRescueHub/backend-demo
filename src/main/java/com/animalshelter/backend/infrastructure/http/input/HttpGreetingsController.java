package com.animalshelter.backend.infrastructure.http.input;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpGreetingsController {

    @GetMapping("/hello")
    public String greetings() {
        return "hello";
    }
}
