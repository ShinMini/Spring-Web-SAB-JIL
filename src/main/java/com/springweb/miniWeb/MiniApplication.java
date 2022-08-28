package com.springweb.miniWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MiniApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiniApplication.class, args);
	}
}

/* @EnableScheduling annotation ensures that 
a background task excutor is created. 
Without it, nothing gets scheduled.
*/
