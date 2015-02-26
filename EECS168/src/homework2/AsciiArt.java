/*
File Name: AsciiArt.java 
	Author: Dustin Horvath 
    KUID: 2729265
	Email Address: DustinMHorvath@gmail.com 
	Homework Assignment Number: 2 
	Description: This program asks the user for the size of a grid, and prints either
				a grid, a checkerboard, or an inverse identity matrix of asterisks
	Last Changed: 3/6/14 
	NOTE: This program has been written to fulfill specific requirements and
				esthetics. It has not necessarily been written to be the most
				succinct or functional.
*/

package homework2;
import java.util.*; //Eclipse imports this automatically, but not sure how that plays out in other IDEs

public class AsciiArt {
	
	// A dedicated isEven method tidies up some of the code in a later block.
	public static boolean isEven(int x){
		if(x % 2 == 0){
			return true;
		}
		else return false;
	}


	public static void main(String[] args) {
		// Declaration
		Scanner input = new Scanner(System.in);
		int type;
		int side;
		
		// Have the user select what 'type' of grid to draw
		System.out.println("Choose one of the following patterns by typing the corresponding number:");
		System.out.println("1) Grid"); 
		System.out.println("2) Checker Board");
		System.out.println("3) Reverse Diagonal");
		type = input.nextInt();
		System.out.println();
		
		// Simple case prints a '* ' for every loop cycle
		if(type == 1){
			System.out.println("Input a size (must be larger than 1):");
			side = input.nextInt();
			System.out.println();
			if(side > 1){
				for(int i = 0; i < side; i++){
					System.out.print(i + " ");
					for(int j = 0; j < side; j++){
						System.out.print("* ");
					}
					System.out.println();
				}
			}
			else{
				System.out.println("Error.");
			}
			
		}
		
		// Checkerboard case prints '* ' only when both grid 
		// coordinates are even or odd
		else if(type == 2){
			System.out.println("Input a size (must be larger than 1):");
			side = input.nextInt();
			System.out.println();
			if(side > 1){
				for(int i = 0; i < side; i++){
					System.out.print(i + " ");
					for(int j = 0; j < side; j++){
						if(isEven(i) && isEven(j)){
							System.out.print("* ");
						}
						else if(!isEven(i) && !isEven(j)){
							System.out.print("* ");
						}
						else{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}
			else{
				System.out.println("Error.");
			}
		}
		
		
		// Inverted diagonal prints '* ' only when i+j is one less
		// than the side length
		else if(type == 3){
			System.out.println("Input a size (must be larger than 1):");
			side = input.nextInt();
			System.out.println();
			if(side > 1){
				for(int i = 0; i < side; i++){
					System.out.print(i + " ");
					for(int j = 0; j < side; j++){
						if(i + j + 1 == side){
							System.out.print("* ");
						}
						else{
							System.out.print("  ");
						}
					}
					System.out.println();
				}
			}
			else{
				System.out.println("Error.");
			}
			
		}
		
		// This gives an error if the user selects a type other than 1, 2, or 3
		else{
			System.out.println("Error.");
		}
	
		input.close(); // Closes the scanner, prevents resource leak
	}

}
