package homework1;
import java.util.*;

public class PrintCostCalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int pages;
		String type;
		int color;
		int usageperpage;
		double inkusage;
		char printtype;
		double costperpage;
		double totalcost;
		double colormodifier;
		
		System.out.println("--- Price Estimator Program ---");
		System.out.print("Enter Number of Pages (digits only): ");
		pages = input.nextInt(); // Gets number of pages from user
		System.out.println();
		if(pages < 0){
			pages = pages * -1;
		}
		
		System.out.println("---- Select a Print Type ----");
		System.out.println("Enter T or t for Text");
		System.out.println("Enter I or i for Image");
		System.out.println("Enter C or c for Compressed Text");
		System.out.println("Enter S or s for statement");
		System.out.println("---------------------------");
		System.out.print("Enter Print Type: "); //Gets print type from user
		type = input.next();
		System.out.println();
		
		System.out.println("--- Select a Print Color ---");
		System.out.println("Enter 0 for Grayscale");
		System.out.println("Enter 1 for Color");
		System.out.println("-----------------------------");
		System.out.print("Enter Print Color: "); //Gets b/w or color descriptor from user
		color = input.nextInt();
		System.out.println("-----------------------------\n");
		
		
		//this section changes the string 'type' into a char, and uses that to set the usage(# of dots) per page
		printtype = type.charAt(0);
		if(printtype == 'I' || printtype == 'i'){
			usageperpage = 10000;
		}
		else if(printtype == 'C' || printtype == 'c'){
			usageperpage = 15000;
		}
		else if(printtype == 'S' || printtype == 's'){
			usageperpage = 7000;
		}
		else{
			usageperpage = 5000;
		}
		inkusage = pages * usageperpage;
		
		
		//colormodifier is a multiplier that accounts for cost of black and white vs color. It defaults to b/w
		if(color == 1){
			colormodifier = .05/1000;
		}
		else{
			colormodifier = .01/1000;
		}
		
		
		costperpage = usageperpage * colormodifier;
		totalcost = costperpage * pages;
		
		System.out.println("--- Cost Estimate ---");
		System.out.println("Ink Usage Per Page: " + usageperpage);
		System.out.printf("Total Ink Usage: %.2e\n\n", inkusage);

		System.out.printf("Estimated Cost Per Page: $%.4f\n", costperpage);
		System.out.printf("Total Cost: $%.2f", totalcost);
		
		input.close();
	}

}
