package com.example.sample_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
		//New code
		System.out.println("New Feature Added");
		//Code changes for Branch 1 
		System.out.println("Branch 1 changes");
		//Code changes for branch 2
		System.out.println("Branch 2 changes");
	}

}
