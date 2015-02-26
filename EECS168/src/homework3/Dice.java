package homework3;
import java.util.Random;

public class Dice {
	private int numsides;
	Random myRand = new Random();
	
	public Dice(int sides){
		numsides = sides;
	}
	
	public int roll(){
		return myRand.nextInt(numsides) + 1;
	}
}
