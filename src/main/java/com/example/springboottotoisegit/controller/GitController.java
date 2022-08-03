package com.example.springboottotoisegit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class GitController {

    @GetMapping("/now")
    public String getDateAndTime(){
        return ""+new Date();
    }
}
