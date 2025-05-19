package com.example.demo.response;

import lombok.Data;

@Data
public class TicketInfo {
	private String bookedFrom;
	private String bookedTo;
	private String pnr;
	private String trainNo;
	private String trainName;
	private String coach;
	private String birth;
	private String bookingStatus;
	private String currentStatus;
	private String departureTime;
	private String journeyDate;
	private String fare; 
	
	

}
