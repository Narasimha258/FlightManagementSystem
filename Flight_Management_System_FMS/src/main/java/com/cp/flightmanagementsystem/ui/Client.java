package com.cp.flightmanagementsystem.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.cp.flightmanagementsystem.dto.Airport;
import com.cp.flightmanagementsystem.dto.Schedule;
import com.cp.flightmanagementsystem.dto.ScheduledFlight;
import com.cp.flightmanagementsystem.dto.User;
import com.cp.flightmanagementsystem.exception.ScheduledFlightServiceException;
import com.cp.flightmanagementsystem.exception.UserListNotFoundException;
import com.cp.flightmanagementsystem.services.AirportService;
import com.cp.flightmanagementsystem.services.AirportServiceImp;
import com.cp.flightmanagementsystem.services.ScheduledFlightService;
import com.cp.flightmanagementsystem.services.ScheduledFlightServiceImp;
//import com.cp.flightmanagementsystem.services.FlightService;
import com.cp.flightmanagementsystem.services.UserService;
import com.cp.flightmanagementsystem.services.UserServiceImp;
import com.cp.flightmanagementsystem.services.Validation;
import com.cp.flightmanagementsystem.util.ScheduledFlightRepository;
import com.cp.flightmanagementsystem.util.UserRepository;

public class Client {
	public static void main(String args[]) throws UserListNotFoundException,ParseException
	{BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		//new UserRepository();
		UserService userservice=new UserServiceImp();
	    ScheduledFlightService scheduledFlightService=new ScheduledFlightServiceImp();
        AirportService airportService=new AirportServiceImp();
        ScheduledFlightRepository ScheduledRepo=new ScheduledFlightRepository();
		//PassengerService passengerservice=new PassengerService();
      //  FlightService flightservice=new FlightService();
        
        SimpleDateFormat sdf1 = new SimpleDateFormat("hh:mma"); 
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy"); 
        SimpleDateFormat sdf3=new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf4=new SimpleDateFormat("hh:mma");
        
		Scanner sc=new Scanner(System.in);
		while(true)
		{
	
			System.out.println("Enter 1 to add user:");
			System.out.println("Enter 2 to display user:");
			System.out.println("Enter 3 to display user by userId");
			System.out.println("Enter 4 to remove user by userId");
			System.out.println("Enter 5 to update the user");
			System.out.println("Enter 6 to Add Sheduled flight:");
			System.out.println("Enter 7 to search Flights:");
			System.out.println("Eneter 8 to exit");
			System.out.println("####################*************#########################");
			System.out.print("Please enter Your Choice:");
			int choice=sc.nextInt();
		
			switch(choice)
			{
			case 1:
				
				System.out.println("Enter the UserType:");
				String usertype=sc.next();
				System.out.println("Enter the UserId:");
				long id=sc.nextLong();
				//long newid=userservice.userid(id);
				String username;
				while(true) {
					System.out.println("Enter the New Name");
					try {
						String name= br.readLine();	
						boolean b= Validation.validatename(name, Validation.namepattern);
						if(b==true) {
						username=String.valueOf(name);
						break;
						}
						else
							System.out.println("Wrong name! Enter avalid name again!");
						} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
						}
					}
					
				String password;
				while(true) {
					System.out.println("Enter your Password");
					
					try {
						password = sc.next();
						boolean b3= Validation.validatePassword(password, Validation.passwordpattern);
						if(b3==true)
						{password=password;
							break;}
						else
							System.out.println("Enter Again");
						}
					catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				BigInteger big;
				while(true) {
					System.out.println("Enter Your Mobile Number");
					String MobileNumber;
					
					try {
						MobileNumber = sc.next();
						
						boolean b1= Validation.validatePhoneN(MobileNumber, Validation.phoneNumberpattern);
						if(b1==true)
						{ 
							big= new BigInteger(MobileNumber);
							big=big;
							break;
						}
						else
						{
							System.out.println("Enter Again");
						}
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				
				}
				
               String email;
				while(true) {
						System.out.println("Enter your EmailId");
						
						try {
							email = sc.next();
							boolean b2= Validation.validateEmail(email, Validation.emailpattern);
							if(b2==true)
							{
								email=email;
								break;
							}
							else
								System.out.println("Enter Again");
						}
						catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
				}
				
				
				
				User result=userservice.addUserService(new User(usertype,id,username,password,big,email));
				if(result!=null)
				{
					System.out.println("Added Sucessfully");
					System.out.println(result.getUserName()+" "+result.getUserPassword()+" "+result.getUserEmail()+" "+result.getUserPhone()+" "+result.getUserType());
				}
				else
				{
					System.out.println("User not added");
				}
				
				break;
			case 2:
			{
				List<User>userlist;
				userlist=userservice.viewUserService();
				int i=1;
				for(User x:userlist)
				{		
					
					System.out.println(i+" "+"UserName is:"+x.getUserName()+"\t"+" UserPassword is:"+x.getUserPassword());
					//System.out.println(x.getUserPassword());
					System.out.println("UserPhone is:"+x.getUserPhone()+"\t"+"UserType is:"+"\t"+x.getUserType());
					//System.out.println(x.getUserPhone());
					//System.out.println(x.getUserType());
					System.out.println("User Gmail is:"+x.getUserEmail()+"\t"+"UserId is:"+"\t"+x.getUserId());
					//System.out.println(x.getUserId());
					System.out.println("******************************");
					i++;
				}
		

			}
				break;
			case 3:
			{
				System.out.println("Enter the user id to know the details:");
				long userId=sc.nextLong();
				User obj=userservice.viewUserService(userId);
				if(obj!=null)
				{
					System.out.println(obj.getUserName()+" "+obj.getUserPassword()+" "+obj.getUserEmail()+" "+obj.getUserPhone()+" "+obj.getUserType());
				}
				else
				{
					System.out.println("Not found");
				}
				break;
			}
			case 4:
			{
				System.out.println("Enter the user id to know the details:");
				long userId1=sc.nextLong();
				User user=userservice.deleteUserService(userId1);
				if(user!=null)
				{
					System.out.println(user.getUserName()+" "+user.getUserPassword()+" "+user.getUserEmail()+" "+user.getUserPhone()+" "+user.getUserType());
					System.out.println("User Deleted");
				}
				else
				{
					System.out.println("User Not Deleted");
				}
				break;
			}
			case 5:
				
				System.out.println("Enter the id of a customer:");
				long useridd=sc.nextLong();
				User users=userservice.updateUserService(useridd);
				//List<User>service=userservice.viewUserService();
				
				   
					if(users.getUserId()==useridd)
					{
						System.out.println("Enter 1 to change Name");
						System.out.println("Enter 2 to change Password");
						System.out.println("Enter 3 to change Phone number");
						System.out.println("Enter 4 to change gmail");
						System.out.println("Please enter your choice:");
						int choice1=sc.nextInt();
						switch(choice1)
						{
						case 1:

							while(true) {
								System.out.println("Enter the new Name:");
								try {
									String name= br.readLine();	
									boolean b1= Validation.validatename(name, Validation.namepattern);
									if(b1==true) {
									username=String.valueOf(name);
									break;
									}
									else
										System.out.println("Wrong name! Enter avalid name again!");
									} catch (IOException e2) {
									// TODO Auto-generated catch block
									e2.printStackTrace();
									}
								}
							
							users.setUserName(username);
							//System.out.println("The Change name is:"+users.getUserName());
							System.out.println("Name changed sucessfully");
							break;
						case 2:
							System.out.println("Enter the CurrentPassword:");
							String currentpassword=sc.next();
							if(users.getUserPassword().equals(currentpassword))
							{while(true) {
								System.out.println("Enter New Password");
								
								try {
									password = sc.next();
									boolean b3= Validation.validatePassword(password, Validation.passwordpattern);
									if(b3==true)
									{password=password;
										break;}
									else
										System.out.println("Enter Again");
									}
								catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
								users.setUserPassword(password);
								System.out.println("Password changed Sucessfully");
							}
							else
							{
								System.out.println("Incorect Password please Enter valid password: ");
							}
							break;
						case 3:
							while(true) {
								System.out.println("Enter Your Mobile Number");
								String MobileNumber;
								
								try {
									MobileNumber = sc.next();
									
									boolean b1= Validation.validatePhoneN(MobileNumber, Validation.phoneNumberpattern);
									if(b1==true)
									{ 
										big= new BigInteger(MobileNumber);
										big=big;
										break;
									}
									else
									{
										System.out.println("Enter Again");
									}
									} catch (Exception e) {
										// TODO Auto-generated catch block
										e.printStackTrace();
									}
							
							}
							
							users.setUserPhone(big);
						    System.out.println("New Phone Number:"+users.getUserPassword()+" "+" is updated");
							break;
						case 4:
							while(true) {
								System.out.println("Enter your EmailId");
								
								try {
									email = sc.next();
									boolean b2= Validation.validateEmail(email, Validation.emailpattern);
									if(b2==true)
									{
										email=email;
										break;
									}
									else
										System.out.println("Enter Again");
								}
								catch (Exception e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
							}
							users.setUserEmail(email);
						System.out.println("New gamail is:"+users.getUserEmail()+" "+" is updated");
						
							break;
						
						
						}
					}
					
				break;

				
			case 6:
				System.out.print("Enter Flight Name: ");
	        	  
	        	  String flightname=sc.next();
	        	  
	        	  System.out.print("Enter Number of seats capacity:");
	        	  int cost=sc.nextInt();
	        	  System.out.print("Enter Source Airport Name:");
	        	  String sourceAirportName=sc.next();
	        	  System.out.print("Enter Source Airport Location:");
	        	  String sourceAirportLoc=sc.next();
	        	  System.out.print("Enter Source Airport Code:");
	        	  String sourceAirportCode=sc.next();
	        	  System.out.print("Enter Destination Airport Name:");
	        	  String destinationAirportName=sc.next();
	        	  System.out.print("Enter Destination Airport Location:");
	        	  String destinationAirportLoc=sc.next();
	        	  System.out.print("Enter Destination Airport Code:");
	        	  String destinationAirportCode=sc.next();
	        	 
	        	  System.out.print("Enter arrival Date :");
	        	  String arrivalDate=sc.next();
	        	  System.out.print("Enter arrival Time:");
	        	  String arrivalTime=sc.next();
	        	  Date ArrivalDate=sdf2.parse(arrivalDate);
	        	  Date ArrivalTime = sdf1.parse(arrivalTime);
	        	  
	        	  
	        	  System.out.print("Enter departure Date: ");
	        	  String departureDate=sc.next();
	        	  System.out.print("Enter departure Time:");
	        	  String departureTime=sc.next();
	        	  Date DepartureDate=sdf3.parse(departureDate);
	        	  Date DepartureTime = sdf4.parse(departureTime);
	        	  
	              
	        	  Airport airport1=new Airport(sourceAirportName,sourceAirportLoc,sourceAirportCode);
	        	  Airport airport2=new Airport(destinationAirportName,destinationAirportLoc,destinationAirportCode);
	        	  
	        	  
	        	  try {
	              if(scheduledFlightService.scheduleFlight(new ScheduledFlight(flightname,cost,new Schedule(airport1,airport2,ArrivalDate,DepartureDate,ArrivalTime,DepartureTime))))
	              {
	            	  System.out.println("Entered Successfully");
	              }
	        	  }
	        	  catch(ScheduledFlightServiceException e) {
	        		  
	        		  System.out.println(e);
	        	  }
	        	  break;
			case 7:
	        	System.out.println("Location From:");
	        	String From=sc.next();
	        	
	    	    Airport airport11=new Airport(null,From,null);
	    	    System.out.println("To:");
	    	    String To=sc.next();
	        	Airport airport21=new Airport(null,To,null);
	        	System.out.println("Enter the Specific date:");
	        	String date=sc.next();
	        	
	        	     
	        	List<ScheduledFlight> flightDemolist=scheduledFlightService.viewScheduledFlights(airport11, airport21, date);
	       
	           try {
	        	   if(flightDemolist!=null) {
	        	  for(ScheduledFlight obj:flightDemolist)
	        	  
	        		  {
	        		  
	        		     System.out.println("Data found");
	        		     System.out.println("****************************************************");
	        		     System.out.println(obj.getFlight());
	        		     System.out.println(sdf1.format(obj.getSchedule().getArrivalTime()));
	        		     System.out.println(sdf1.format(obj.getSchedule().getDepartureTime()));
	        		     System.out.println("****************************************************");
	        		     
	        		     
	        		     
	        	      }
	        	   }
	        	   else
	        		   throw new NullPointerException("No data found");
	        	     
	           }
	           catch(NullPointerException e) {
	        	    System.out.println(e.getMessage());
	           }
				break;
			case 8:System.exit(0);
		
			}
			
		}
		
		}
	
	}


