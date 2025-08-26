package robot;
import kareltherobot.*;


public class Starter implements Directions{

  public static void main(String[] args) {

    World.setVisible(true);// allows us to see the run output
    // the bigger the street, the farther north
    World.setSize(20,20);


    // The line below creates a Robot that we will refer to as rob
    // Find out what the numbers and direction do!
    // Put rob in a better location for your initials.
    Robot rob = new Robot(16,10,West,900);
    World.setDelay(1);
    // Want a second robot?  No prob.  They are cheap :)
    //Robot dude = new Robot(7,5,West,9);
    // examples of commands you can invoke on a Robot
    // move one step in the direction it is facing


    // starting the diamond
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    // Puts the first side of the Diamond
    rob.turnLeft();
    // Faces proper direction
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    // Code for the 2nd side of the Diamond
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    //Done with the 3rd side
    rob.turnLeft();
    rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
    rob.move();
    rob.turnLeft();
    rob.turnLeft();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
     rob.move();
    rob.turnLeft();
    rob.move();
    rob.putBeeper();
        // done with the final side, now we have a diamond.
    
    // rob.turnLeft();
    
    
  }
}