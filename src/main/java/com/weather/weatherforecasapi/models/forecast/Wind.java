package com.weather.weatherforecasapi.models.forecast;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@EqualsAndHashCode
public class Wind {

    private Double speed;

    private Integer deg;

    private Double gust;
}
