package ru.pr.lab00.myapp;

import java.util.*;

public class MessagesHandler {
    private static final String BUNDLE_BASE_NAME = "messages";
    private String locale = "ru";

    public void setLocale(String locale) { this.locale = locale; }

    public String getMessage(String key) {
        ResourceBundle messages = getMessages(locale);

        return messages.getString(key);
    }

    private ResourceBundle getMessages(String language) {
        return PropertyResourceBundle.getBundle(BUNDLE_BASE_NAME, new Locale(language));
    }
}
