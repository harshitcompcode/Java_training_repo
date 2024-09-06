package com.graymatter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DepartmentService32Application {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentService32Application.class, args);
	}

}
