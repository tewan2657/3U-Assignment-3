
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city
        City kw = new City();
        //create a robot 
       Robot carl = new Robot(kw, 4, 2, Direction.EAST);
   
       //place 2 things and a wall 
       new Thing(kw, 4, 4);
       new Thing(kw, 4, 5);
       new Wall(kw, 4 , 6, Direction.WEST);
       
       // make a counter 
        int counter = 0;
        //move 5 times using a condition
        while(counter <2){
            //move
            carl.move();
            //increase the counter!
            counter = counter + 1;
        
            
    }
}
}
