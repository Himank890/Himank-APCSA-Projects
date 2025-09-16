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

	// You will need to add many variables!!
// This method should return the total number of beepers cleaned up.
	int totalBeepers = 0; // Need to move this somewhere else.
	int totalSteps = 1;
	int pileSize = 0;
	int largestPile = 0;
	int largestPileX = 0;
	int largestPileY = 0;
	int pileAmount = 0;

	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location
		Robot roomba = new Robot(7,6,East,0);
		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(1);

		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */
		while (roomba.frontIsClear()) {
			
			while (roomba.nextToABeeper()) {
				roomba.pickBeeper();
				totalBeepers++;
				pileSize++;
				if (pileSize > largestPile) {
				largestPile++;
				largestPileX = (roomba.avenue());
				largestPileY = (roomba.street());
				}
				if (roomba.frontIsClear()) {
					pileSize = 0;
				}
			}
			roomba.move();
			totalSteps++;
			if(!roomba.frontIsClear()) {
				if(roomba.facingEast()) {
					roomba.turnLeft();
						roomba.move();
						totalSteps++;
					roomba.turnLeft();
				}
				else {
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
						roomba.move();
						totalSteps++;
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
				}
			}
		}
		// the line below causes a null pointer exception
		// what is that and why are we getting it?
        
		
		
        
		//while ((roomba.pickBeeper()) = true); {
		//	int + 1
		//}
		System.out.println("The largest pile is " + largestPile);
		System.out.println("The largest pile is located at (" + largestPileX + "," + largestPileY + ")");
		System.out.println("Total area is "+ totalSteps);
		System.out.println("Total area is "+ totalSteps);
		System.out.println("Total area is "+ totalSteps);
		return totalBeepers;
	}
	}
