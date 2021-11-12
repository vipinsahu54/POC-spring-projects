package com.tapandeat.foodtray.controller;

import java.util.List;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tapandeat.foodtray.model.Booking;
import com.tapandeat.foodtray.model.Flight;
import com.tapandeat.foodtray.model.User;
import com.tapandeat.foodtray.repository.BookingRepository;
import com.tapandeat.foodtray.service.FlightService;
import com.tapandeat.foodtray.service.UserService;


@RestController
public class TicketController {

	@Autowired
	private BookingRepository bookingRepository;
	
	@Autowired
	private FlightService flightService;
	
	@Autowired
	private UserService userService;
	
	@GetMapping(value = "/booking")
	public List<Booking> getAll() {
		return bookingRepository.findAll();
	}
	
	@GetMapping(value="/booking/{id}")
	public Booking getById(@PathVariable("id") Integer id) {
		return bookingRepository.findById(id).get();
	}
	
	@PostMapping(value ="/booking/add")
	public void add(@RequestBody Booking booking, @RequestHeader("Authorization") String authToken) {
		User user=getUser(authToken);
		System.out.println(user);
		Flight flight=flightService.getFlightById(booking.getFlightId());
		System.out.println(flight);
		if(user != null && flight !=null && user.getType().equalsIgnoreCase("traveller") && flight.getSeat()>0)
			bookingRepository.save(booking);
	}
	
	@DeleteMapping(value = "/booking/delete/{id}")
	public String remove(@PathVariable("id") Integer id, @RequestParam("userId") Integer userId) {
		Optional<Booking> booking = bookingRepository.findById(id);
		if(booking.isPresent() && booking.get().getUserId().equals(userId)) {
			bookingRepository.deleteById(id);
			return "successfully deleted";
		}
		return "Exception occur";
	}
	
	private User getUser(String authToken) {
		Base64 base64 = new Base64();
		String s= new String(base64.decode(authToken.getBytes()));
		String[] split = s.split(":");
		return userService.authenticate(split[0], split[1]);
	}
 }
