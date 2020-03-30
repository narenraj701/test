package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.awt.*;

@Component
public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    @Override
    public String getWorkout() {
        return "Do bowling practice";
    }
    @Autowired
    public CricketCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getFortune() {
        return fortuneService.getFortune();
    }
}
