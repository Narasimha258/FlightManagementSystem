package com.cp.flightmanagementsystem.services;

import java.util.List;

import com.cp.flightmanagementsystem.dao.AirportDao;
import com.cp.flightmanagementsystem.dao.AirportDaoImp;
import com.cp.flightmanagementsystem.dto.Airport;

public class AirportServiceImp implements AirportService {
	AirportDao dao=new AirportDaoImp();
    public List viewAirport() {
  	  
  	    return dao.viewAirportDao();
    }
    public List<Airport> viewAirport(String airportCode ) {
  	  
  	      
  	  return dao.viewAirportDao(airportCode);
    }
	
}
