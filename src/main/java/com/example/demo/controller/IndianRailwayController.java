package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.PassengerInfo;
import com.example.demo.response.TicketInfo;

@RestController
public class IndianRailwayController {
@PostMapping("/ticket")
public ResponseEntity <TicketInfo> getTicketdetails(@RequestBody PassengerInfo pinfo){
	TicketInfo ticket = new TicketInfo();
	ticket.setBookedFrom(pinfo.getBookedFrom());
	ticket.setBookedTo(pinfo.getBookedTo());
	ticket.setPnr("2134104321");
	ticket.setTrainNo("22433");
	ticket.setTrainName("GCT ANVT SF EXP");
	ticket.setCoach("HA1");
	ticket.setBirth("SIDE LOWER");
	ticket.setBookingStatus("RLWL/12");
	ticket.setCurrentStatus("CONFIRMED");
	ticket.setDepartureTime("23:00");
	ticket.setJourneyDate("20-05-2025");
	ticket.setFare("2400.00 INR");
	return new ResponseEntity<>(ticket, HttpStatus.CREATED);
}

}
