/*
 *  SumOfOdd.java
 *
 *  Created by Dustin Horvath
 *  Contact Email: DustinMHorvath@ku.edu
 *  Description: This program asks the user for an end value for a loop, then adds up
 *  			 all the odd numbers from 1 to that end value.
 *  			 
 *  Date: Feb 24, 2014
 * 
 */

package lab4;
import java.util.Scanner;

public class SumOfOdd {

	public static void main(String[] args) {
		// Initialization
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int end = 1;
		
		// Asks the user for input, and continues to ask if they don't give positive input.
		do {
			if(end < 1) {
				System.out.println("You must enter a positive number!"); // Only asks after first run
			}
			System.out.print("Please input a positive integer as the end value: ");
			end = input.nextInt();
		}while(end < 1);
			
		// While loop sums the odd numbers from 1 to end
		int i = 1;
		while(i <= end) {
			sum += i;
			i+=2;
		}
		
		// Prints the sum out to the user, lookin all purdy
		System.out.print("The summation is: " + sum + ".");
		
		input.close(); // Closes the scanner
	}

}
