package com.cp.flightmanagementsystem.dao;

import java.util.List;

import com.cp.flightmanagementsystem.dto.Airport;
import com.cp.flightmanagementsystem.dto.ScheduledFlight;

public interface ScheduledFlightDao {
	public boolean  scheduleFlightDao(ScheduledFlight s );
	 
	 public List<ScheduledFlight> viewScheduledFlightsDao(Airport airport1,Airport airport2,String date) ;
	 
	 public List<ScheduledFlight> viewScheduledFlightsDao2(String flightname);
	 
	 public List<ScheduledFlight> viewScheduleFlightDao();
	 
	 public ScheduledFlight modifyScheduledFlightDao(String flightname );
	 
	 public String deleteScheduledFlightDao(String flightname);

}
