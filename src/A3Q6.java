
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create a robot 
        RobotSE carl = new RobotSE(kw, 0, 1, Direction.SOUTH);

        // show the number of things 
        kw.showThingCounts(true);

        //place 3 things on first intersection 
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 1);

        //place 2 things on second intersection 
        new Thing(kw, 2, 1);
        new Thing(kw, 2, 1);

        //place 5 things on thrid intersection
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 1);

        //place 4 things on fourth intersection 
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);
        new Thing(kw, 4, 1);

        // follow commands until Avenue & Street match 
        while (carl.getAvenue() == 1 && carl.getStreet() < 5) {
            carl.move();
            carl.pickAllThings();
            carl.turnLeft();

            // do when carl has something in his backpack 
            while (carl.countThingsInBackpack() > 0) {

                carl.putThing();
                carl.move();
            }

            //turn around 
            carl.turnAround();
            
           // move until carl gets to Avenue 1 
            while (carl.getAvenue() != 1) {
                carl.move();


            }


            // turn left 
            carl.turnLeft();
        }

    }
}
