package com.weather.weatherforecasapi.models.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.List;

@Setter
@Getter
@ToString
@Builder
@EqualsAndHashCode
public class Forecast {

    @NotNull
    private Coord coord;

    @NotNull
    @JsonProperty("weather")
    private List<Weather> weatherList;

    @NotNull
    private String base;

    @NotNull
    private Main main;

    @NotNull
    private Long visibility;

    @NotNull
    private Wind wind;

    @NotNull
    private Clouds clouds;

    private Rain rain;

    private Snow snow;

    @NotNull
    @JsonProperty("dt")
    private Long datetime;

    @NotNull
    private Sys sys;

    @NotNull
    private Long timezone;

    @NotNull
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String cod;

}
