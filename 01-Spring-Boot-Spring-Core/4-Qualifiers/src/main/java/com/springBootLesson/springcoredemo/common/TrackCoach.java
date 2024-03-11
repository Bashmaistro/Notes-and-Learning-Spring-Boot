package com.springBootLesson.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public String gelDailyWorkout() {
        return "Just run bro" ;
    }
}