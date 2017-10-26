package com.ai.cloud.configserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableConfigServer
@RestController
@EnableEurekaClient
public class App {
	@Value("${spring.application.name}")
	String applicationName="Config Server";
	
	@RequestMapping("/")
	String home(){
		return "Welcome to "+applicationName;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
