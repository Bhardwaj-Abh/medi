package com.medicare.admin.brand;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.medicare.common.entity.Brand;
import com.medicare.common.entity.Category;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class BrandRepositoryTests {
	
	@Autowired
	private BrandRepository repo;
	
	@Test
	public void testCreateBrand1() {
		Category SkinCare = new Category(4);
		Brand Nivea = new Brand("Nivea");
		Nivea.getCategories().add(SkinCare);
		
		Brand savedBrand = repo.save(Nivea);
		
		assertThat(savedBrand).isNotNull();
		assertThat(savedBrand.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testCreateBrand2() {
		Category ProtienSupplements = new Category(5);
		Category VitaminsSupplements = new Category(3);
		
		Brand Whey = new Brand("Whey");
		Whey.getCategories().add(ProtienSupplements);
		Whey.getCategories().add(VitaminsSupplements);
		
		Brand savedBrand = repo.save(Whey);
		
		assertThat(savedBrand).isNotNull();
		assertThat(savedBrand.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testCreateBrand3() {
		Brand ustraa = new Brand("Ustraa");
		
		ustraa.getCategories().add(new Category(8));	
			
		
		Brand savedBrand = repo.save(ustraa);
		
		assertThat(savedBrand).isNotNull();
		assertThat(savedBrand.getId()).isGreaterThan(0);
	}
	
	@Test
	public void testFindAll() {
		Iterable<Brand> brands = repo.findAll();
		brands.forEach(System.out::println);
		
		assertThat(brands).isNotEmpty();
	}
	
	@Test
	public void testGetById() {
		Brand brand = repo.findById(1).get();
		
		assertThat(brand.getName()).isEqualTo("Nivea");
	}
	
	
}
