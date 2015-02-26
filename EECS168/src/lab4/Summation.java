/*
 *  Summation.java
 *
 *  Created by Dustin Horvath
 *  Contact Email: DustinMHorvath@ku.edu
 *  Description: This program asks for input for a beginning and end value from the user,
 *  			 and then adds all of the odd integers from the beginning to end values
 *  			 together. They're summed into the int 'sum'.
 *  Date: Feb 24, 2014
 * 
 */

package lab4;
import java.util.Scanner;

public class Summation {

	public static void main(String[] args) {
		// Initialization
		int k;
		int n;
		int sum = 0;
		boolean invertedInput = false;
		boolean negativeInput = false;
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Welcome! This program calculates the summation of consecutive integers.");
		System.out.println();
		
		/*
		 * This block asks the user for input, and keeps asking if either value is negative.
		 */
		do{
			if(negativeInput == true) {
				System.out.println("Both values must be positive."); //Only displays if either last input was negative
			}
			negativeInput = false;
			invertedInput = false; //This line is a little redundant, but is necessary for the commented block below
			System.out.print("Please input a positive integer as the initial value: ");
			k = input.nextInt(); 
			System.out.print("Please input a positive integer as the end value: ");
			n = input.nextInt();
			if(k < 0 || n < 0) {
				negativeInput = true;
			}
			if(k > n) {
				invertedInput = true;
			}
		}while(negativeInput == true);
		
		System.out.println();
		
		while(invertedInput == true || n < 0) {  
			// If you use the block commented below, this whole loop is unnecessary.
			// I just added this to make my output look like the example.
			System.out.print("The end value is invalid. Please input a positive integer greater than initial value as the end value: ");
			n = input.nextInt();
			System.out.println();
			if(n > k) {
				invertedInput = false;
			}
		}
		
		
		for(int i = k; i <= n; i++) {
			sum+=i;
		}
		
		System.out.println("The summation is: " + sum + ".");

		
		input.close();
	}

}

/*
 * This is how I did it at first, all in one block, which worked much better, and could display errors for negative
 * cases and inverted cases at the same time. It fits all the exceptions in one block, so you don't need the redundancy of checking values
 * again down in the 'end value is invalid' section.
 * 
	do{
		if(negativeInput == true) {
			System.out.println("Both values must be positive."); //Only displays if either last input was negative
		}
		if(invertedInput == true){
			System.out.println("The initial value must be less than the end value."); //Only displays when their last input was inverted
		}
		negativeInput = false;
		invertedInput = false;
		System.out.print("Please input a positive integer as the initial value: ");
		k = input.nextInt(); 
		System.out.print("Please input a positive integer as the end value: ");
		n = input.nextInt();
		if(k < 0 || n < 0) {
			negativeInput = true;
		}
		if(k > n) {
			invertedInput = true;
		}
	}while(invertedInput == true|| negativeInput == true);
*/

