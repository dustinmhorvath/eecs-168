/*
 *  Pyramid.java
 *
 *  Created by Dustin Horvath
 *  Contact Email: DustinMHorvath@ku.edu
 *  Description: This program asks for an input value from the user to form the base of a pyramid. It then
 *  			 prints asterisks to the console from the top of the pyramid down until it prints the base
 *  			 last. The base is 'input' asterisks wide.
 *  Date: Feb 24, 2014
 *  
 */

package lab4;
import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		// Initialization
		Scanner input = new Scanner(System.in);
		int base = 0;
		boolean firstRun = true;
		
		// Gets input from user. Repeats with special output if input is negative.
		do{
			if(firstRun == false) {
				System.out.println("You must enter a positive value.");
			}
			System.out.print("Enter the number of asterisks for the base of the triangle: ");
			base = input.nextInt();
			firstRun = false;
		}while(base < 1);
		
		System.out.println();
		
		// Outputs the triangle.
		for(int i = 1; i <= base; i++) {
			for(int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		input.close(); // Closes the scanner.
	}

}
