package ru.pr.lab00.myapp;

import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;

public class CountriesHandler {
	private static final String BUNDLE_BASE_NAME = "capitals";
	private String language = "en";

	public void setLanguage(String language) { this.language = language; }

	public Country getCountry(String countryName) {
		ResourceBundle capitals = getCapitals(this.language);

	    String capital = capitals.getString(countryName);
        
        return new Country(countryName, capital);
	}

    private ResourceBundle getCapitals(String language) {
        return PropertyResourceBundle.getBundle(BUNDLE_BASE_NAME, new Locale(language));
    }
}