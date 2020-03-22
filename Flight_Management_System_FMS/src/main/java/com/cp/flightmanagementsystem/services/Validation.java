package com.cp.flightmanagementsystem.services;

public class Validation {
	
	public static String namepattern="[A-Z][a-z]*";
	public static String phoneNumberpattern= "(0/91)?[7-9][0-9]{9}";
	public static String emailpattern= "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
	public static String passwordpattern= "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})";
	
	public static boolean validatename(String data, String pattern)
	{
		return data.matches(pattern);
	}
	
	public static boolean validatePhoneN(String data, String pattern)
	{
		return data.matches(pattern);
	}
	public static boolean validateEmail(String data, String pattern)
	{
		return data.matches(pattern);
	}
	public static boolean validatePassword(String data, String pattern)
	{
		return data.matches(pattern);
		
	}
	
}
