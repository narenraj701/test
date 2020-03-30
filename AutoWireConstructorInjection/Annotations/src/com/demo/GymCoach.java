package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class GymCoach implements Coach{
    @Autowired
    private FortuneService fortuneService;
    public String getWorkout() {
        return "Do 20 PushUps";
    }
    @PostConstruct
    public void startup(){
        System.out.println("Startup method called");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Destroy method called");
    }
    /*@Autowired
    public void GymCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }*/
    /*@Autowired
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }*/
    public String getFortune(){
        return fortuneService.getFortune();
    }
}
