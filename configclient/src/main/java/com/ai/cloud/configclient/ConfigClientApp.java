package com.ai.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@SpringBootApplication
@RestController
public class ConfigClientApp {
	
	@Value("${spring.application.name}")
	String applicationName;
	
	@Value("${application.version}")
	String applicationVersion;
	
	@Value("${spring.profiles}")
	String profile;
	
	@RequestMapping("/")
	String home(){
		return "Application Name:"+applicationName
				+System.lineSeparator()
				+"Application Version:"+applicationVersion
				+System.lineSeparator()
				+"Profile:"+profile;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApp.class, args);
	}

}
