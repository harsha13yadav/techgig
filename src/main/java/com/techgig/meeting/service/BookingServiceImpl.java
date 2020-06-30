package com.techgig.meeting.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgig.meeting.model.Booking;
import com.techgig.meeting.model.Room;
import com.techgig.meeting.repository.BookingRepository;
import com.techgig.meeting.repository.RoomRepository;

@Service
public class BookingServiceImpl implements BookingService {

	private final BookingRepository bookingRepository;
	private final RoomRepository roomRepository;

	@Autowired
	public BookingServiceImpl(BookingRepository bookingRepository, RoomRepository roomRepository) {
		this.bookingRepository = bookingRepository;
		this.roomRepository = roomRepository;
	}

	@Override
	public Booking bookARoom(final int roomId) {
		Room room = roomRepository.findById(roomId).get();
		room.setAvailable(false);
		roomRepository.save(room);
		return bookingRepository.save(new Booking(roomId));
	}

	@Override
	public List<Room> findAllAvailableRooms() {
		return roomRepository.findByIsAvailableTrue();
	}

	@Override
	public List<Booking> findAllBookings() {
		return bookingRepository.findAll();
	}

	@Override
	public Booking findBookingById(int bookingId) {
		return bookingRepository.findById(bookingId).get();
	}

	@Override
	public void cancelBooking(int bookingId) {
		int roomId = bookingRepository.findById(bookingId).get().getRoomId();
		Room room = roomRepository.findById(roomId).get();
		room.setAvailable(true);
		roomRepository.save(room);
		bookingRepository.deleteById(bookingId);
	}

}