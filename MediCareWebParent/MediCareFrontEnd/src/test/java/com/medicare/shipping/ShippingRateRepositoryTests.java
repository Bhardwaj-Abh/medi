package com.medicare.shipping;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.medicare.common.entity.Country;
import com.medicare.common.entity.ShippingRate;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ShippingRateRepositoryTests {
	
	@Autowired private ShippingRateRepository repo;
	
	@Test
	public void testFindByCountryAndState() {
		Country India = new Country(106);
		String state = "Delhi";
		ShippingRate shippingRate = repo.findByCountryAndState(India, state);
		
		assertThat(shippingRate).isNotNull();
		System.out.println(shippingRate);
	}
}
