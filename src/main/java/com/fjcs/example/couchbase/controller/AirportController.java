package com.fjcs.example.couchbase.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fjcs.example.couchbase.dao.Airport;
import com.fjcs.example.couchbase.services.AirportService;


@RestController
public class AirportController {
    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/airport")
    public List<Airport> list() {
        return airportService.list();
    }

}
