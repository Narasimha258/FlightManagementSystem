package com.cp.flightmanagementsystem.dao;

import java.util.ArrayList;
import java.util.List;

import com.cp.flightmanagementsystem.dto.Airport;
import com.cp.flightmanagementsystem.util.AirportRepository;
import com.cp.flightmanagementsystem.util.ScheduledFlightRepository;

public class AirportDaoImp implements AirportDao{

	static AirportRepository airportRepository=new AirportRepository();
	ScheduledFlightRepository scheduledFlightRepository=new ScheduledFlightRepository();
	
	 
	
	 public ArrayList<Airport> viewAirportDao() {
		 
	
   	  
 	      return airportRepository.getAirportArray();  
      }
     
	  public List<Airport> viewAirportDao(String airportCode){
		  
		      
		  List<Airport> airportCodeList=new ArrayList<Airport>();
	      
	      for(Airport element:airportRepository.airportData) {
	      
	      if(airportCode==element.getAirportCode()) {
	    	  
	    	    airportCodeList.add(element);
	      }
	          	  
	      }
	      return airportCodeList; 
		         
	  }
	  
	  
     
}