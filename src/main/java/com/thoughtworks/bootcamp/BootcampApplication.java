package com.thoughtworks.bootcamp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootcampApplication {

	public static void main(String[] args) {


	}
	public static int findAreaOfRectangle(Integer length, Integer breath){
		if(length==null || breath == null || length < 0 || breath < 0){
			throw new RuntimeException("Invalid Input");
		}
		return length*breath;
	}

}
