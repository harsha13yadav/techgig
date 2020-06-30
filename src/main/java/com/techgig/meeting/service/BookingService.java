package com.techgig.meeting.service;

import java.util.List;

import com.techgig.meeting.model.Booking;
import com.techgig.meeting.model.Room;

public interface BookingService {
	
	List<Room> findAllAvailableRooms();

	List<Booking> findAllBookings();

	Booking bookARoom(int roomId);
	
	Booking findBookingById(int bookingId);

	void cancelBooking(int bookingId);
}
