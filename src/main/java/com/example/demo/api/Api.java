package com.example.demo.api;
/*
created by mumakhado on 2021/02/16
*/

import com.example.demo.service.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

//import javax.ws.rs.Path;

@RestController
@Path("/conversions")
public class Api {

    Service service = new Service();

    @GET
    @Path("/ktoc")
    public Double getCelsius(@RequestParam Double kelvin){
        return  service.getCelcius(kelvin);
    }

    @GET
    @Path("/ctok")
    public Double getkelvin(@RequestParam Double celsius){
        return  service.getKelvin(celsius);
    }

    @GET
    @Path("/mtok")
    public Double getkilometers(@RequestParam Double miles){
        return  service.getkilometers(miles);
    }

    @GET
    @Path("/ktom")
    public Double getMiles(@RequestParam Double kilometers){
        return  service.getMiles(kilometers);
    }
}
