/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cardealershipsystem;

/**
 *
 * @author matthewsamuel
 */
public abstract class Employee {
    
    //Attributes
    protected String name;
    protected String employeeID;
    protected double baseSalary;
    
    //Constructor
    public Employee(String name, String employeeID, double baseSalary)
    {
        this.name = name;
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
                
    }
    
    //Abstract method that must be implemented by a child class
    public abstract double calculateCommission();   
    
}
