
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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //create a city 

        City kw = new City();
        //create a robot 
        RobotSE carl = new RobotSE(kw, 3, 3, Direction.SOUTH);

        // top left block 
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);

        //Top right block 
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.WEST);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);

        //Bottom left Block 
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 5, 1, Direction.WEST);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 4, 2, Direction.EAST);
 
        // Bottom right block   
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 5, 4, Direction.WEST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 4, 5, Direction.EAST);
 
        
        
      //Make a variable
        int mov = 0;
        // execute command 4 times 
        while(mov<4){
            
        for(int i = 0; i < 4; i++ ){
            //if i<3 then execute commands below
            if(i<3){
            carl.move();
            carl.move();
            carl.move();
            carl.turnLeft();
            }
            // if i>3 then execute commads below 
            else{
                carl.move();
                carl.move();
                carl.move();
                
                
            }   
                
                
            }
        mov++;
        }    
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
        }
    }

