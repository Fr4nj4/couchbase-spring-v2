package com.fjcs.example.couchbase.dao;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;
import org.springframework.data.couchbase.core.mapping.id.GenerationStrategy;
import org.springframework.data.couchbase.core.mapping.id.IdPrefix;
import org.springframework.data.couchbase.core.mapping.id.IdSuffix;

import com.couchbase.client.java.repository.annotation.Field;
import com.couchbase.client.java.repository.annotation.Id;

@Document
public class Airport {
	
	public static final String TYPE = "airport";
	
	@Id @GeneratedValue(strategy = GenerationStrategy.USE_ATTRIBUTES, delimiter = "_")
	private String documentId;

	@Size(min = 5)
    @NotNull
	@Field @IdPrefix(order=0)
	private String type;

	@NotNull
	@Field @IdSuffix(order=0)
	private Long id;

	@Size(min = 5)
    @NotNull
	@Field("airportname")
    private String airportName;
 
	@Size(min = 5)
    @NotNull
    @Field
    private String city;
 
	@Size(min = 5)
    @NotNull
    @Field
    private String country;
 
	@Size(min = 4)
    @NotNull
    @Field
    private String icao;

	@Size(min = 5)
    @NotNull
    @Field
    private String tz;

    public Airport(String airportName, String city, String country, String icao, Long id, String tz, String type) {
        this.airportName = airportName;
        this.city = city;
        this.country = country;
        this.icao = icao;
        this.id = id;
        this.tz = tz;
        this.type = type;
    }

    
    // Getters and setters

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

	
    
}