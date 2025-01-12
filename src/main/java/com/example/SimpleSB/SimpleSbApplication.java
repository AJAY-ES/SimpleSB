package com.example.SimpleSB;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SimpleSbApplication.class, args);
	}
@GetMapping
	public String getMessage(){
		return "Simple Spring boot project working!!!!!!!";
}
}
