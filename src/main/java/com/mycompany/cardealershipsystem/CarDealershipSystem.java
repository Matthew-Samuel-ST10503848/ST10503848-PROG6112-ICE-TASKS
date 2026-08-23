/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cardealershipsystem;

/**
 *
 * @author matthewsamuel
 */
public class CarDealershipSystem {

    public static void main(String[] args) {
        
        //Creating the first SalesAgent object
        SalesAgent agent1 = new SalesAgent(
                "John Smith",
                "EMP001",
                15000,
                8,
                1500 
        );
        
        //Creating the second SalesAgent object
        SalesAgent agent2 = new SalesAgent(
                "Jane Doe",
                "EMP002",
                18000,
                5,
                1200 
        );
        
        //Display the reports
        agent1.printReport();
        agent2.printReport();
        
    }
}
