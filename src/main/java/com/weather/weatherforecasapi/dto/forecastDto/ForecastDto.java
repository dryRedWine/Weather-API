package com.weather.weatherforecasapi.dto.forecastDto;

import com.weather.weatherforecasapi.models.forecast.Sys;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
@EqualsAndHashCode
public class ForecastDto {

    @NotNull
    private WeatherDto weatherDto;

    @NotNull
    private Temperature temperature;

    @NotNull
    private Long visibility;

    @NotNull
    private WindDto windDto;

    @NotNull
    private Long datetime;

    @NotNull
    private SysDto sysDto;

    @NotNull
    private Long timezone;

    @NotNull
    private String name;
}
