package com.springBootLesson.springcoredemo.config;

import com.springBootLesson.springcoredemo.common.Coach;
import com.springBootLesson.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
