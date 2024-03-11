package com.springBootLesson.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//The reason we use this is that when spring boot scans,
// it only scans the contents of our main class
//, but in this way, we tell spring boot what to scan.
@SpringBootApplication(
		scanBasePackages = {"com.springBootLesson.springcoredemo",
							"com.springBootLesson.util"})
public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
