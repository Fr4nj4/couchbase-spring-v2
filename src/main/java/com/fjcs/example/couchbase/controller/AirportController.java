package com.fjcs.example.couchbase.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fjcs.example.couchbase.command.CreateAirportCommand;
import com.fjcs.example.couchbase.dao.Airport;
import com.fjcs.example.couchbase.services.AirportService;


@RestController
@RequestMapping("/airport")
public class AirportController {
    private final AirportService airportService;

    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/allAirports")
    public List<Airport> list() {
        return airportService.list();
    }
    
    
    @GetMapping("/airport/{country}")
    public List list(@PathVariable String country, @RequestParam int pageNumber, @RequestParam int pageSize) {
        return airportService.list(country, pageNumber, pageSize);
    }
    
    @PostMapping("/airport")
    public Airport create(@RequestBody CreateAirportCommand command) {
        return airportService.create(command);
    }

}
