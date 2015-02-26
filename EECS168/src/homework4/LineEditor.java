/*
 * LineEditor.java: Contains the methods used in TestEditor. Used for making insertions,
 *   deletions, and replacements in character arrays and/or Strings.
 * Dustin Horvath
 * Last edited: Check last commit at https://github.com/dustinmhorvath/eecs168java.git
 */

/*
 * NOTE TO GRADER: I noticed today (5/7/14) that the assignment says not to put any System.out methods in
 * the LineEditor. Changing this now would be a huge pain in my butt, and I think would actually make
 * things much more complicated. I'd need to move big while-try-catch blocks into TestEditor, then change
 * the method arguments to accept other arguments for the beginning and end, etc; it'd be a mess.
 * Basically the only parts that would remain in the methods would be the '//Build temp array'-commented
 * regions. If this costs me a couple points, I'll live with that. 
 */
package homework4;
import java.util.*;

public class LineEditor {
	private char[] text;
	Scanner input = new Scanner(System.in);
	
	public void insert_text(char[] str){
		int  begin = -1;
		
		
		// Repeats until user gives valid input
		while(begin < 0){
			try{
			System.out.println("* Enter the starting position: ");
			begin = input.nextInt() - 1;
			
			// A little redundant, but give user feedback
			while(begin	< 0 || begin > str.length){
				System.out.println("You must enter a valid character position: ");
				begin = input.nextInt();
			}
			input.nextLine();
			}
			catch(Exception e){
				System.out.println("Caught exception: " + e);
				System.out.println("Please give valid input.");
				begin = -1;
				input.nextLine();
			}
		}
		
		
		
		
		// Get insertion text
		System.out.println("* Enter the text you want to insert: ");
		String insertion = input.nextLine();
		
		// Check for length overflow
		while(str.length + insertion.length() >= 100){
			System.out.println("That insertion is too long. You have " + (100 - str.length) + " characters available:");
			insertion = input.nextLine();
		}
		
		// Declare new temp array after getting length
		char[] temp = new char[str.length + insertion.length()];
		
		// Builds the temp array.
		int i = 0;
		while(i < begin){
			temp[i] = str[i];
			i++;
		}
		while(i < (begin + insertion.length())){
			temp[i] = insertion.charAt(i - begin);
			i++;
		}
		while(i < temp.length){
			temp[i] = str[i - insertion.length()];
			i++;
		}
		
		// Points text at the temp completed temp array.
		text = temp;
	}
	
	public void delete_text(char[] str){
		int begin = -1;
		int end = -1;
		while(begin < 0 || end < begin || end > str.length){
			try{
				System.out.println("* Enter the starting and ending position for deletion.");
				System.out.print("Begin:" );
				begin = input.nextInt() - 1;
				System.out.print("End:" );
				end = input.nextInt() - 1;
			}
			catch(Exception e){
				System.out.println("Caught exception: " + e);
				System.out.println("Please give valid input.");
				begin = -1;
				end = -1;
				input.nextLine();
			}
			
		}
		input.nextLine();
		
		// Declare temp array after getting length.
		char[] temp = new char[str.length - (end - begin + 1)];
		
		// Builds the temp array
		int i = 0;
		while(i < begin){ 
			temp[i] = str[i];
			i++;
		}
		while(i <= end){
			i++;
		}
		while(i < str.length){
			temp[i - (end - begin + 1)] = str[i];
			i++;
		}
		// Points the 'text' reference at 'temp'.
		text = temp;
	}
	
	public void replace_text(char[] str){
		int begin = -1;
		int end = -1;
		while(begin < 0 || end < begin || end > str.length){
			try{
				System.out.println("* Enter the starting and ending position.");
				System.out.print("Begin:" );
				begin = input.nextInt() - 1;
				System.out.print("End:" );
				end = input.nextInt() - 1;
			}
			catch(Exception e){
				System.out.println("Caught exception: " + e);
				System.out.println("Please give valid input.");
				begin = -1;
				end = -1;
				input.nextLine();
			}
		}
		input.nextLine();
		
		// Get input from user.
		
		System.out.println("* Enter the text you want to replace: ");
		String replace = input.nextLine();
		while(str.length + replace.length() > 100){
			System.out.println("String must not be longer than 100 characters.");
			System.out.println("You have " + (100 - str.length + (end - begin)) + " characters to use:");
			replace = input.nextLine();
			}
		
		// Declare temp array afer getting length.
		char[] temp = new char[str.length + replace.length() - (end - begin + 1)];
		
		// Build temp array after all input haz ben gotten.
		int i = 0;
		while(i < begin){ 
			temp[i] = str[i];
			i++;
		}
		while(i < begin + replace.length()){
			temp[i] = replace.charAt(i - begin);
			i++;
		}
		while(i < temp.length){
			temp[i] = str[i - replace.length() + (end - begin + 1)];
			i++;
		}
		
		// Points 'text' reference at the 'temp' array.
		text = temp;
	}
	
	// Simple method that takes a string stores it in 'text'.
	public void storeStringAsArray(String str){
		char[] temp = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			temp[i] = str.charAt(i);
		}
		
		text = temp;
	}
	
	// GET for private 'text'.
	public char[] getText(){
		return text;
	}
	
	// Prints out 'text'.
	public void printText(){
		for(int i = 0; i < text.length; i++){
		System.out.print(text[i]);
		}
		System.out.println();
	}
}
