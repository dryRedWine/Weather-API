package com.weather.weatherforecasapi.dto.forecastDto;

import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Temperature {

    private double temp;

    private double feel_like;

    public Temperature() {
    }

}
