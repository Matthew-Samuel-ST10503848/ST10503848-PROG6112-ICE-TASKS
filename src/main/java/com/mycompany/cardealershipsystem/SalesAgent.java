/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardealershipsystem;

/**
 *
 * @author matthewsamuel
 */
public class SalesAgent extends Employee implements VehicleDealer {
    
    //Attributes that are specific to SalesAgent 
   private int vehiclesSold;
   private double commissionRate;
   
   //Constructor
   public SalesAgent(String name, String employeeID, double baseSalary, int vehiclesSold, double commissionRate)
   {
       
       //Calls the constructor from the Employee class
       super(name, employeeID, baseSalary);
       
       //Assigns values to the SalesAgent attritbutes
       this.vehiclesSold = vehiclesSold;
       this.commissionRate = commissionRate;
   }
   
   //Calculates the commission earned by the agent
   @Override
   public double calculateCommission() 
   {
       return vehiclesSold * commissionRate;
   }
   
   //Implements the method from the VehicleDealer interface
   @Override
   public double generateQuote()
   {
       return calculateCommission();
   }
   
   //Displays the agent's details and earnings
   public void printReport()
   {
       //Calculates the commission earned
       double commission = calculateCommission();
       
       //Calculates the total earnings
       double totalEarnings = baseSalary + commission;
       
       System.out.println("-----------------------------------");
       System.out.println("CAR DEALERSHIP AGENT SALES REPORT");
       System.out.println("-----------------------------------");
       
       System.out.println("Agent Name: " + name);
       System.out.println("Employee ID: " + employeeID);
       System.out.println("Base Salary: R" + baseSalary);
       System.out.println("Vehicles Sold: " + vehiclesSold);
       System.out.println("Commission Earned: R" + commission);
       System.out.println("Total Earnings: R" + totalEarnings);
       
       //Checks if the commission is more than R10 000
       if (commission > 10000)
       {
           System.out.println("Top Seller!");
       }
       
       System.out.println("----------------------------------");
       System.out.println();
   }
   
   
    
}
