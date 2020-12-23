package com.cognixia.thien.model;

public class Countries {

	private int id;
	private String name;
	private String capital;
	private int population;
	
	public Countries() {
		this(-1, "N/A", "N/A", -1);
	}
	
	public Countries(int id, String name, String capital, int population) {
		super();
		this.id = id;
		this.name = name;
		this.capital = capital;
		this.population = population;
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCapital() {
		return capital;
	}


	public void setCapital(String capital) {
		this.capital = capital;
	}


	public int getPopulation() {
		return population;
	}


	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Countries [id=" + id + ", name=" + name + ", capital=" + capital + ", population="
				+ population + "]";
	}
	
}
