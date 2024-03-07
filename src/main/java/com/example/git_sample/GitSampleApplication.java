package com.example.git_sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitSampleApplication {

	public static void main(String[] args) {
		System.out.println("Hello git!");
		SpringApplication.run(GitSampleApplication.class, args);
	}

}