package main;

import java.util.*;

public class App {
	public static void main(String[] args) {
		
		// Game start messages
		System.out.println("You awake from a deep slumber.");
		System.out.println("Feeling disoriented, you look around, finding yourself in a deep fog which impairs your vision beyond a few metres ahead");
		System.out.println("Your precious belongings are nowhere to be found, but upon searching your pocket you find a note saying 'your fate is in");
		System.out.println("your hands now' and a magic compass with a spinning dial. You press a button on the side, the dial stops spinning.");
		
		Random randy = new Random();
		Compass c = new Compass();
		Scanner scan = new Scanner(System.in);
		Location loc = new Location();
		
		int xCo = randy.nextInt(10) - 5;
		int yCo = randy.nextInt(10) - 5;
		
		List<Integer> myLoc = Arrays.asList(0, 0);
		List<Integer> targLoc = Arrays.asList(xCo, yCo);
		
		while (Math.hypot(targLoc.get(0)-myLoc.get(0), targLoc.get(1)-myLoc.get(1)) != 0) {
			c.useCompass();
			System.out.println("Enter the direction in which you would like to move in the format 'x, y', positive x values taking you North" + ",");
			loc.move();
		}
		c.useCompass();
		
		scan.close();
	}

}
