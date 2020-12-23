package com.cognixia.thien.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognixia.thien.model.Countries;
import com.cognixia.thien.service.CountriesService;

@RequestMapping("/api")
@RestController
public class CountriesController {

	// autowired --> take care to create instance of class for our service
	@Autowired
	CountriesService service;
	
	// get request to get all the Characters in our "database"
	// endpoint: localhost:8080/api/countries
	@GetMapping("/countries")
	public List<Countries> getAllCountries() {
		return service.getAllCountries();
	}
	
	@GetMapping("/countries/{id}")
	public Countries getCountryById(@PathVariable String id) {
		int countryId = Integer.parseInt(id);
		return service.getCountryById(countryId);
	}
	
	@GetMapping("/countries/name/{name}")
	public List<Countries> getCountriesByName(@PathVariable String name) {
		return service.getCountriesByName(name);
	}

	@GetMapping("/countries/capital/{capital}")
	public List<Countries> getCountriesByCapital(@PathVariable String capital) {
		return service.getCountriesByCapital(capital);
	}
	
	@GetMapping("/countries/population/{population}")
	public List<Countries> getCountriesByPopulation(@PathVariable String population) {
		int countryPopulation = Integer.parseInt(population);
		return service.getCountriesByPopulation(countryPopulation);
	}
	
	@GetMapping("/countries/lesspopulation/{population}")
	public List<Countries> getAllLessPopulation(@PathVariable String population) {
		int countryLessPopulation = Integer.parseInt(population);
		return service.getAllLessPopulation(countryLessPopulation);
	}
	
	@PostMapping("/addcountry")
	public void addCountry(@RequestBody Countries singleCountry) {
		Countries newCountry = service.addCountry(
				singleCountry.getName(),
				singleCountry.getCapital(), 
				singleCountry.getPopulation()
				);
		System.out.println("New Country: " + newCountry);
	}
}
