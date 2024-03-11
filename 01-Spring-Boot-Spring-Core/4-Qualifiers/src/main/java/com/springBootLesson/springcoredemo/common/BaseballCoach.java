package com.springBootLesson.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BaseballCoach implements Coach {

    public String gelDailyWorkout() {
        return "Hit the target" +
                "fast" ;
    }
}