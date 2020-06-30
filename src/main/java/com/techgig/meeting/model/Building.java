package com.techgig.meeting.model;

import java.util.List;

public class Building {
	private int buildingId;
	private String buildingName;
	private List<Floor> floors;
	private List<Room> rooms;

	public Building(int id, String name) {
		buildingId = id;
		buildingName = name;
	}

	public int getBuildingId() {
		return buildingId;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public List<Floor> getFloors() {
		return floors;
	}

	public void setFloors(List<Floor> floors) {
		this.floors = floors;
	}

	public List<Room> getRooms() {
		return rooms;
	}

	public void setRooms(List<Room> rooms) {
		this.rooms = rooms;
	}

}
