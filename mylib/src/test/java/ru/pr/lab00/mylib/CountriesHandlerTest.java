package ru.pr.lab00.mylib;

import org.junit.*;
import java.io.IOException;
import java.util.MissingResourceException;

public class CountriesHandlerTest
{
    @Test
    public void testEnglish() throws IOException {
        String expectedValue = "Paris";

        CountriesHandler cb = new CountriesHandler();
        cb.setLanguage("en");

        String value = cb.getCountry("France").getCapital();

        Assert.assertEquals("English check", expectedValue, value);
    }

    @Test
    public void testRussia() throws IOException  {
        String expectedValue = "Париж";

        CountriesHandler cb = new CountriesHandler();
        cb.setLanguage("ru");

        String value = cb.getCountry("Франция").getCapital();

        Assert.assertEquals("Russian check", expectedValue, value);
    }

    @Test(expected = MissingResourceException.class)
    public void notFoundCountry() throws IOException {
        CountriesHandler cb = new CountriesHandler();

        String value = cb.getCountry("").getCapital();
    }
}
