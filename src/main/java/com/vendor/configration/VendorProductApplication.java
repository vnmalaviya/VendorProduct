package com.vendor.configration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
@ComponentScan("com.vendor")
public class VendorProductApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(VendorProductApplication.class, args);
	}
}
