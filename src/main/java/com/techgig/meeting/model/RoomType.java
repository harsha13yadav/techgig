package com.techgig.meeting.model;

public enum RoomType {

	FOUR_SEATER(4),

	EIGHT_SEATER(8);

	private int seats;

	RoomType(int seats) {
		this.seats = seats;
	}

	public int getSeats() {
		return seats;
	}

}
