package com.weather.weatherforecasapi.client;

import com.weather.weatherforecasapi.dto.GeoResponseDto;
import com.weather.weatherforecasapi.models.forecast.Forecast;
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

//    @Autowired
//    public WeatherWebClient(String url) {
//        client = WebClient.builder()
//                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//                .build();
//    }


//    public MessageDto run(MessageDto messageDto, String param) {
//        return client.post()
//                .uri(uriBuilder -> uriBuilder
//                        .path("/microservice/third/message")
//                        .queryParam("newText", param)
////                                URLEncoder.encode(param, StandardCharsets.UTF_8))
//                        .build())
//                .body(Mono.just(messageDto), MessageDto.class)
//                .retrieve()
//                .onStatus(HttpStatusCode::is4xxClientError,
//                        error -> Mono.error(new RuntimeException("API not found")))
//                .onStatus(HttpStatusCode::is5xxServerError,
//                        error -> Mono.error(new RuntimeException("Server is not responding")))
//                .bodyToMono(MessageDto.class)
//                .block();
//    }

    public List<GeoResponseDto> getGeo(String cityName, String apiKey) {
        log.info("Find out geo for {}", cityName);
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
                .bodyToMono(new ParameterizedTypeReference<List<GeoResponseDto>>() {});
        return response.block();
    }

    public Forecast getCurrentWeather(GeoResponseDto geo, String apiKey) {
        log.info("Find out current weather forecast");
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
}
