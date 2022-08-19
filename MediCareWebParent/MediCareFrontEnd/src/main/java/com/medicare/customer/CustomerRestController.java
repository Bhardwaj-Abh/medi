package com.medicare.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {

	@Autowired @Lazy private CustomerService service;
	
	@PostMapping("/customers/check_unique_email")
	public String checkDuplicateEmail(@Param("email") String email) {
		return service.isEmailUnique(email) ? "OK" : "Duplicated";
	}
}
