package lab5;
import java.util.*;


public class MethodPractice {
	
	
	
	// Writing these methods first because that's how I roll
	public static int cuber(int tocube){
		int cube = tocube * tocube * tocube;
		return cube;
	}
	
	public static int chooseGreater(int a, int b){
		if (a < b) {
			return b;
		}
		else return a;
	}
	
	public static char firstChar(String s) {
		return s.charAt(0);
	}

	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int forCubing;
		int x;
		int y;
		String userGibberish;
		
		System.out.println("Input a number: ");
		forCubing = input.nextInt();
		System.out.println("The cube of " + forCubing + " is " + cuber(forCubing));

		System.out.println("\nInput two numbers:");
		x = input.nextInt();
		y = input.nextInt();
		System.out.println("The larger number is " + chooseGreater(x,y));

		System.out.println("\nInput a string:");
		userGibberish = input.next();
		System.out.println("The first letter of " + userGibberish + " is " + firstChar(userGibberish));
		
		
		input.close();
	}
	
	
	

}
