/*
 * TestEditor.java: Takes in a string, and has some tools for modifying that string.
 * Dustin Horvath
 * Last edited: Check last commit at https://github.com/dustinmhorvath/eecs168java.git
 */

package homework4;
import java.util.*;

public class TestEditor {

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String userInput = "";
		LineEditor editor = new LineEditor();
		int option = 0;
		
		System.out.println("+++++++ LineEditor starts... +++++++");
		System.out.println("* Write the text you want (maximum length: 100):");
		userInput = input.nextLine();
		
		while(userInput.length() > 100){
			System.out.println("* Operation failed: You exceeded the maximum length.");
			userInput = input.nextLine();
		}
		
		// Stores the user's input into the 'text' array.
		editor.storeStringAsArray(userInput);
		
		// While-try-catch block makes sure user gives valid integer input.
		while(option != 4){
			try{
				System.out.println("--------------------------------------");
				System.out.println();
				System.out.println("* Choose the menu:");
				System.out.println("1. Insert");
				System.out.println("2. Delete");
				System.out.println("3. Replace");
				System.out.println("4. Quit");
				option = input.nextInt();
				input.nextLine();
				System.out.println();
				
				if(option == 1){
					editor.insert_text(editor.getText());
				}
				else if(option == 2){
					editor.delete_text(editor.getText());
				}
				else if(option == 3){
					editor.replace_text(editor.getText());
				}
				// This prints the text unless the user is quitting.
				if(option != 4){
					System.out.println();
					editor.printText();
					System.out.println();
				}
			}
			catch(Exception e){
				System.out.println("Caught exception: " + e);
				System.out.println("Please give valid input.");
				
				input.nextLine();
				option = -1;
			}
		}
		
		System.out.println("Good bye!");
		
		input.close();
	}

}
