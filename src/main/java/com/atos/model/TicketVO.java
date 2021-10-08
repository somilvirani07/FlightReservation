package com.atos.model;

import java.time.LocalDate;

public class TicketVO {
	
	private int  TicketId  ; 
	private int customerId ;
	private String	Departure;
	private String	FROM;
	private String TO;
	private int	Numberofpassengers;
	private String insurance;
	private String refundable;
	private LocalDate BookingDate;
	private int	TotalAmount;
}
