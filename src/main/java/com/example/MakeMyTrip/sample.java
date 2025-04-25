package com.example.MakeMyTrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class sample {
    public sample() {
    }

    @GetMapping({"/sample"})
    public String getData() {
        return "samplepage";
    }
}