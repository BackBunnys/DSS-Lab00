package ru.pr.lab00.myapp;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.Scanner;

public class Application {
	private static final CountriesHandler cb = new CountriesHandler();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(cb.getCountry(sc.nextLine()));
	}
}