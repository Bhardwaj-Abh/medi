package com.medicare.setting;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.medicare.common.entity.Country;
import com.medicare.common.entity.State;

public interface StateRepository extends CrudRepository<State, Integer> {
	
	public List<State> findByCountryOrderByNameAsc(Country country);
}
