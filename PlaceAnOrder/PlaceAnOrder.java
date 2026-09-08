/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.placeanorder;
import java.util.Scanner;

/**
 *
 * @author matthewsamuel
 */
public class PlaceAnOrder {

    public static void main(String[] args) 
    {
        
        Scanner input = new Scanner(System.in);
        
        //Arrays for valid item numbers and prices
        int[] itemNumbers = {111, 222, 333, 444};
        
        double[] prices = {0.89, 1.47, 2.43, 5.99};
        
        
        try
        {
            //Ask user for item number
            System.out.println("Please Enter Item Number: ");
            String itemInput = input.nextLine();
            
            int itemNumber;
            
            try
            {
                itemNumber = Integer.parseInt(itemInput);
                
            } 
            
            catch (NumberFormatException e)
            {
                throw new OrderException(OrderMessages.messages[0]);
            }
            
            //Check if number is too low
            if (itemNumber < 0) 
            {
                throw new OrderException(OrderMessages.messages[1]);
            }
            
            //Check if number is too high
            if(itemNumber > 9999)
            {
                throw new OrderException(OrderMessages.messages[2]);
            }
            
            //Prompt user for quantity
            System.out.println("Please Enter Quantity: ");
            String quantityInput = input.nextLine();
            
            int quantity;
            
            try
            {
                quantity = Integer.parseInt(quantityInput);
            }
            
            catch (NumberFormatException e)
            {
                 throw new OrderException(OrderMessages.messages[3]);      
            }
            
            //Check if quantity is too low
            if(quantity < 1)
            {
              throw new OrderException(OrderMessages.messages[4]);  
            }
            
            //Check if quantity is too high
            if(quantity > 12)
            {
                throw new OrderException(OrderMessages.messages[5]);
            }
            
            //Find the item in the inventory
            int itemIndex = -1;
            
            for (int i = 0; i < itemNumbers.length; i++)
            {
                if(itemNumber == itemNumbers[i])
                {
                    itemIndex = i;
                }
            }
            
            //Check if the item does not exist
            if(itemIndex == -1)
            {
                throw new OrderException(OrderMessages.messages[6]);
            }
            
            //Calculate total
            double total = quantity * prices[itemIndex];
            
            //Display result
            System.out.println("\nOrder Successful!");
            System.out.println("Item Number: " + itemNumber);
            System.out.println("Quantity: " + quantity);
            System.out.printf("Total Amount Due: $%.2f%n", total);
        }
        
        catch (OrderException e)
        {
            System.out.println("\nERROR: " + e.getMessage());
        }
        
        input.close();
    }
}
