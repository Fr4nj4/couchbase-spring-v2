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

    @Query("#{#n1ql.selectEntity} WHERE #{#n1ql.filter} AND country = $country")
    Page<Airport> list(String country, Pageable pageable);

    Page<Airport> findByCountry(String country, Pageable pageable);
}
