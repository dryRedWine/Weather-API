package com.weather.weatherforecasapi.storage;

import org.springframework.stereotype.Component;

@Component
public class ApiKeyStorageInMemory {

    private String apiKey;

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
