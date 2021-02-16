package com.example.demo.service;
/*
created by mumakhado on 2021/02/16
*/

public class Service {

    public double getCelcius(Double kelvin){

        double celsius = kelvin - 273.15;

        return celsius;

    }

    public double getKelvin(Double celsius){

        double kelvin = celsius + 273.15;

        return  kelvin;
    }

    public double getkilometers(double miles){

        double kilometer = miles / 0.62137;

        return kilometer;
    }

    public double getMiles(double kilometer){

        double miles = kilometer * 0.62137;

        return miles;
    }


}
