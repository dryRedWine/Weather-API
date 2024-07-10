package com.weather.weatherforecasapi.client;

import com.weather.weatherforecasapi.dto.GeoResponseDto;
import com.weather.weatherforecasapi.models.forecast.Forecast;
import com.weather.weatherforecasapi.models.forecast.SixteenDaysForecast;
import com.weather.weatherforecasapi.models.forecast.ThreeDaysForecast;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class WeatherWebClient {

    private final WebClient proOpenWeatherMap;

    private final WebClient apiOpenWeatherMap;

    public List<GeoResponseDto> getGeo(String cityName, String apiKey) {
        log.info("Find out geo for {}.", cityName);
        Mono<List<GeoResponseDto>> response = apiOpenWeatherMap.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/geo/1.0/direct")
                        .queryParam("q", cityName)
                        .queryParam("limit", 1)
                        .queryParam("appid", apiKey)
                        .build())
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("API not found")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        error -> Mono.error(new RuntimeException("Server is not responding")))
                .bodyToMono(new ParameterizedTypeReference<List<GeoResponseDto>>() {
                });
        return response.block();
    }

    public Forecast getCurrentWeather(GeoResponseDto geo, String apiKey) {
        log.info("Find out current weather forecast.");
        return apiOpenWeatherMap.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/data/2.5/weather")
                        .queryParam("lat", geo.lat())
                        .queryParam("lon", geo.lon())
                        .queryParam("appid", apiKey)
                        .build())
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("API not found")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        error -> Mono.error(new RuntimeException("Server is not responding")))
                .bodyToMono(Forecast.class)
                .block();
    }

    public SixteenDaysForecast getDailyForecast(GeoResponseDto geo, String apiKey, Integer cnt) {
        log.info("Get daily forecast for 16 days.");
        return apiOpenWeatherMap.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/data/2.5/forecast/daily")
                        .queryParam("lat", geo.lat())
                        .queryParam("lon", geo.lon())
                        .queryParam("appid", apiKey)
                        .queryParam("cnt", cnt)
                        .queryParam("units", "metric")
                        .queryParam("lang", "en")
                        .build())
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("API not found")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        error -> Mono.error(new RuntimeException("Server is not responding")))
                .bodyToMono(SixteenDaysForecast.class)
                .block();
    }

    public ThreeDaysForecast getThreeDaysForecast(GeoResponseDto geo, String apiKey, Integer cnt) {
        log.info("Get daily forecast for 16 days.");
        return apiOpenWeatherMap.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/data/2.5/forecast")
                        .queryParam("lat", geo.lat())
                        .queryParam("lon", geo.lon())
                        .queryParam("appid", apiKey)
                        .queryParam("cnt", cnt)
                        .queryParam("units", "metric")
                        .queryParam("lang", "en")
                        .build())
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                        error -> Mono.error(new RuntimeException("API not found")))
                .onStatus(HttpStatusCode::is5xxServerError,
                        error -> Mono.error(new RuntimeException("Server is not responding")))
                .bodyToMono(ThreeDaysForecast.class)
                .block();
    }
}
