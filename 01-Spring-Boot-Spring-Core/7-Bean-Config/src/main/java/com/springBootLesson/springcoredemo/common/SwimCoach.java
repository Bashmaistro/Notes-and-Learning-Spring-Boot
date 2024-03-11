package com.springBootLesson.springcoredemo.common;

public class SwimCoach implements Coach{
    @Override
    public String gelDailyWorkout() {
        return "Swim 100 meters fow warmup";
    }

    public SwimCoach() {
        System.out.println("In constructor:" + getClass().getSimpleName());
    }
}
