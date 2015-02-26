/*
 * Colosseum.java
 * Dustin Horvath
 * A simple game that has a user create two pokemon to fight against one another, this is
 * mostly for practice with classes and methods.
 */

package homework3;

public class Colosseum {

	
	public static void main(String[] args) {
		
		Pokemon one = new Pokemon();
		Pokemon two = new Pokemon();
		Dice d10 = new Dice(10);
		one.userBuild();
		two.userBuild();
		int round = 1;
		
		// Flip a coin to determine who go first. Boolean reduces messy if-statements.
		int coinToss = d10.roll();
		boolean decide = false;
		if(coinToss > 5){decide = true;}
		else{decide = false;}
		
		System.out.println("Player 1 will roll a D10, 6 or above to go first.");
		System.out.print("Player 1 rolls a " + coinToss + " and will attack ");
		if(decide){
			System.out.println("first.\n");
		}
		else{
			System.out.println("second.\n");
		}
		
		// Big attacking loop, 10 rounds or dead Pokemon.
		while(one.getHP() > 0 && two.getHP() > 0 && round < 11){
			System.out.println("Round " + round + "!");
			System.out.println();
			// Boolean 'decide' determines the order of
			// attacking in each round via this if/else.
				if(decide){
					if(!one.attack(two)){
						two.attack(one);
					}
				}
				else{
					if(!two.attack(one)){
						one.attack(two);
					}
				}
			System.out.println();
			round++;
		}
		
		// Outputs only if the round has been cranked all the way to 11.
		if(round > 10){
			System.out.println("Both fighters are still standing! It's a draw!");
		}
		
	}

}
