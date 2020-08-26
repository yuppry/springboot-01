package com.example.springmaven;

import com.example.springmaven.data.entity.Guest;
import com.example.springmaven.data.entity.Reservation;
import com.example.springmaven.data.entity.Room;
import com.example.springmaven.data.repository.GuestRepository;
import com.example.springmaven.data.repository.ReservationRepository;
import com.example.springmaven.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMavenApplication.class, args);
	}

//	@RestController
//	@RequestMapping("/rooms")
//	public class RoomController{
//		@Autowired
//		private RoomRepository roomRepository;
//
//		@GetMapping
//		public Iterable<Room> getRooms(){
//			return this.roomRepository.findAll();
//		}
//	}
//
//	@RestController
//	@RequestMapping("/guests")
//	public class GuestController{
//		@Autowired
//		private GuestRepository guestRepository;
//
//		@GetMapping
//		public Iterable<Guest> getGuests(){
//			return this.guestRepository.findAll();
//		}
//	}

}


