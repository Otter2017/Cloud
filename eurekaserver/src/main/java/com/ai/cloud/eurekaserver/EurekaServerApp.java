package com.ai.cloud.eurekaserver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaServer
@RestController
public class EurekaServerApp {
    private static Logger logger = LoggerFactory.getLogger(EurekaServerApp.class);

    @GetMapping("/ping/{message}")
    public String ping(@PathVariable(name="message") String message){
        logger.debug("ping begin");
        logger.info("ping message >"+message);
        logger.debug("ping end");
        return "pong "+message;
    }

    @GetMapping("/update")
    public String update(@RequestParam(name="tableName") String tableName){
        return "UPDATE TABLE:"+tableName;
    }
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApp.class, args);
    }

}
