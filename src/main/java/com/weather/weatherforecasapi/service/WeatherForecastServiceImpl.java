package com.weather.weatherforecasapi.service;

import com.weather.weatherforecasapi.client.WeatherWebClient;
import com.weather.weatherforecasapi.dto.GeoResponseDto;
import com.weather.weatherforecasapi.dto.forecastDto.ForecastDto;
import com.weather.weatherforecasapi.exceptions.ApiKeyBlankException;
import com.weather.weatherforecasapi.exceptions.ApiKeyNotFoundException;
import com.weather.weatherforecasapi.exceptions.CityNotFoundException;
import com.weather.weatherforecasapi.models.ForecastMapper;
import com.weather.weatherforecasapi.models.forecast.Forecast;
import com.weather.weatherforecasapi.models.forecast.SixteenDaysForecast;
import com.weather.weatherforecasapi.models.forecast.ThreeDaysForecast;
import com.weather.weatherforecasapi.storage.ApiKeyStorageInMemory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WeatherForecastServiceImpl implements WeatherForecastService {

    private final ApiKeyStorageInMemory storage;

    private final WeatherWebClient client;

    @Override
    public String setApiKey(String apiKey) {
        if (apiKey.isBlank())
            throw new ApiKeyBlankException("A blank api key was passed");
        storage.setApiKey(apiKey);
        // we can add api key check here
        return apiKey;
    }

    @Override
    public ForecastDto getCurrentData(String city, String apiKey) {
        if (apiKey != null)
            storage.setApiKey(apiKey);
        if (storage.getApiKey() == null)
            throw new ApiKeyNotFoundException("The api key was not found");
        List<GeoResponseDto> geo = client.getGeo(city, apiKey);
        if (geo == null)
            throw new CityNotFoundException("City was not found");
        Forecast forecast = client.getCurrentWeather(geo.get(0), apiKey);
        return ForecastMapper.toForecastDto(forecast);
    }

    @Override
    public SixteenDaysForecast getDailyForecast(String city, String apiKey, Integer cnt) {
        if (apiKey != null)
            storage.setApiKey(apiKey);
        if (storage.getApiKey() == null)
            throw new ApiKeyNotFoundException("The api key was not found");
        List<GeoResponseDto> geo = client.getGeo(city, apiKey);
        if (geo == null)
            throw new CityNotFoundException("City was not found");
        return client.getDailyForecast(geo.get(0), apiKey, cnt);
    }

    @Override
    public ThreeDaysForecast getThreeHoursForecast(String city, String apiKey, Integer cnt) {
        if (apiKey != null)
            storage.setApiKey(apiKey);
        if (storage.getApiKey() == null)
            throw new ApiKeyNotFoundException("The api key was not found");
        List<GeoResponseDto> geo = client.getGeo(city, apiKey);
        if (geo == null)
            throw new CityNotFoundException("City was not found");
        return client.getThreeDaysForecast(geo.get(0), apiKey, cnt);
    }
}
