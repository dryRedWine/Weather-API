package com.weather.weatherforecasapi.dto.forecastDto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class SysDto {

    private Long sunrise;

    private Long sunset;
}
