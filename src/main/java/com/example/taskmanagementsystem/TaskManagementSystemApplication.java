package com.example.taskmanagementsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.taskmanagementsystem.API.Model")
public class TaskManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementSystemApplication.class, args);
	}

}
