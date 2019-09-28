package com.hcc.mnthStatService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MonthlyStatusServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonthlyStatusServiceApplication.class, args);
	}

}
