package com.example.springboottotoisegit.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.Random;

@RestController
@RequestMapping("/api")
public class GitController {

    @GetMapping("/now")
    public String getDateAndTime(){
        return ""+new Date();
    }

    @GetMapping("/rain-today")
    public String rainPossibility(){
        return "Today Rain Probability is "+new Random().nextDouble()*100+"%";
    }
}
