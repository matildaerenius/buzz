package com.matildaerenius.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping
    public String homeControllerHandler() {
        return "Hello World";
    }
    @GetMapping("/home")
    public String homeControllerHandler2() {
        return "Hello World 2";
    }
    @GetMapping("/matilda")
    public String homeControllerHandler3() {
        return "Hello World 3";
    }
//    @PutMapping
//    @PostMapping
//    @DeleteMapping


}
