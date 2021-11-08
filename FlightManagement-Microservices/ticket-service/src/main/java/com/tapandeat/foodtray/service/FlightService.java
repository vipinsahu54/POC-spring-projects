package com.tapandeat.foodtray.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.tapandeat.foodtray.model.Flight;

@FeignClient(value="FLIGHT-SERVICE", fallback=FlightServiceFallback.class)
public interface FlightService {
	
	@GetMapping(value = "/flights")
	public List<Flight> getAllFlights();
	
	@GetMapping(value="/flight/{id}")
	public Flight getFlightById(@PathVariable("id") Integer id);
	
}
