package com.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class LoginapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginapiApplication.class, args);
		
		System.out.println("WELCOME TO LOGIN");
	}

}