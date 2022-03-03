package com.miracle.demo.communicationmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.miracle.**")
public class CommunicationmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommunicationmicroserviceApplication.class, args);
	}

}
