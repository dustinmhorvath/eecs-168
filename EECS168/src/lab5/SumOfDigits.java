package lab5;
import java.util.*;


public class SumOfDigits {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		int checkout = 1;
		
		while(checkout == 1) {
		System.out.println("\nPlease enter a No:");
		number = input.nextInt();
		System.out.print("The sum of the digits is:" + addDigits(number));

		System.out.println("\n\nWant to try again?(y=1/n=0):");
		checkout = input.nextInt();
		}
		
		System.out.println("Thank you!");
		
		input.close();
	}
	
	public static int addDigits(int x) {
		int sum = 0;
		
		while(x != 0){
			sum += x % 10;
			x = x / 10;
		}
		return sum;
		
		
	}

}
