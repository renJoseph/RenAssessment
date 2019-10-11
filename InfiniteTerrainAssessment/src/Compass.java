package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Compass {
	Random randy = new Random();
	int xCo = randy.nextInt(10) - 5 ;
	int yCo = randy.nextInt(10) - 5 ;
	
	List<Integer> myLoc = Arrays.asList(0, 0);
	List<Integer> targLoc = Arrays.asList(xCo, yCo);
	List<Integer> locDiff = Arrays.asList(targLoc.get(0)-myLoc.get(0), targLoc.get(1)-myLoc.get(1));
	
	public void useCompass(){
		if ((locDiff.get(0) > 0) && (locDiff.get(1) > 0)) {
			System.out.println("The compass is pointing North-East, and indicates you are " + 
		Math.hypot(Math.abs(locDiff.get(0)),Math.abs(locDiff.get(1))) + " metres away from safety");
		} else if ((locDiff.get(0) < 0) && (locDiff.get(1) > 0)) {
			System.out.println("The compass is pointing South-East, and indicates you are " + 
		Math.hypot(Math.abs(locDiff.get(0)),Math.abs(locDiff.get(1))) + " metres away from safety");
		} else if ((locDiff.get(0) < 0) && (locDiff.get(1) < 0)) {
			System.out.println("The compass is pointing South-West, and indicates you are " + 
		Math.hypot(Math.abs(locDiff.get(0)),Math.abs(locDiff.get(1))) + " metres away from safety");
		} else if ((locDiff.get(0) > 0) && (locDiff.get(1) < 0)) {
			System.out.println("The compass is pointing South-West, and indicates you are " + 
		Math.hypot(Math.abs(locDiff.get(0)),Math.abs(locDiff.get(1))) + " metres away from safety");
		} else if ((locDiff.get(0) > 0) && (locDiff.get(1) == 0)) {
			System.out.println("The compass points North, and indicates you are " + Math.abs(locDiff.get(0)) + 
			"metres away from safety");
		} else if ((locDiff.get(0) < 0) && (locDiff.get(1) == 0)) {
			System.out.println("The compass points South, and indicates you are " + Math.abs(locDiff.get(0)) + 
			"metres away from safety");
		} else if ((locDiff.get(0) == 0) && (locDiff.get(1) > 0)) {
			System.out.println("The compass points East, and indicates you are " + Math.abs(locDiff.get(0)) + 
			"metres away from safety");
		} else if ((locDiff.get(0) == 0) && (locDiff.get(1) < 0)) {
			System.out.println("The compass points East, and indicates you are " + Math.abs(locDiff.get(0)) + 
			"metres away from safety");
		} else if ((locDiff.get(0) == 0) && (locDiff.get(1) == 0)) {
			System.out.println("The face of the compass warps into a cruel, sharp-featured face and smiles."
			+ " You have reached your location.");
		}
	}
}
