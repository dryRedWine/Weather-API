package com.weather.weatherforecasapi.dto.forecastDto;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class WeatherDto {


    @NotNull
    private String main;

    @NotNull
    private String description;

}
