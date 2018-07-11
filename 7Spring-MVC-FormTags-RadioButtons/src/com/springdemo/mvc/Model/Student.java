package com.springdemo.mvc.Model;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	private String favoriteLanguage;
	
	private String favoriteWebsite;
	private LinkedHashMap<String, String>favoriteWebsiteOptions;
	
	public Student() {
		//Populate country options: used ISO country code
		
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "France");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IND", "India");
		
		favoriteWebsiteOptions = new LinkedHashMap<>();
		favoriteWebsiteOptions.put("Udacity", "Udacity");
		favoriteWebsiteOptions.put("Udemy", "Udemy");
		favoriteWebsiteOptions.put("Coursera", "Coursera");
		favoriteWebsiteOptions.put("Lynda", "Lynda");
	}
	
	public String getFavoriteWebsite() {
		return favoriteWebsite;
	}

	public void setFavoriteWebsite(String favoriteWebsite) {
		this.favoriteWebsite = favoriteWebsite;
	}

	public LinkedHashMap<String, String> getFavoriteWebsiteOptions() {
		return favoriteWebsiteOptions;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
