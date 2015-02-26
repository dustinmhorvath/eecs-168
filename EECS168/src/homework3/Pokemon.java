package homework3;
import java.util.*;

public class Pokemon {
	private int hp;
	private int attack_level;
	private int defense_level;
	private String name;
	private Dice d20;
	private Dice d6;
	public static int playerNumber = 0;
	
	public Pokemon(){
		d20 = new Dice(20);
		d6 = new Dice(6);
		hp = 0;
		attack_level = 0;
		defense_level = 0;
		name = "";
	}
	
	
	public boolean attack(Pokemon otherPokemon){
		
		// Set bonuses
		int attackBonus = d20.roll();
		int defenseBonus = d20.roll();
		int damage = 0;
		
		System.out.println(this.name + " is attacking " + otherPokemon.name);
		System.out.println(this.name + " rolls an attack bonus of " + attackBonus);
		System.out.println(otherPokemon.name + " rolls a defense bonus of " + defenseBonus);
		
		
		if(attack_level + attackBonus > otherPokemon.defense_level + defenseBonus){
			/* Switched this to an array for fun and for more practice. Using the more
			   complicated print loop allows modularization on the number of attacks.
			   I can add as many attacks as I want to the array without making any more
			   changes to the code. */
			int[] atk = {d6.roll(), d6.roll(), d6.roll()};
			damage = sumArray(atk);
			otherPokemon.hp = otherPokemon.hp - damage;
			System.out.println("The attack hits dealing " + atk.length + "-D6 damage!");
			System.out.print("The rolls are ");
			for(int i = 0; i < atk.length - 1; i++){
				System.out.print(atk[i] + ", ");
			}
			System.out.println("and " + atk[atk.length-1] + " totaling: " + damage + "!");
			
			
			
			
			if(otherPokemon.hp > 0){
				System.out.println(otherPokemon.name + " has " + otherPokemon.hp + " hit points left");
			}
			else{
				System.out.println(otherPokemon.name + " has been defeated!");
			}
		}
		else{
			System.out.println("The attack missed!");
		}
		
		
		// This returns true if otherPokemon.hp goes to zero. So when !attack, the other
		// pokemon gets to attack back in the same round.
		if(otherPokemon.hp <= 0){
			return true;
		}
		else return false;
	}
	
	
	public void userBuild(){
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		// Static int 'playerNumber' increments every time userBuild gets called.
		playerNumber++;
		// NAME the pokemon
		System.out.println("Player " + playerNumber + ", build your Pokemon!");
		System.out.println("=====================");
		System.out.print("Please name your pokemon: ");
		name = input.nextLine();
		System.out.println();
		
		// Get HP from user
		while(hp < 1 || hp > 50){
			System.out.print("How many hit points will it have? (1-50): ");
			hp = input.nextInt();
				if(hp < 0 || hp > 50){
					System.out.println("Sorry. HP must be between 1 and 50.");
				}
		}
		System.out.println();
		
		// Get attack_level from user
		System.out.println("Split fifty points between attack level and defense level");
		System.out.print("Enter your attack level (1-49): ");
		attack_level = input.nextInt();
		System.out.println();
		while(attack_level < 1 || attack_level > 49){
			System.out.print("Sorry. The attack level must be between 1 and 49: ");
			attack_level = input.nextInt();
			System.out.println();
		}
		
		// Get defense_level from user
		System.out.print("Enter your defense level (1-" + (50 - attack_level) + "): ");
		defense_level = input.nextInt();
		System.out.println();
		while(defense_level > (50 - attack_level) || defense_level < 1){
			System.out.print("Sorry. The defense level must be between 1 and " + (50-attack_level) + ": ");
			defense_level = input.nextInt();
			System.out.println();
		}
		
	}
	
	
	// SETS for private variables
	public void setHP(int health){
		hp = health;
	}
	public void setAttackLevel(int attack){
		attack_level = attack;
	}
	public void setDefenseLevel(int defense){
		defense_level = defense;
	}
	public void setName(String name){
		this.name = name;
	}
	
	// GETS for private variables
	public int getHP(){
		return hp;
	}
	public int getAttackLevel(){
		return attack_level;
	}
	public int getDefenseLevel(){
		return defense_level;
	}
	public String getName(){
		return name;
	}
	
	//Returns the sum of integers in an array.
	public int sumArray(int[] array){
		int total = 0;
		for(int i = 0; i < array.length; i++){
			total = total + array[i];
		}
		return total;
	}
}
