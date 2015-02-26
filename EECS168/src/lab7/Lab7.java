/*
 *  lab7.java
 *
 *  Created by Dustin Horvath
 *  Contact Email: DustinMHorvath@gmail.com
 *  Description: Makes an array in the size that the user specifies, has them populate it, then gives some info back
 *  	about the data in the array.
 *  Date: 3/24/14
 * 
 */


package lab7;
import java.util.*;


public class Lab7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int arraySize = 0;
		int sum = 0;
		boolean firstRun = true;
		
		// This loop asks for input until they give an Int > 0.
		do {
			if(!firstRun) {
				System.out.println("You must enter a positive integer!");
			}
			System.out.print("Input an array size: ");
			arraySize = input.nextInt();
			firstRun = false;
		}while(arraySize < 1);
		
		// Defines array based on input.
		int[] myArray = new int[arraySize];
		
		
		// Get input for each index of array from user.
		System.out.println("Now please enter " + arraySize + " numbers");
		for(int i = 0; i < myArray.length; i++) {
		System.out.print("Input a number into your array: ");
		myArray[i] = input.nextInt();
		}

		// Outputs all the elements of the array.
		System.out.println("Here are all the numbers in your array:"); 
		for(int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		
		// Computes the sum and displays it.
		System.out.print("The sum of all the values is: ");
		for(int i = 0; i < myArray.length; i++) {
			sum += myArray[i];
		}
		System.out.println(sum);
			
		// Outputs the average, typecasts as a double for correct math.
		System.out.print("The average of all the values is: ");
		System.out.println((double)sum / myArray.length);
		
		// Sets the default min and max as the first element of the array.
		int min = myArray[0];
		int max = myArray[0];
		
		
		// This starts INTENTIONALLY on the second element of the array. We don't need
		// to waste a loop comparing it against itself. Honestly I expected an error if
		// you gave an array size of 1, but it's saved by 'i < myArray.length' being false.
		for(int i = 1; i < myArray.length; i++) {
			if(myArray[i] < min){
				min = myArray[i];
			}
			if(myArray[i] > max){
				max = myArray[i];
			}
			
		}
		
		// Outputs the min and max.
		System.out.print("The largest value is : " + max);
		System.out.println();
		System.out.print("The smallest value is : " + min);

		
		// Closes scanner.
		input.close();
	}

}
