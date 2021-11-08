package com.management.flight.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.management.flight.model.Flight;
import com.management.flight.repository.FlightRepository;


@RestController
public class FlightController {

	@Autowired
	private FlightRepository flightRepository;
	
	@GetMapping(value = "/flights")
	public List<Flight> getAllFlights() {
		return flightRepository.findAll();
	}
	
	@GetMapping(value="/flight/{id}")
	public Flight getFlightById(@PathVariable("id") Integer id) {
		return flightRepository.findById(id).get();
	}
	
	@PostMapping(value = "/flight/add")
	public void addFlight(@RequestBody Flight flight) {
		flightRepository.save(flight);
	}
	
	@DeleteMapping(value = "/flight/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		flightRepository.deleteById(id);
	}
}
