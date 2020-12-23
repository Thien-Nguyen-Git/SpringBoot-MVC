package com.cognixia.thien.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cognixia.thien.model.Countries;

@Service
public class CountriesService {

	private static List<Countries> countriesDatabase = new ArrayList<>();
	private static int idCounter = 1;
	
	static {
		
		countriesDatabase.add(new Countries(idCounter++, "Canada", "Ottawa", 37000000));
		countriesDatabase.add(new Countries(idCounter++, "Denmark", "Copenhagen", 5000000));
		countriesDatabase.add(new Countries(idCounter++, "France", "Paris", 67000000));
		countriesDatabase.add(new Countries(idCounter++, "Germany", "Berlin", 83000000));
		countriesDatabase.add(new Countries(idCounter++, "Japan", "Tokyo", 126000000));
		
	}
	
	public List<Countries> getAllCountries() {
		return countriesDatabase;
	}
	
	public Countries getCountryById(int id) {
		for (int i = 0; i < countriesDatabase.size(); i++) {
			if (countriesDatabase.get(i).getId() == id) {
				return countriesDatabase.get(i);
			}
		}
		return new Countries();
	}
	
	public List<Countries> getCountriesByName(String name) {
		List<Countries> countriesInName = new ArrayList<>();
		
		for (int i = 0; i < countriesDatabase.size(); i++) {
			if (countriesDatabase.get(i).getName().equalsIgnoreCase( name.trim() ) ) {
				countriesInName.add(countriesDatabase.get(i));
			}
		}
		
		return countriesInName;
	}
	
	public List<Countries> getCountriesByCapital(String capital) {
		List<Countries> countriesInCapital = new ArrayList<>();
		
		for (int i = 0; i < countriesDatabase.size(); i++) {
			if (countriesDatabase.get(i).getCapital().equalsIgnoreCase( capital.trim() ) ) {
				countriesInCapital.add(countriesDatabase.get(i));
			}
		}
		
		return countriesInCapital;
	}
	
	public List<Countries> getCountriesByPopulation(int population) {
		List<Countries> countriesWithPopulation = new ArrayList<>();
		
		for (int i = 0; i < countriesDatabase.size(); i++) {
			if (countriesDatabase.get(i).getPopulation() == population) {
				countriesWithPopulation.add(countriesDatabase.get(i));
			}
		}
		
		return countriesWithPopulation;
	}
	
	public List<Countries> getAllLessPopulation(int population) {
		List<Countries> countriesLessPopulation = new ArrayList<>();
		
		for (int i = 0; i < countriesDatabase.size(); i++) {
			if (countriesDatabase.get(i).getPopulation() <= population) {
				countriesLessPopulation.add(countriesDatabase.get(i));
			}
		}
		
		return countriesLessPopulation;
	}
	
	public Countries addCountry(String countryName, String capital, int population) {
		
		Countries newCountry = new Countries(idCounter++, countryName, capital, population);
		
		countriesDatabase.add(newCountry);
		
		return newCountry;
	}
}













