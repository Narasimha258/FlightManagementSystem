package com.cp.flightmanagementsystem.dto;

import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Schedule   {
	
	
	        Airport sourceAirport;
	        Airport destinationAirport;
	        Date arrivalTime;
	        Date departureTime;
	        Date arrivalDate;
	        Date departureDate;
	        
	       
	        
	        public Schedule(Airport sourceAirport,Airport destinationAirport,Date arrivalDate,Date departureDate, Date arrivalTime,Date departureTime) {
	        	
	        	
	        	 this.arrivalDate=arrivalDate;
	        	 this.departureDate=departureDate; 
	        	 this.departureTime=departureTime;
	        	 this.arrivalTime=arrivalTime;
	        	 this.sourceAirport=sourceAirport;
	        	 this.destinationAirport=destinationAirport;
	        }
	        
	        public Date getArrivalDate() {
				return arrivalDate;
			}

			public void setArrivalDate(Date arrivalDate) {
				this.arrivalDate = arrivalDate;
			}

			public Date getDepartureDate() {
				return departureDate;
			}

			public void setDepartureDate(Date departureDate) {
				this.departureDate = departureDate;
			}

			

			public void setArrivalTime(Date arrivalTime) {
				this.arrivalTime = arrivalTime;
			}

			public void setDepartureTime(Date departureTime) {
				this.departureTime = departureTime;
			}

			public Date getArrivalTime() {
	        	
	        	 return arrivalTime;
	        }
	        public Date getDepartureTime() {
	        	
	        	  return departureTime;
	        }

			public Airport getSourceAirport() {
				return sourceAirport;
			}

			public void setSourceAirport(Airport sourceAirport) {
				this.sourceAirport = sourceAirport;
			}

			public Airport getDestinationAirport() {
				return destinationAirport;
			}

			public void setDestinationAirport(Airport destinationAirport) {
				this.destinationAirport = destinationAirport;
			}

			
			
	        
}
