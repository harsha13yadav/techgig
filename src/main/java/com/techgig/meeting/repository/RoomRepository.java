package com.techgig.meeting.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techgig.meeting.model.Room;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

	List<Room> findByIsAvailableTrue();
}
