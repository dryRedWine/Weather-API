package com.weather.weatherforecasapi.models.forecast;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Sys {

    private Integer type;

    private Integer id;

    private String country;

    private Long sunrise;

    private Long sunset;

}
