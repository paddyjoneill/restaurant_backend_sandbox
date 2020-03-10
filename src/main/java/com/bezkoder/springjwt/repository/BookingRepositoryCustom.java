package com.bezkoder.springjwt.repository;

import com.bezkoder.springjwt.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {
    List<Booking> findBookingsByDate(String date);
}
