package com.ai.cloud.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class PageMapper {
	@Value("${spring.application.name}")
	String applicationName;
	
	@Value("${application.version}")
	String applicationVersion;
	
	@Value("${profile}")
	String profile;
	@RequestMapping("/")
	String home(){
		return "Application Name:"+applicationName
				+System.lineSeparator()
				+"Application Version:"+applicationVersion
				+System.lineSeparator()
				+"Profile:"+profile;
	}
}
