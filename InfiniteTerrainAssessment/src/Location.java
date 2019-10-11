package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Location {
	int x;
	int y;
	List<Integer> myLoc = Arrays.asList(0, 0);
	Scanner scan = new Scanner(System.in);
	
		public void move() {
		String a = scan.nextLine();
		String b = scan.nextLine();
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		if (x > 0) {
			System.out.println("You move " + x + " metres North");
		} else if (x < 0) {
			System.out.println("You move " + x + " metres South");
		} else {
			System.out.println("You decide against moving North or South");
		}
		myLoc.add(myLoc.get(0) + x);
		myLoc.add(myLoc.get(1) + y);
		myLoc.remove(0);
		myLoc.remove(1);
		if (y > 0) {
			System.out.println("You move " + x + " metres East");
		} else if (y < 0) {
			System.out.println("You move " + x + " metres West");
		} else {
			System.out.println("You decide against moving East or West");
		}
		System.out.println("You are now at: " + myLoc);
		}
}
