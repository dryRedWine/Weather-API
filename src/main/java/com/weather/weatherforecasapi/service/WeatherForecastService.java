package com.weather.weatherforecasapi.service;

import com.weather.weatherforecasapi.dto.forecastDto.ForecastDto;

public interface WeatherForecastService {

    String setApiKey(String apiKey);

    ForecastDto getCurrentData(String city, String apikey);
}
