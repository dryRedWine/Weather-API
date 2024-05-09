package com.weather.weatherforecasapi.dto;

import lombok.*;


public record GeoResponseDto(String name, Float lat, Float lon, String country, String state) {
}
