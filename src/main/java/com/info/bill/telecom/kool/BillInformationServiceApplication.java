package com.info.bill.telecom.kool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class BillInformationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BillInformationServiceApplication.class, args);
	}

}
