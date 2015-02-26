/*
File Name: SquareMatrix.java 
	Author: Dustin Horvath 
    KUID: 2729265
	Email Address: DustinMHorvath@gmail.com 
	Homework Assignment Number: 2 
	Description: This program takes an input from the user for the side length
				of a grid. It this prints a wrapped series of numbers within that
				grid, and then an inverted wrapped series.
	Last Changed: 3/6/14 
	NOTE: This program has been written to fulfill specific requirements and
				esthetics. It has not necessarily been written to be the most
				succinct or functional.
*/

package homework2;
import java.util.Scanner;

public class SquareMatrix {
	
	public static void main(String[] args) {
		// Declaration
		Scanner input = new Scanner(System.in);
		int side;
		int number = 0;
		boolean firstRun = true;
		
		// Get input from user for grid size
		do{
		if(!firstRun){
			System.out.println("You must enter a postive integer.");
		}
		System.out.println("Enter the Size of the Square Matrix:");
		side = input.nextInt();
		firstRun = false;
		}while(side < 1);
	
		
		// Prints a wrapped series of numbers within the grid size. It will
		// always end on a perfect square i.e. 9, 16, 25..
		System.out.println("Square Matrix:");
		for(int i = 0; i < side; i++){
			for(int j = 0; j < side; j++){
				number++;
				System.out.print(number + " ");
			}
			System.out.println();
		}
		
		/*	Prints the transposed matrix. This one doesn't use a counter, but
		 * 	rather computes the necessary loop value from its coordinates
		 * 	in the 2 nested loops, 'i' and 'j'
		 */	 
		System.out.println("Transpose:");
		for(int i = 1; i <= side; i++){
			for(int j = 1; j <= side; j++){
				System.out.print(i + j*3 - 3 + " "); // This took some thought
			}
			System.out.println();
		}
		
	
		input.close(); // Scanner close prevents resource leak
	}

}
