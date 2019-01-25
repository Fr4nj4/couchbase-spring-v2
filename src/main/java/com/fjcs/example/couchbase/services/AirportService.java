package com.fjcs.example.couchbase.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.fjcs.example.couchbase.command.CreateAirportCommand;
import com.fjcs.example.couchbase.dao.Airport;
import com.fjcs.example.couchbase.repository.AirportRepository;

@Service
public class AirportService {

	private final AirportRepository airportRepository;

	public AirportService(AirportRepository airportRepository) {
		this.airportRepository = airportRepository;
	}

	
	  public List list() { 
		  Iterable airportIterable = airportRepository.findAll();
		  List airports = new ArrayList(); airportIterable.forEach(airports::add);
		  return airports; 
	  }
	  
	  public List list(String country, int pageNumber, int pageSize) {
		    PageRequest pageRequest = PageRequest.of(pageNumber, pageSize);
		    Page page = airportRepository.findByCountry(country, pageRequest);
		    return page.getContent();
		}
	  
	  public Airport create(CreateAirportCommand command) {

		    String airportName = command.getAirportName();
		    String city = command.getCity();
		    String country = command.getCountry();
		    String icao = command.getIcao();
		    Long id = command.getId();
		    String type = Airport.TYPE;
		    String tz = command.getTz();

		    Airport airport = new Airport(airportName, city, country, icao, id, tz, type);

		    airportRepository.save(airport);

		    return airport;
		}
	 

}