package com.weather.weatherforecasapi.exceptions;

public class ApiKeyBlankException extends RuntimeException {

    public ApiKeyBlankException(String message) {
        super(message);
    }
}
