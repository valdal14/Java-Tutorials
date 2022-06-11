package com.valdal14.Internationalization.Locale;

import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {

        // Get the Default Locale
        Locale l = Locale.getDefault();
        System.out.println(l.getCountry());
        System.out.println(l.getLanguage());
        System.out.println(l.getDisplayCountry());
        System.out.println(l.getDisplayLanguage());
        System.out.println(l.getDisplayName());

        System.out.println("--- ITALY ---");
        // Switch to a new Locale Italy
        Locale.setDefault(Locale.ITALY);
        Locale italy = Locale.getDefault();
        System.out.println(italy.getCountry());
        System.out.println(italy.getLanguage());
        System.out.println(italy.getDisplayCountry());
        System.out.println(italy.getDisplayLanguage());
        System.out.println(italy.getDisplayName());

        // Get the Country ISO code
        System.out.println("--- ISO CODES ---");
        String[] isoCodes = Locale.getISOCountries();

        for (String code: isoCodes) {
            System.out.println(code);
        }

        // Get supported languages
        System.out.println("--- SUPPORTED LANGUAGES ---");
        String[] languages = Locale.getISOLanguages();

        for (String lang: languages) {
            System.out.println(lang);
        }
    }
}
