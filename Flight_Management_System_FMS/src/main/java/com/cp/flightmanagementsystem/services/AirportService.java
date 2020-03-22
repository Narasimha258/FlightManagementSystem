package com.cp.flightmanagementsystem.services;

import java.util.List;

import com.cp.flightmanagementsystem.dto.Airport;

public interface AirportService {

	  
	 public List viewAirport() ;
	 
	 public List<Airport> viewAirport(String airportCode);
}
