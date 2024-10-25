import greenfoot.*;

public class GameScreen extends World {
    private Label test;
    //private Label hanger = new(GreenfootImage);
    public GameScreen() {
        super(600, 400, 1);

        String myStr = "cheese";
        char[] charArray = myStr.toCharArray();
        for (char s : charArray) {
            System.out.println(s);
        
        }

    }
    
}