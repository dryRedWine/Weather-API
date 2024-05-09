package com.weather.weatherforecasapi.models.forecast;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Rain {

    @JsonProperty("1h")
    private Double oneH;

    @JsonProperty("3h")
    private Double threeH;
}
