package zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
@RestController
public class ZuulApp {
	
	@RequestMapping("/")
	String zuulHome(){
		return "Welcome to Zuul."; 
	}

	public static void main(String[] args) {
		SpringApplication.run(ZuulApp.class, args);
	}

}
