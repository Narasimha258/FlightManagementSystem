package com.cp.flightmanagementsystem.util;

import java.util.ArrayList;

import com.cp.flightmanagementsystem.dto.ScheduledFlight;

public class ScheduledFlightRepository {
public static ArrayList<ScheduledFlight> scheduledFlightArray=new ArrayList<ScheduledFlight>();
	
    
    public ArrayList<ScheduledFlight> getAirportArray() {
    	
        return scheduledFlightArray;
    }

    public void setAirportArray(ArrayList<ScheduledFlight> scheduledFlight) {
       
    	this.scheduledFlightArray=scheduledFlight;
    	
    }

}
