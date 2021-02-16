package com.example.demo.service;
/*
created by mumakhado on 2021/02/16
*/

public class Service {

    public double getCelcius(Double kelvin){

        double celsius = kelvin - 273.15;

        return celsius;

        int start = (int) (System.currentTimeMillis() * 1000);

    }

    public double getKelvin(Double celsius){

        double kelvin = celsius + 273.15;

        return  kelvin;
    }

    public double getkilometers(double miles){

    }


}
