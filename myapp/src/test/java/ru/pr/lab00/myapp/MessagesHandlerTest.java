package ru.pr.lab00.myapp;

import org.junit.*;
import java.io.IOException;
import java.util.MissingResourceException;

public class MessagesHandlerTest
{
    @Test
    public void testEnglish() throws IOException {
        String expectedValue = "Select a language";

        MessagesHandler messages = new MessagesHandler();
        messages.setLanguage("en");

        String value = messages.getMessage("languageSelection");

        Assert.assertEquals("English check", expectedValue, value);
    }

    @Test
    public void testRussia() throws IOException  {
        String expectedValue = "Выберите язык";

        MessagesHandler messages = new MessagesHandler();
        messages.setLanguage("ru");

        String value = messages.getMessage("languageSelection");

        Assert.assertEquals("Russian check", expectedValue, value);
    }

    @Test(expected = MissingResourceException.class)
    public void notFoundCountry() throws IOException {
        MessagesHandler messages = new MessagesHandler();

        String value = messages.getMessage("");
    }
}
