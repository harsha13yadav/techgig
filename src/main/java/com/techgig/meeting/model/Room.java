package com.techgig.meeting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rooms")
public class Room {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int roomId;
	private String roomName;
	private String roomType;
	private int buildingId;
	private int floorId;
	private boolean isAvailable;

	public Room() {

	}

	public Room(String roomName, String roomType, int buildingId, int floorId) {
		this.roomName = roomName;
		this.roomType = roomType;
		this.buildingId = buildingId;
		this.floorId = floorId;
	}

	public int getRoomId() {
		return roomId;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getBuildingId() {
		return buildingId;
	}

	public void setBuildingId(int building) {
		this.buildingId = building;
	}

	public int getFloorId() {
		return floorId;
	}

	public void setFloorId(int floor) {
		this.floorId = floor;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

}