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
    //First Loop
    for (int i = 0; i < 4; i++)
    {
      rob.putBeeper();
      rob.move();
      rob.turnLeft();
      rob.move();
      rob.turnLeft();
      rob.turnLeft();
      rob.turnLeft();
    }
    // Resetting to face proper direction
    rob.turnLeft();
    //Second Loop
       for (int i = 0; i < 4; i++)
    {
      rob.putBeeper();
      rob.move();
      rob.turnLeft();
      rob.move();
      rob.turnLeft();
      rob.turnLeft();
      rob.turnLeft();
    }
    // Resetting to face proper direction
    rob.turnLeft();
    //Third Loop
       for (int i = 0; i < 4; i++)
    {
      rob.putBeeper();
      rob.move();
      rob.turnLeft();
      rob.move();
      rob.turnLeft();
      rob.turnLeft();
      rob.turnLeft();
    }
    // Resetting to face proper direction
    rob.turnLeft();
    //Fourth Loop
       for (int i = 0; i < 4; i++)
    {
      rob.putBeeper();
      rob.move();
      rob.turnLeft();
      rob.move();
      rob.turnLeft();
      rob.turnLeft();
      rob.turnLeft();
    }
  }
}