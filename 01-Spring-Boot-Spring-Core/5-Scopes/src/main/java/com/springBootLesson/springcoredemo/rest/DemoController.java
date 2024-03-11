package com.springBootLesson.springcoredemo.rest;

import com.springBootLesson.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach anotherCoach;

    //@Autowired
    /*public DemoController( Coach theCoach) {
        myCoach = theCoach;
    }*/

    @Autowired
    public DemoController(
            @Qualifier("trackCoach") Coach theCoach,
            @Qualifier("trackCoach") Coach theAnotherCoach) {
        myCoach = theCoach;
        anotherCoach = theAnotherCoach;

    }

   /* @Autowired
    public void setMyCoach(Coach thecoach){
        myCoach = thecoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {

        return myCoach.gelDailyWorkout();
    }

    @GetMapping("/check")
    public String getCheck() {
        return "Comparing beans: myCoach == anotherCoach => "
                + (myCoach == anotherCoach);
    }
}
