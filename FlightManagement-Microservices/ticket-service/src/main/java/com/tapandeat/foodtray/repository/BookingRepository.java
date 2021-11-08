package com.tapandeat.foodtray.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tapandeat.foodtray.model.Booking;

public interface BookingRepository extends JpaRepository<Booking, Integer>{

}
