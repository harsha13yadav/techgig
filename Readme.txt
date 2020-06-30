List of all assumptions

1. There are available buildings with floors containing rooms.
2. For booking user will provide room id
3. For cancellation user will provide booking id

Installation Guide
1. Unzip the project and run the application as Spring Boot application.
2. H2 database will start. Run rooms.sql script in H2 db.(Install MySQL and run the provided db script(rooms.sql) and start the DB server)
3. Run requests from Postman.

Steps for build & execution for all APIs
1. Unzip the project and run the application as Spring Boot application.
2. H2 database will start or (Install MySQL and run the provided db script(rooms.sql) and start the DB server)
3. Connect to http://localhost:8000/h2-console with JDBC URL "jdbc:h2:mem:booking".
4. Run rooms.sql script in H2 db.
5. Run PostMan app.
6. For getting available rooms: Get -> http://localhost:8000/findAll
7. For booking a room: Post -> http://localhost:8000/bookARoom/1 --> 1 is the room id.
8. For cancelling a booking: Post -> http://localhost:8000/cancelBooking/1 --> 1 is the booking id
