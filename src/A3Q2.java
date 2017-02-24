
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tewan2657
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a new city
        City kw = new City();
        
        //create a robot
       Robot carl = new Robot(kw, 0, 2, Direction.WEST);
       
       //create a square wall
       new Wall(kw, 1, 2, Direction.NORTH);
       new Wall(kw, 1, 1, Direction.NORTH);
       new Wall(kw, 2, 1, Direction.SOUTH);
       new Wall(kw, 2, 2, Direction.SOUTH);
       new Wall(kw, 1, 1, Direction.WEST);
       new Wall(kw, 2, 1, Direction.WEST);
       new Wall(kw, 1, 2, Direction.EAST);
       new Wall(kw, 2, 2, Direction.EAST);
       
       while(true){
           carl.move();
           carl.move();
           carl.turnLeft();
           carl.move();
           
           
       }
     
       
    }
    
}
