package com.cp.flightmanagementsystem.exception;

public class FlightListNotFoundException extends Exception{
	public FlightListNotFoundException()
	{
		System.out.println("FlightList is Empty");
	}
}
