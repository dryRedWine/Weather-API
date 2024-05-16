package com.weather.weatherforecasapi.models;

import com.weather.weatherforecasapi.dto.forecastDto.*;
import com.weather.weatherforecasapi.models.forecast.Forecast;
import org.springframework.stereotype.Component;

@Component
public class ForecastMapper {

    public static ForecastDto toForecastDto(Forecast forecast) {
        var weather = forecast.getWeatherList().get(0);
        return  ForecastDto.builder()
                .weatherDto(new WeatherDto(weather.getMain(), weather.getDescription()))
                .temperature(new Temperature(forecast.getMain().getTemp(), forecast.getMain().getFeelsLike()))
                .visibility(forecast.getVisibility())
                .windDto(new WindDto(forecast.getWind().getSpeed()))
                .datetime(forecast.getDatetime())
                .name(forecast.getName())
                .sysDto(new SysDto(forecast.getSys().getSunrise(), forecast.getSys().getSunset()))
                .timezone(forecast.getTimezone())
                .name(forecast.getName())
                .build();
    }
}
