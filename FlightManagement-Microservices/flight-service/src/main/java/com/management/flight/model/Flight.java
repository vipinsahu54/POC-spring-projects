package com.management.flight.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Flight {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer flightId;
	private String flightName;
	private String origin;
	private String dest;
	private int seat;
	private Date departure;
	private Date arrival;
	private int price;

	
	public String getOrigin() {
		return origin;
	}


	public void setOrigin(String origin) {
		this.origin = origin;
	}


	public String getDest() {
		return dest;
	}


	public void setDest(String dest) {
		this.dest = dest;
	}


	public int getSeat() {
		return seat;
	}


	public void setSeat(int seat) {
		this.seat = seat;
	}


	public Integer getFlightId() {
		return flightId;
	}


	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}


	public String getFlightName() {
		return flightName;
	}


	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}


	public Date getDeparture() {
		return departure;
	}


	public void setDeparture(Date departure) {
		this.departure = departure;
	}


	public Date getArrival() {
		return arrival;
	}


	public void setArrival(Date arrival) {
		this.arrival = arrival;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Flight [flightId=" + flightId + ", flightName=" + flightName + ", price=" + price + "]";
	}

}
