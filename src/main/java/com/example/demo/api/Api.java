package com.example.demo.api;
/*
created by mumakhado on 2021/02/16
*/

import com.example.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.Path;

@RestController
@Path("/conversions")
public class Api {

    Service service = new Service();

    @GetMapping("/ktoc")
    public Double getCelsius(@RequestParam Double kelvin){
        return  service.getCelcius(kelvin);
    }
}
