package com.management.flight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.management.flight.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
