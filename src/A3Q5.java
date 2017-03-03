
import becker.robots.City;
import becker.robots.Direction;
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
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 
        City kw = new City();

        //create a robot 
        RobotSE carl = new RobotSE(kw, 5, 1, Direction.EAST);

        //show the number of things 
        kw.showThingCounts(true);

        //place ten things on one intersection
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        new Thing(kw, 5, 1);
        
        //create a algorithm for the robot to transfer the things
    

        for (int i = 0; i <10; i = i + 1) {
            if(carl.canPickThing()==true);
            carl.pickThing();
        }
           carl.move();
           carl.putThing();
           carl.move();
           carl.turnAround();
           



    }
}
