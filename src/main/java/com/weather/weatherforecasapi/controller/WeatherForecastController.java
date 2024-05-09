package com.weather.weatherforecasapi.controller;

import com.weather.weatherforecasapi.dto.forecastDto.ForecastDto;
import com.weather.weatherforecasapi.service.WeatherForecastService;
import jakarta.validation.constraints.NotBlank;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/forecast")
@RequiredArgsConstructor
public class WeatherForecastController {

    private final WeatherForecastService weatherForecastService;

    @PutMapping()
    @ResponseStatus(HttpStatus.OK)
    public String setApiKey(@RequestParam(required = false) @NotBlank String apiKey) {
        log.info("Set new api key({})", apiKey);
        return weatherForecastService.setApiKey(apiKey);
    }

    @GetMapping("/currentWeatherData")
    @ResponseStatus(HttpStatus.OK)
    public ForecastDto getCurrentData(@RequestParam @NotBlank String city,
                                      @RequestParam(required = false) String apiKey) {
        log.info("Current weather forecast for {}", city);
        return weatherForecastService.getCurrentData(city, apiKey);
    }

//    @GetMapping("/dailyForecastSixteenDays")
//    @ResponseStatus(HttpStatus.OK)
//    public Forecast getForecastSixteenDays(@RequestBody Forecast forecast) {
//        log.info("Current weather forecast");
//        return weatherForecastService.getCurrentData(forecast);
//    }
}
