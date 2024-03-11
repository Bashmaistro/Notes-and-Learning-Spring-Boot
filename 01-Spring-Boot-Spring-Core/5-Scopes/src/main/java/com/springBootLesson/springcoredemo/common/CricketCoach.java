package com.springBootLesson.springcoredemo.common;

import org.springframework.stereotype.Component;
@Component
public class CricketCoach implements Coach {

    public String gelDailyWorkout() {
        return "Practice fast bowling 15 minutes!!!" ;
    }
}
