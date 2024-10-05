package com.department.department_s1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmentS1Application {

	public DepartmentS1Application() {
		super();
		//TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		SpringApplication.run(DepartmentS1Application.class, args);
	}
}
