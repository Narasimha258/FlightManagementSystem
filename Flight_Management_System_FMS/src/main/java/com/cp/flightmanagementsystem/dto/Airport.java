package com.cp.flightmanagementsystem.dto;


public class Airport {
	String airportName;
	String airportLocation;
	String airportCode;
	public Airport(String airportName,String airportLocation,String airportCode)
	      {
		        this.airportCode=airportCode;
	        	this.airportLocation=airportLocation;
	        	this.airportName=airportName;
	      }
	      public String getAirportName() {
	  		return airportName;
	  	   }
	     public String getAirportLocation() {
		  		return airportLocation;
		  	}
		 public String getAirportCode() {
			  		return airportCode;
			  	}
		 public void setAirportName(String airportName) {
		 		this.airportName = airportName;
		 	}

	     public void setAirportLocation(String airportLocation) {
		 		this.airportLocation = airportLocation;
		 	}

		public void setAirportCode(String airportCode) {
		 		this.airportCode = airportCode;
		 	}
			  	
	  	
}

