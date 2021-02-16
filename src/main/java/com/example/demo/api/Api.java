package com.example.demo.api;
/*
created by mumakhado on 2021/02/16
*/

import com.example.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/conversions")
public class Api {

    Service service = new Service();
    public static Logger logger = Logger.getLogger("Log");

    @GetMapping("/ktoc")
    public Double getCelsius(@RequestParam Double kelvin){
        Instant start = Instant.now();
        Double celcius = service.getCelcius(kelvin);
        Instant end = Instant.now();
        logger.log(Level.INFO, "execution duration: "+ Duration.between(start, end).getSeconds());
        return celcius;
    }

    @GetMapping("/ctok")
    public Double getkelvin(@RequestParam Double celsius){
        Instant start = Instant.now();
        double kelvin = service.getKelvin(celsius);
        Instant end = Instant.now();
        logger.log(Level.INFO, "execution duration: "+ Duration.between(start, end).getSeconds());
        return kelvin;
    }

    @GetMapping("/mtok")
    public Double getkilometers(@RequestParam Double miles){
        Instant start = Instant.now();
        double kilo =  service.getkilometers(miles);
        Instant end = Instant.now();
        logger.log(Level.INFO, "execution duration: "+ Duration.between(start, end).getSeconds());
        return kilo;
    }

    @GetMapping("/ktom")
    public Double getMiles(@RequestParam Double kilometers){
        Instant start = Instant.now();
        double miles = service.getMiles(kilometers);
        Instant end = Instant.now();
        logger.log(Level.INFO, "execution duration: "+ Duration.between(start, end).getSeconds());
        return miles;
    }
}
