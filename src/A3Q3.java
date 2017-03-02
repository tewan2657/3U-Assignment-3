
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tewan2657
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kw = new City();

        //create a robot 
        RobotSE carl = new RobotSE(kw, 1, 1, Direction.EAST);

        //create a room 
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        // place litter in room 
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);



        for (int i = 0; i < 10; i = i + 1) {
            if (carl.canPickThing()) {
                carl.pickThing();
            }
            carl.move();
            

            if (carl.frontIsClear() == false) {
                carl.turnRight();
            }
            }
            
            for (int i = 0; i < 6; i = i + 1) {
            if (carl.canPickThing()) {
                carl.pickThing();
            }
            carl.move();
           

            if (carl.frontIsClear() == false) {
                carl.turnRight();
                carl.move();
                carl.turnRight();





        }
    }

    }
}