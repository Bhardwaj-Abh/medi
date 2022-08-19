package com.medicare.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.medicare.common.entity","com.medicare.admin.user"})
public class MediCareBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(MediCareBackEndApplication.class, args);
	}

}
