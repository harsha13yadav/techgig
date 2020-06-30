DROP TABLE bookings;
DROP TABLE rooms;
DROP TABLE buildings;

CREATE TABLE buildings(
	building_id INT NOT NULL AUTO_INCREMENT,
	building_name VARCHAR(20) NOT NULL,
	floor_id INT NOT NULL,
	room_id INT NOT NULL,
	PRIMARY KEY(building_id, floor_id, room_id)
	);
	
CREATE TABLE rooms(
	room_id INT NOT NULL AUTO_INCREMENT,
	room_name VARCHAR(20) NOT NULL,
	room_type VARCHAR(20) NOT NULL,
    building_id INT NOT NULL,
    floor_id INT NOT NULL,
	is_available BOOLEAN DEFAULT TRUE,
	FOREIGN KEY(building_id, floor_id, room_id) REFERENCES buildings(building_id, floor_id, room_id),
	PRIMARY KEY (room_id)
	);
		
CREATE TABLE bookings(
	booking_id INT NOT NULL AUTO_INCREMENT,
	room_id INT NOT NULL,
	FOREIGN KEY(room_id) REFERENCES rooms(room_id),
	PRIMARY KEY(booking_id)
	);
	
	
ALTER TABLE buildings DROP PRIMARY KEY;
ALTER TABLE buildings ADD PRIMARY KEY(building_id, floor_id, room_id);
ALTER TABLE rooms ADD FOREIGN KEY (building_id, floor_id, room_id) REFERENCES  buildings(building_id, floor_id, room_id);
ALTER TABLE bookings ADD FOREIGN KEY (room_id) REFERENCES  rooms(room_id);
	
INSERT INTO buildings (building_id, building_name, floor_id, room_id) VALUES (1, 'A', 1, 1);
INSERT INTO buildings (building_id, building_name, floor_id, room_id) VALUES (1, 'A', 1, 2);
INSERT INTO buildings (building_id, building_name, floor_id, room_id) VALUES (1, 'A', 2, 3);
INSERT INTO buildings (building_id, building_name, floor_id, room_id) VALUES (1, 'A', 3, 4);
INSERT INTO buildings(building_id, building_name, floor_id, room_id) VALUES (2, 'B', 1, 5);
INSERT INTO buildings (building_id, building_name, floor_id, room_id) VALUES (2, 'B', 2, 6);

INSERT INTO rooms (room_id, room_name, room_type, building_id, floor_id) VALUES (1, 'R1_11', 'FOUR', 1, 1);
INSERT INTO rooms (room_id, room_name, room_type, building_id, floor_id) VALUES (2, 'R2_11', 'FOUR', 1, 1);
INSERT INTO rooms (room_id, room_name, room_type, building_id, floor_id) VALUES (3, 'R3_12', 'FOUR', 1, 2);
INSERT INTO rooms (room_id, room_name, room_type, building_id, floor_id) VALUES (4, 'R4_13', 'FOUR', 1, 3);
INSERT INTO rooms (room_id, room_name, room_type, building_id, floor_id) VALUES (5, 'R1_21', 'EIGHT', 2, 1);
INSERT INTO rooms (room_id, room_name, room_type, building_id, floor_id) VALUES (6, 'R2_22', 'EIGHT', 2, 2);