package ru.pr.lab00.myapp;

import java.util.*;

public class MessagesHandler {
    private static final String BUNDLE_BASE_NAME = "messages";
    private String language = "ru";

    public void setLanguage(String language) { this.language = language; }

    public String getMessage(String key) {
        ResourceBundle messages = getMessages(language);

        return messages.getString(key);
    }

    private ResourceBundle getMessages(String language) {
        return PropertyResourceBundle.getBundle(BUNDLE_BASE_NAME, new Locale(language));
    }
}
