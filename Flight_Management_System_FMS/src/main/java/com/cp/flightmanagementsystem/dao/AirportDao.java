package com.cp.flightmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.cp.flightmanagementsystem.dto.Airport;

public interface AirportDao {
	public ArrayList<Airport> viewAirportDao();
	  
	  public List<Airport> viewAirportDao(String airportCode);

}
