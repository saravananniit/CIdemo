package com.itc.HelloWorldAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("api/v1")
public class HelloWorldApiApplication {

	@GetMapping("getData")
	public String getHello(){
		return "welcome to itc ltd";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApiApplication.class, args);
	}

}
