import greenfoot.*;
import java.util.Scanner;
public class GameScreen extends World {
    public GameScreen() {
        super(600, 400, 1);
        try (Scanner myObj = new Scanner(System.in)) {
            String userName;
   
            System.out.println("Enter username"); 
            userName = myObj.nextLine();   
      
            System.out.println("Username is: " + userName);
        }  
    }
    
}