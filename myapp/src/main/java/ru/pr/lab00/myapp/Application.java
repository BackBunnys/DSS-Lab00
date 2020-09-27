package ru.pr.lab00.myapp;

import java.io.IOException;
import java.util.MissingResourceException;
import java.util.Scanner;
import ru.pr.lab00.mylib.*;

public class Application {
	private final MessagesHandler messages = new MessagesHandler();
	private final CountriesHandler cb = new CountriesHandler();
	private Contacts contacts;

	public static void main(String[] args) {
		Application app = new Application();

		try {
			app.setUp();
			app.run();
		} catch (IOException ioe) {
			System.out.println("Some files were not found :(");
		}
	}

	private void run() {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print(messages.getMessage("countrySelection") + ": ");
			System.out.println(cb.getCountry(sc.nextLine()));
		} catch (MissingResourceException mre) {
			System.out.println(messages.getMessage("error.capitalNotFound") + "! " +
					messages.getMessage("email") + " " + contacts.getEmail());
		}
	}

	private void setUp() throws IOException {
		contacts = new Contacts();
		contacts.setUp();

		setUpLanguage();
	}

	private void setUpLanguage()
	{
		Scanner sc = new Scanner(System.in);

		System.out.print(messages.getMessage("languageSelection") + " (ru/en): ");
		String locale = sc.nextLine();
		setLanguage(locale);
	}

	private void setLanguage(String language) {
		messages.setLanguage(language);
		cb.setLanguage(language);
	}
}