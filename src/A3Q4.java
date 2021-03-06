
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City kw = new City();

        //create a robot
        RobotSE carl = new RobotSE(kw, 4, 2, Direction.NORTH);

        //create a closed room with one exit 
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.EAST);



        // loop


        while (carl.frontIsClear()) {
            carl.move();


           

        }


         // make a loop until the front is clear 
        while (!(carl.frontIsClear())) {


            if (carl.frontIsClear() == false && carl.getDirection() == Direction.NORTH) {
                carl.turnRight();
                if (carl.frontIsClear() == false && carl.getDirection() == Direction.EAST) {
                    carl.turnRight();
                }
                // check the wall for any exits 
                carl.move();
                carl.turnLeft();

            }
             // what carl should do if these starements are true 
            if (carl.frontIsClear() == false && carl.getDirection() == Direction.EAST) {
                carl.turnRight();
                carl.move();
                carl.turnLeft();

            }
            if (carl.frontIsClear() == false && carl.getDirection() == Direction.SOUTH) {
                carl.turnRight();
                carl.move();
                carl.turnLeft();

            }

            if (carl.frontIsClear() == false && carl.getDirection() == Direction.WEST) {
                carl.turnRight();
                carl.move();
                carl.turnLeft();

            } 

        }
        // escape the room after carl finds the exit 
        carl.move();
    }       
}
            