package com.weather.weatherforecasapi.config;

import com.weather.weatherforecasapi.client.WeatherWebClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @Bean
    public WebClient proOpenWeatherMap(){
        return WebClient.builder()
                .baseUrl("https://pro.openweathermap.org/data/2.5")

                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    @Bean
    public WebClient apiOpenWeatherMap() {
        return WebClient.builder()
                .baseUrl("https://api.openweathermap.org")
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }
}
