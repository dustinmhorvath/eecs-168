package lab11;
import java.util.*;
import java.io.*;



public class Letter_Counter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		FileReader fstream;
		BufferedReader in;
		String filename = "";
		
		// Set some initial conditions for the variables that will hold the read values.
		int[] set = new int[26];
		int chars = 0;
		String line = null;
		boolean readSuccess;
		
		// Try getting filename and reading input from file.
		try{
			// Gets filepath input from user
			System.out.println("Enter a filename:");
			filename = input.next();
			
			
			fstream = new FileReader(filename);
			in = new BufferedReader(fstream);
			line = in.readLine();
			
			// Loop reads every line from the file
			while(line != null){
				// Nested for loop checks each character and counts each one it sees into the set[] array.
				for(int i = 0; i < line.length(); i++){
					for(int j = 0; j < 26; j++){
						if(line.toLowerCase().charAt(i) == j + 'a'){
							set[j]= set[j] + 1;
							chars++;
						}
					}
				}
				
				// Reads in the new line at the end of each loop.
				line = in.readLine();
			
			}
			
			
			readSuccess = true;
			in.close();
		}
		catch(Exception e){
			System.out.println("Reached Read Error: ");
			System.err.println("Err: " + e.getMessage());
			System.out.println("Aborting file write.");
			readSuccess = false;
		}// End of file reading block
		
		// Writes the output to file
		if(readSuccess == true){
			try{
				// Creatin' a file brah.
				FileWriter ostream = new FileWriter("/home/dhorvath/git/eecs168java/EECS168/src/lab11/Output");
				//FileWriter ostream = new FileWriter("C:/Users/Dustin/git/eecs168java/EECS168/src/lab11/Output");
				BufferedWriter out = new BufferedWriter(ostream);
				
				// Writes out each line with how many of each character from the set[] array.
				out.newLine();
				for(int i = 0; i < set.length; i++){
					out.write((char)(i + 'A') + ": " + set[i]);
					out.newLine();
				}
				
				System.out.println("Output.txt created.\n");
				out.close();
			}
			catch(Exception e){
				System.out.println("Encountered error while writing out.txt:");
				System.err.println("Error: " + e.getMessage());
				System.out.println();
			}
			
			// Outputs to the console.
			System.out.println("The file contains the following letters:");
			for(int i = 0; i < set.length; i++){
				System.out.println((char)(i + 65) + ": " + set[i]);
			}
			
			
			System.out.println("There are " + chars + " total characters.");
		} // End of file write block
		
		
		

		
	input.close();
	}

}
