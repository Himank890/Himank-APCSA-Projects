package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/basicRoom.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// declared here so it is visible in all the methods!
	private Robot roomba;

	// You will need to add many variables!!


	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location
		Robot roomba = new Robot(9,7,South,0);
		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(1);

		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */
		while (roomba.nextToABeeper()) {
			roomba.pickBeeper();
		}
		//I think I can for loop from here *
		roomba.move();
		roomba.move();
		roomba.turnLeft();
		roomba.move();
		while (roomba.nextToABeeper()) {
			roomba.pickBeeper();
		}
		roomba.move();
		while (roomba.nextToABeeper()) {
			roomba.pickBeeper();
		}
		roomba.move();
		roomba.move();
		roomba.turnLeft();
		roomba.move();
		while (roomba.nextToABeeper()) {
			roomba.pickBeeper();
		}
		roomba.move();
		while (roomba.nextToABeeper()) {
			roomba.pickBeeper();
		}
		//I think I can end a for loop here
		// the line below causes a null pointer exception
		// what is that and why are we getting it?
        
		
		
        // This method should return the total number of beepers cleaned up.
		int totalBeepers = 0; // Need to move this somewhere else.
		//while (roomba.pickBeeper();)
		return totalBeepers;
	}
}
