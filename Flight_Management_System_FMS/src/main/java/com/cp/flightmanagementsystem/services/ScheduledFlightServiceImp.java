package com.cp.flightmanagementsystem.services;

import java.util.List;

import com.cp.flightmanagementsystem.dao.ScheduledFlightDao;
import com.cp.flightmanagementsystem.dao.ScheduledFlightDaoImp;
import com.cp.flightmanagementsystem.dto.Airport;
import com.cp.flightmanagementsystem.dto.ScheduledFlight;
import com.cp.flightmanagementsystem.exception.ScheduledFlightServiceException;

public class ScheduledFlightServiceImp implements ScheduledFlightService{
	
	
    ScheduledFlightDao dao=new ScheduledFlightDaoImp();
    
  
     public boolean  scheduleFlight(ScheduledFlight s) throws ScheduledFlightServiceException 
        {
    	    if(dao.scheduleFlightDao(s)) {
    	    	return true;
    	    	}
  	    else
  	    	throw new ScheduledFlightServiceException("Not Added");
  		 
  	     }

   
     public List<ScheduledFlight> viewScheduledFlights2(String flightname)
     { 
    	 if(dao.viewScheduledFlightsDao2(flightname)!=null) {
    		 return dao.viewScheduledFlightsDao2(flightname);
    		 }
  	     else
  		   return null;
     }
     
   public List<ScheduledFlight> viewScheduleFlight()
   {  
	   if(dao.viewScheduleFlightDao().isEmpty()!=true){
		   return dao.viewScheduleFlightDao();
		   }
  	  else
  		  return null;
  	}
   
   public String deleteScheduledFlight(String flightname)
   {
	   return dao.deleteScheduledFlightDao(flightname);
    }
   
   public ScheduledFlight modifyScheduledFlight(String flightname) 
   {
	   ScheduledFlight updateScheduledFlight=dao.modifyScheduledFlightDao(flightname);
  	      return updateScheduledFlight;
    }
     
   public List<ScheduledFlight> viewScheduledFlights(Airport airport1,Airport airport2,String date)
   {
	   return dao.viewScheduledFlightsDao(airport1,airport2,date);
   } 
     
   
   
   
}       
