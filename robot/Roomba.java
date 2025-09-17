package robot;

import kareltherobot.*;

public class Roomba implements Directions {

	// Main method to make this self-contained
	public static void main(String[] args) {
		// LEAVE THIS ALONE!!!!!!
		String worldName = "robot/FinalTestWorld.wld";

		Roomba cleaner = new Roomba();
		int totalBeepers = cleaner.cleanRoom(worldName, 7, 6);
		System.out.println("Roomba cleaned up a total of " + totalBeepers + " beepers.");

	}

	// You will need to add many variables!!
	int totalBeepers = 0; //Variable for total beepers
	int totalSteps = 0; //Variable for total area
	int pileSize = 0; //In between variable for size of a stack used in multiple calculations
	int largestPile = 0; //Variable for amount of beepers in largest pile
	int largestPileX = 0; //Street location for largest pile
	int largestPileY = 0; //Avenue location for largest pile
	int pileAmount = 0; //Variable for total number of piles

	public int cleanRoom(String worldName, int startX, int startY) {

		// A new Robot should be constructed and assigned to the global (instance) variable named roomba that is declared above.
        // Make sure it starts at startX and startY location
		//basic room Robot start coordinates
		//Robot roomba = new Robot(7,6,East,0);
		//TestingRoom1 Robot start coordinates
		//Robot roomba = new Robot(25,11,East,0);
		//TestingRoom2 Robot start coordinates
		//Robot roomba = new Robot(5,6,East,0);
		//FinalTestWorld Robot start coordinates
		Robot roomba = new Robot(26,101,East,0);

		World.readWorld(worldName);
		World.setVisible(true);
		World.setDelay(0); //Change speed of robot travel

		/** This section will have all the logic that takes the Robot to every location
		 * and cleans up all piles of beepers. Think about ways you can break this
		 * large, complex task into smaller, easier to solve problems.
		 */
		while (roomba.frontIsClear()) { /**First While loop to tell robot
		to move forward if clear
		*/
		//Uses pilesize variable to count total number of piles
			if (pileSize > 0) {
				pileAmount++;
			}
		 /**Resets pilesize to 0 if not next to beeper so that
		  * it will not continue increasing when it joins a new stack
		  */
			if (roomba.frontIsClear()) {
				pileSize = 0;
			}
			//Picks up beeper while increasing pile size and total beeper variables
			while (roomba.nextToABeeper()) {
				totalBeepers++;
				pileSize++;
				roomba.pickBeeper();
			}
			/** This is the code for making the largest pile and
			 * finding its location
			*/
			if (pileSize >= largestPile) {
				largestPile = pileSize;
				largestPileX = (roomba.avenue());
				largestPileY = (roomba.street());
			}
			// This is so that roomba actually moves during the loop
			roomba.move();
			// This variable counts the area of the room increasing by 1 for every step
			totalSteps++;
			// This is the loop to turn
			if(!roomba.frontIsClear()) {
				//Picks up beeper while increasing pile size and total beeper variables
				while (roomba.nextToABeeper()) {
				totalBeepers++;
				pileSize++;
				roomba.pickBeeper();
				}
				if (roomba.nextToABeeper()) { /**Inside turn function,
				if the roomba gets next to a beeper, pile amount is increased
				by 1
				*/
					pileAmount++;
				}
				//Actual turn left loop
				if(roomba.facingEast()) {
					roomba.turnLeft();
						roomba.move();
						totalSteps++; //increases area by 1 per move
					roomba.turnLeft();
				}
				else { //Turn right loop
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
						roomba.move();
						totalSteps++;  //increases area by 1 per move
					roomba.turnLeft();
					roomba.turnLeft();
					roomba.turnLeft();
				}
			}
		}
        //Prints the amount of beepers in largest pile
		System.out.println("The largest pile is " + largestPile);
		//Prints location of largest pile
		System.out.println("The largest pile is located at Street " + largestPileX + ", Avenue " + largestPileY);
		//Prints total amount of piles
		System.out.println("The amount of piles is "+ pileAmount);
		//Prints total area
		System.out.println("Total area is "+ totalSteps + " square units");
		 //Prints average pile size as decimal number
		System.out.println("Average pile size is "+ (double)totalBeepers/pileAmount);
		 //Prints total percent dirty as decimal number
		System.out.println("Percent dirty is "+ (double)pileAmount/totalSteps + "%");
		//Prints total beepers
		return totalBeepers;
	}
}
