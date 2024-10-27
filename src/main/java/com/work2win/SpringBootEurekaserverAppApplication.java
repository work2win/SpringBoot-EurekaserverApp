package com.work2win;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaserverAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaserverAppApplication.class, args);
	}

}
