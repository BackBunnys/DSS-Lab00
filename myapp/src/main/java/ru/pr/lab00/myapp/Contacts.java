package ru.pr.lab00.myapp;

import java.io.IOException;
import java.util.Properties;

public class Contacts {
    private String email;

    public void setUp() throws IOException {
        Properties contacts = new Properties();

        contacts.load(getClass().getClassLoader().getResourceAsStream("contacts.properties"));

        email = contacts.getProperty("email");
    }
    public String getEmail() {
        return email;
    }
}
