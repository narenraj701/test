package com.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsMain {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationcontext.xml");
        Coach coach=context.getBean("gymCoach",Coach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortune());
        coach=context.getBean("cricketCoach",Coach.class);
        System.out.println(coach.getWorkout());
        System.out.println(coach.getFortune());
    }
}
