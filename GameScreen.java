import greenfoot.*;
public class GameScreen extends World {
    public GameScreen() {
        super(600, 400, 1);

        String myStr = "cheese";
        char[] charArray = myStr.toCharArray();
        for (char s : charArray) {
            System.out.println(s);
        
        }
    }
    
}