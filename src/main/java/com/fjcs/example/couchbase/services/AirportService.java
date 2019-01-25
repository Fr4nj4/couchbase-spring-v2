package com.fjcs.example.couchbase.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.fjcs.example.couchbase.repository.AirportRepository;

@Service
public class AirportService {

	private final AirportRepository airportRepository;

	public AirportService(AirportRepository airportRepository) {
		this.airportRepository = airportRepository;
	}

	
	  public List list() { Iterable airportIterable = airportRepository.findAll();
	  List airports = new ArrayList(); airportIterable.forEach(airports::add);
	  return airports; }
	 

}