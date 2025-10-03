package com.mycode.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    //expose a new endpoint that returns "Hello, World!"

    @GetMapping("/")
    public String sayHello(){
        return "Hello, World!";
    }

    // Expose new endpoint for "workout"

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5K!";
    }

    // Expose new endpoint for "fortune"
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "The harder you work, the 'luckier' you get.";
    }

}
