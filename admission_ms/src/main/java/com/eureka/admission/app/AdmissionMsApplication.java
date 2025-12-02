package com.eureka.admission.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AdmissionMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionMsApplication.class, args);
	}

}
