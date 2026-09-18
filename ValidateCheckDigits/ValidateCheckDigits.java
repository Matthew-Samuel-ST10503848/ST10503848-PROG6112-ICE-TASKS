/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.validatecheckdigits;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author matthewsamuel
 */
public class ValidateCheckDigits {

    public static void main(String[] args) 
    {
        try 
        {
            //Opens the input file
            Scanner inputFile = new Scanner(new File("accountNumbers.txt"));

            //Creates the output file
            PrintWriter outputFile = new PrintWriter("validAccounts.txt");

            //Reads each account number from the file
            while (inputFile.hasNextLine()) 
            {

                String accountNumber = inputFile.nextLine();

                //Adds the first five digits together
                int sum = 0;

                for (int i = 0; i < 5; i++) 
                {
                    int digit = Character.getNumericValue(accountNumber.charAt(i));
                    sum = sum + digit;
                }

                //Finds the remainder when the sum is divided by 10
                int remainder = sum % 10;

                //Gets the sixth digit
                int lastDigit = Character.getNumericValue(accountNumber.charAt(5));

                //Checks whether the remainder matches the last digit
                if (remainder == lastDigit) 
                {

                    System.out.println(accountNumber + " - VALID");

                    //Writes valid account numbers into the output file
                    outputFile.println(accountNumber);

                } 
                
                else 
                {

                    System.out.println(accountNumber + " - INVALID");
                }
            }

            //Closes both files
            inputFile.close();
            
            outputFile.close();

        } 
        
        catch (FileNotFoundException e) 
        {

            System.out.println("Error: File could not be found.");
        }
    }
}
