package com.cp.flightmanagementsystem.dto;

public class ScheduledFlight {
    
    String flight;
    int cost;
    Schedule schedule;
     public ScheduledFlight(String flight,int cost,Schedule schedule2)
     {
  	   
  	      this.flight=flight;
  	      this.cost=cost;
  	      this.schedule=schedule2;
  	   
     }
     public void setFlight(String flight) {
		this.flight = flight;
	}
	public void setAvailableSeats(int availableSeats) {
		this.cost = cost;
	}
	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	public String getFlight() {
  	   
  	   return flight;
     }
     public int getAvailableSeats() {
  	   
  	   return cost;
     }
     public Schedule getSchedule() {
  	   
  	     return schedule;
     }

 


}
