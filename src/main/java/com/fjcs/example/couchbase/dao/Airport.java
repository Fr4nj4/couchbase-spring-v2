package com.fjcs.example.couchbase.dao;

import org.springframework.data.couchbase.core.mapping.Document;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Airport {
 
    @Id
    private String documentId;
 
    public String getDocumentId() {
		return documentId;
	}

	public void setDocumentId(String documentId) {
		this.documentId = documentId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getIcao() {
		return icao;
	}

	public void setIcao(String icao) {
		this.icao = icao;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Field("airportname")
    private String airportName;
 
    @Field
    private String city;
 
    @Field
    private String country;
 
    @Field
    private String icao;
 
    @Field
    private Long id;
 
    @Field
    private String tz;
 
    @Field
    private String type;
 
    public Airport(String airportName, String city, String country, String icao, Long id, String tz, String type) {
        this.airportName = airportName;
        this.city = city;
        this.country = country;
        this.icao = icao;
        this.id = id;
        this.tz = tz;
        this.type = type;
    }

	
    
}