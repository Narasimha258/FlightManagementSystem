package com.cp.flightmanagementsystem.services;

import java.util.List;

import com.cp.flightmanagementsystem.dto.Airport;
import com.cp.flightmanagementsystem.dto.ScheduledFlight;
import com.cp.flightmanagementsystem.exception.ScheduledFlightServiceException;

public interface ScheduledFlightService {
public boolean  scheduleFlight(ScheduledFlight s) throws ScheduledFlightServiceException ;
	
	public List<ScheduledFlight> viewScheduledFlights2(String flightname) ;
	
	public List<ScheduledFlight> viewScheduleFlight();
	
	 public String deleteScheduledFlight(String flightname);
	 
	 public ScheduledFlight modifyScheduledFlight(String flightname);
	 
	 public List<ScheduledFlight> viewScheduledFlights(Airport airport1,Airport airport2,String date);

}
