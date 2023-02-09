package com.arcurus.ecommerce.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    private  static  final String GET ="GET";
    private  static  final String POST ="POST";
    private  static  final String DELETE ="DELETE";
    private  static  final String PUT ="PUT";
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods(PUT,DELETE,GET,POST)
                .allowedHeaders("*")
                .allowedOriginPatterns("*")
                .allowCredentials(true);
    }
}
