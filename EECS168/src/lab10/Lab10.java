/*	
 * 	Lab10.java
 * 	Dustin Horvath
 * 	Description: Simple lab that demonstrates working with complex arrays.
 * 	4/14/14
 * 	
 */

package lab10;
import java.util.*;

public class Lab10 {

	public static void main(String[] args) {
		ArrayHelper helper = new ArrayHelper();
		int rows;
		int columns;
		Scanner input = new Scanner(System.in);
		
		// Get input from user, dimensions of array.
		System.out.print("How many rows?: ");
		rows = input.nextInt();
		System.out.print("How many columns?: ");
		columns = input.nextInt();
		
		// Get array values from user.
		int[][] array = new int[rows][columns];
		for(int i = 0; i < array.length; i++){
			for(int j = 0; j < array[i].length; j++){
				System.out.print("Enter a value for position (" + i + "," + j + "): ");
				array[i][j] = input.nextInt();
			}
		}
		
		// Print all of the things!
		helper.print2DArray(array);
		for(int i = 0; i < array.length; i++){
			System.out.println("row " + i + " sum= " + helper.arraySum(array[i]) + ", avg = " + helper.arrayAvg(array[i]));
		}
		System.out.println("The sum for the entire array is = " + helper.arraySum2D(array));
		System.out.println("The average for the entire array is = " + helper.arrayAvg2D(array));
		
		// Closes scanner.
		input.close();
	}

}
