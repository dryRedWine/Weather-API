package com.weather.weatherforecasapi.models;

import com.weather.weatherforecasapi.dto.forecastDto.ForecastDto;
import com.weather.weatherforecasapi.models.forecast.Forecast;
import org.springframework.stereotype.Component;

@Component
public class ForecastMapper {

//    public static ForecastDto toForecastDto(Forecast forecast) {
//        return  ForecastDto.builder()
//                .temperature()
//                .datetime(forecast.getDatetime())
//                .name(forecast.getName())
//                .sys(forecast.getSys())
//                .timezone(forecast.getTimezone())
//                .visibility(forecast.getVisibility())
//                .wind(forecast.getWind())
//                .weather(forecast.getWeather())
//                .build();
//    }

//    {
//        "weather": {
//        "main": "Clouds",
//        "description": "scattered clouds",
//    },
//        "temperature": {
//        "temp": 269.6,
//                "feels_like": 267.57,
//    },
//        "visibility": 10000,
//            "wind": {
//        "speed": 1.38,
//    },
//        "datetime": 1675744800,
//            "sys": {
//        "sunrise": 1675751262,
//                "sunset": 1675787560
//    },
//        "timezone": 3600,
//            "name": "Zocca",
//    }
}
