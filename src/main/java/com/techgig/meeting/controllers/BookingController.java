package com.techgig.meeting.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.techgig.meeting.model.Booking;
import com.techgig.meeting.model.Room;
import com.techgig.meeting.service.BookingService;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;

	@GetMapping(value = "/findAll", produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Room> findAll() {
		return bookingService.findAllAvailableRooms();
	}

	@PostMapping(path = "/bookARoom/{roomId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Booking> bookARoom(@PathVariable int roomId) {
		Booking booking = bookingService.bookARoom(roomId);
		return new ResponseEntity<>(booking, HttpStatus.CREATED);
	}

	@PostMapping(path = "/cancelBooking/{bookingId}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<HttpStatus> cancelBooking(@PathVariable int bookingId) {
		bookingService.cancelBooking(bookingId);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
