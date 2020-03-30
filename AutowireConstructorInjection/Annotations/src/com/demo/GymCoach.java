package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GymCoach implements Coach{
    private FortuneService fortuneService;
    public String getWorkout() {
        return "Do 20 PushUps";
    }
    @Autowired
    public GymCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    public String getFortune(){
        return fortuneService.getFortune();
    }
}
