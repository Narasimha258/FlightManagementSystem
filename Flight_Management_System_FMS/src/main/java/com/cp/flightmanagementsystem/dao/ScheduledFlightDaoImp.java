package com.cp.flightmanagementsystem.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.cp.flightmanagementsystem.dto.Airport;
import com.cp.flightmanagementsystem.dto.ScheduledFlight;
import com.cp.flightmanagementsystem.util.ScheduledFlightRepository;

public class ScheduledFlightDaoImp implements ScheduledFlightDao {

	
	ScheduledFlightRepository scheduleFlightRepo=new ScheduledFlightRepository();
	
	     
	
   public boolean  scheduleFlightDao(ScheduledFlight s ) 
   {                        //Schedules a flight along with its timings, locations and code.
    	   
    	   
    	    boolean check= scheduleFlightRepo.scheduledFlightArray.add(s);
    	     
    	     return check;
   }
       
       
   public List<ScheduledFlight> viewScheduledFlightsDao(Airport airport1,Airport airport2,String date) 
   {
       	
    	   boolean b=false;
    	   int i=0;
       	List<ScheduledFlight> flightList=scheduleFlightRepo.scheduledFlightArray;
       	
       	List<ScheduledFlight> flightBetween=new ArrayList<ScheduledFlight>();
       	
       	     for(ScheduledFlight obj:flightList) {
    	    	  
    	    	  if(date.contentEquals((obj.getSchedule().getArrivalDate().toString()))) {
    	    		  
    	    		        if(airport1.getAirportLocation().contentEquals(obj.getSchedule().getSourceAirport().getAirportLocation()))
    	    		        {
    	    		        	if(airport2.getAirportLocation().contentEquals(obj.getSchedule().getDestinationAirport().getAirportLocation()))
    	    		        	
    	    		        	{
    	    		        	       b=true;
    	    		        	       i=flightList.indexOf(obj);
    	    		        	}    
    	    		        	
    	    		        
    	    	  }
    	    	  }	                
       	     }  
    	      
              if(b==false) {
            	  
            	  return null;
              }
              else
            	  flightBetween.add(flightList.get(i));
                   return flightBetween;
      }
       
       
    public List<ScheduledFlight> viewScheduledFlightsDao2(String flightname)
    { 
    	   	 
      	    
    	      boolean b=false;
    	      int i = 0;
    	      List<ScheduledFlight> flightList=new ArrayList<ScheduledFlight>();
    	      List<ScheduledFlight> list=scheduleFlightRepo.scheduledFlightArray;
    	      
    	      for(ScheduledFlight s:list) {
    	    	  
    	    	          if(flightname.contentEquals(s.getFlight())) {
    	    	        	  
    	    	        	  b=true;
    	    	        	  i=list.indexOf(s);
    	    	        	    
    	    	          }
    	      }
    	      if(b==false) {
    	    	  
    	    	   return flightList=null;
    	      }
    	      else
     	  
     	         flightList.add(list.get(i));
    	         return flightList;
    	      	      
    	      
  }
       
        //return all the details of scheduled flights
       
    public List<ScheduledFlight> viewScheduleFlightDao()
    {  
    	   	 
    	   	 
    	   	  
     	      return scheduleFlightRepo.scheduledFlightArray;
    }
        
        
    public ScheduledFlight modifyScheduledFlightDao(String flightname )
    {
        	
    	  List<ScheduledFlight> flightList=scheduleFlightRepo.scheduledFlightArray;
    	  
    	   for(ScheduledFlight updateElement:flightList) {
    		   
    		         if(updateElement.getFlight().contentEquals(flightname)) {
    		        	 
    		        	    return updateElement;
    		         }
    	   }
    	   
		   return null;
        	  	 
          	 
   }
        
    public String deleteScheduledFlightDao(String flightname) 
    {
        	
        	
        	 
        	 List<ScheduledFlight> FlightList= scheduleFlightRepo.scheduledFlightArray;
        	
        	  Iterator<ScheduledFlight> iterator=FlightList.iterator();
        	  
        	  while(iterator.hasNext()) {
        		  
        		     if(flightname.equals(((ScheduledFlight) iterator.next()).getFlight()))
        		     {
        		    	 
        		    	 
        		    	 iterator.remove();
        		    	 
        		    	 return "deleted";
        		    	       
        		     }
        		     
        		      
        	  }
        	  return "Not deleted";
        	  
    }
    
       
}  

