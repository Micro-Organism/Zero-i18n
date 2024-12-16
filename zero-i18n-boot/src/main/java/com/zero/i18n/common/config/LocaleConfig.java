package com.zero.i18n.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.CookieLocaleResolver;

import java.util.Locale;

@Configuration
public class LocaleConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver() {
        // Create a CookieLocaleResolver to manage locale settings using cookies
        CookieLocaleResolver resolver = new CookieLocaleResolver();
        // Set the default locale to English
        resolver.setDefaultLocale(Locale.ENGLISH);
        // Set the name of the cookie that will store the locale
        resolver.setCookieName("localeCookie");
        // Set the path for the cookie to be accessible
        resolver.setCookiePath("/");
        // Return the configured LocaleResolver
        return resolver;
    }

    // You can add more beans or configurations here if needed
}