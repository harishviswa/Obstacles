//BoxTopper.java
//Harish Viswa
//11.05.20

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class BoxTopper extends Racer{

//HighJumper will start at the given y-value
   public BoxTopper(int y){
      super(y);
   }
   
   //Override jumpRight method so that the BoxTopper can jump any width
   public void jumpRight(){
      turnLeft();
      while(!rightIsClear()){
         move();
      }
      turnRight();
      move();
      while(!rightIsClear()){
         move();
      }
      turnRight();
      while(frontIsClear()){
         move();
      }
      turnLeft();
      }


}
