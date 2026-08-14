/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flowershop;
import java.util.Scanner;

/**
 *
 * @author matthewsamuel
 */
public class FlowerShop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Initialising and declaring a 7x3 sized 2D array 
        int[][] arrSales = new int[7][3];

        // Storing the sales data
        salesData(arrSales, input);

        // Displaying the sales table
        displayData(arrSales);

        // Calculating totals for each day
        rowSum(arrSales);

        // Calculating totals for each bouquet type
        colSum(arrSales);

        input.close();
    }

    private static void salesData(int[][] arrSales, Scanner input) {
        
        //Parallel 1D Array
        String[] days = 
        {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        String[] bouquets = 
        {
            "Roses",
            "Tulips",
            "Lilies"
        };

        // Read sales data
        System.out.println("FLOWER SHOP WEEKLY SALES DATA");
        System.out.println("---------------------------------------");

        for (int r = 0; r < arrSales.length; r++) 
        {

            System.out.println("\n" + days[r]);

            for (int c = 0; c < arrSales[r].length; c++) 
            {

                System.out.print("Enter sales for " + bouquets[c] + ": ");
                arrSales[r][c] = input.nextInt();
            }
        }
    }

    private static void displayData(int[][] arrSales) {

        //Parallel 1D Array
        String[] days = 
        {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        String[] bouquets = 
        {
            "Roses",
            "Tulips",
            "Lilies"
        };

        System.out.println("\n\nFLOWER SHOP WEEKLY SALES REPORT");
        System.out.println("===============================================================");

        
        
        System.out.printf(
                "%-12s %-10s %-10s %-10s %-10s%n",
                "Day", "Roses", "Tulips", "Lilies", "Total"
        );

        System.out.println("------------------------------------------------------------");

        for (int r = 0; r < arrSales.length; r++) {

            int dailyTotal = 0;

            
            System.out.printf("%-12s", days[r]);

            // Add the sales for each bouquet type 
            for (int c = 0; c < arrSales[r].length; c++) {

                
                System.out.printf(" %-10d", arrSales[r][c]);

                dailyTotal += arrSales[r][c];
            }

            
            System.out.printf(" %-10d%n", dailyTotal);
        }

        System.out.println("------------------------------------------------------------");
    }


    private static void rowSum(int[][] arrSales) {
        
        //Parallel 1D Array
        String[] days = 
        {
            "Monday",
            "Tuesday",
            "Wednesday",
            "Thursday",
            "Friday",
            "Saturday",
            "Sunday"
        };

        // Calculate row sums (daily totals)
        System.out.println("\nTOTAL SALES FOR EACH DAY");
        System.out.println("---------------------------------------");

        int grandTotal = 0;

        for (int r = 0; r < arrSales.length; r++) 
        {

            int rowSum = 0;

            for (int c = 0; c < arrSales[r].length; c++) 
            {

                rowSum += arrSales[r][c];
            }

            System.out.println("Total sales for " + days[r] + ": " + rowSum);

            grandTotal += rowSum;
        }

        // Display overall total
        System.out.println("\nOverall total sales for the week: R" + grandTotal);
    }

    private static void colSum(int[][] arrSales) {
        
        //Parallel 1D Array
        String[] bouquets = 
        {
            "Roses",
            "Tulips",
            "Lilies"
        };

        // Calculate column sums (bouquet totals)
        System.out.println("\nTOTAL SALES FOR EACH BOUQUET TYPE");
        System.out.println("---------------------------------------");

        for (int c = 0; c < arrSales[0].length; c++) 
        {

            int colSum = 0;

            for (int r = 0; r < arrSales.length; r++) 
            {

                colSum += arrSales[r][c];
            }

            System.out.println("Total sales for " + bouquets[c] + ": " + colSum);
        }
    }
}
