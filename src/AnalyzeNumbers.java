/*
 *  Description: Process input for array of given size and print count above the average
 *  Name: Rick
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class AnalyzeNumbers {

    public static void main(String[] args) {

        // Initialize scanner object.
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt for input of array size.
        System.out.print("Enter the number of items: ");

        // Process input of array length.
        int n = input.nextInt();

        // Declare doubles for array based on input and sum value.
        double[] numbers = new double[n];
        double sum = 0;

        // Diplay prompt for numbers to fill the array.
        System.out.print("Enter the numbers: ");

        // For loop to get input.
        for (int i = 0; i < n; i++) {

            // Process input to fill array.
            numbers[i] = input.nextDouble();

            // Add numbers to sum variable.
            sum += numbers[i];
        }

        // Determine average of the sum.
        double average = sum / n;

        // Declare variable for number of elements above average.
        int count = 0;

        // For loop to check through array and count integers above average.
        for (int i = 0; i < n; i++)
            if (numbers[i] > average)
                count++;

        // Print the average and number of items in array above the average.
           System.out.println("Average is " + average);
           System.out.println("Number of elements above the average is "
                   + count);
    }

}
