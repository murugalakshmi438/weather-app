package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    private final String apiKey = "3f1db4514d4496614eec745835f4ca4f";

    public String fetchWeatherData(String city) {
        String url = "https://api.openweathermap.org/data/2.5/weather?q=" +
                city + "&appid=" + apiKey + "&units=metric";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }
}
