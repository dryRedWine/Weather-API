package com.weather.weatherforecasapi.models.forecast;


import jakarta.validation.constraints.NotNull;
import lombok.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Weather {

    @NotNull
    private Long id;

    @NotNull
    private String main;

    @NotNull
    private String description;

    @NotNull
    private String icon;

}
