package com.fjcs.example.couchbase.repository;

import java.util.List;

import org.springframework.data.couchbase.core.query.Query;
import org.springframework.data.couchbase.repository.CouchbasePagingAndSortingRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.fjcs.example.couchbase.dao.Airport;





public interface AirportRepository extends PagingAndSortingRepository<Airport, String> {
	
	// Esta sentencia es equivalente a utilizar:
	// SELECT #{#n1ql.fields} FROM #{#n1ql.bucket} WHERE type = 'airport' and country = $country
	//	 @Query("#{#n1ql.selectEntity} WHERE type = 'airport' AND country = $country")
	//	    List list(String country);

	// Sentencia equivalente a: 
	 // #{#n1ql.selectEntity} WHERE _class = 'com.autentia.democouchbase.entity.Airport' AND country = $country
//	 @Query("#{#n1ql.selectEntity} WHERE #{#n1ql.filter} AND country = $country")
//	    Page list(String country, Pageable pageable);
	
	
    Page findByCountry(String country, Pageable pageable);

//
//    Page<Airport> findByCountry(String country, Pageable pageable);
}
