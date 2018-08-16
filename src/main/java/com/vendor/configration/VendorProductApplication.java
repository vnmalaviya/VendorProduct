package com.vendor.configration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class VendorProductApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(VendorProductApplication.class, args);
	}
}
