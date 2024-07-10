package com.weather.weatherforecasapi.service;

import com.weather.weatherforecasapi.dto.forecastDto.ForecastDto;
import com.weather.weatherforecasapi.models.forecast.SixteenDaysForecast;
import com.weather.weatherforecasapi.models.forecast.ThreeDaysForecast;

public interface WeatherForecastService {

    String setApiKey(String apiKey);

    ForecastDto getCurrentData(String city, String apikey);

    SixteenDaysForecast getDailyForecast(String city, String apiKey, Integer cnt);

    ThreeDaysForecast getThreeHoursForecast(String city, String apiKey, Integer cnt);
}
