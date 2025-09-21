package com.example.demo.controller;

import com.example.demo.service.WeatherService; // ✅ This import is required!

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/weather")
@CrossOrigin(origins = "http://localhost:3000")
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/{city}")
    public String getWeather(@PathVariable String city) {
        return weatherService.fetchWeatherData(city);
    }
}
