package com.weather.weatherforecasapi.models.forecast;


import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Coord {

    private Double lon;

    private Double lat;
}
