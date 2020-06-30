package com.techgig.meeting.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techgig.meeting.model.Booking;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Integer> {

}
