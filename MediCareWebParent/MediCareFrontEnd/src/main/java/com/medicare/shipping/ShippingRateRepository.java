package com.medicare.shipping;

import org.springframework.data.repository.CrudRepository;

import com.medicare.common.entity.Country;
import com.medicare.common.entity.ShippingRate;

public interface ShippingRateRepository extends CrudRepository<ShippingRate, Integer> {
	
	public ShippingRate findByCountryAndState(Country country, String state);
}
