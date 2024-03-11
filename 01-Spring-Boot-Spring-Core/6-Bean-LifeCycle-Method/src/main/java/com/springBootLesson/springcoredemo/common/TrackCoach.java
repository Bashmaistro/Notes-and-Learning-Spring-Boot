package com.springBootLesson.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    //init method
    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println("Doing startup stuff");
    }
    //destroy method
    @PreDestroy
    public void doMyCleanupStuff(){
        System.out.println("Doing Cleanup stuff");
    }

    public String gelDailyWorkout() {
        return "Just run bro" ;
    }
}