package com.cp.flightmanagementsystem.util;

import java.util.ArrayList;

import com.cp.flightmanagementsystem.dto.Airport;

public class AirportRepository {
	public static ArrayList<Airport> airportData=new ArrayList<Airport>();
    
    
    public void add() {
    	
    	     airportData.add(new Airport("vizag_airport","vizag","VTZ"));
    }
    
    
    public ArrayList<Airport> getAirportArray() {
    	
    	add();
        return airportData;
    }

    public void setAirportArray(ArrayList<Airport> airportData) {
       
    	this.airportData=airportData;
    	
    }

}
