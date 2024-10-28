import greenfoot.*;
public class GameScreen extends World {
    String myStr;
    public GameScreen() {
        super(600, 400, 1);

        myStr=AnimalList.animals[1];
        char[] charArray = myStr.toCharArray();
        for (char s : charArray) {
            System.out.println(s);
        
        }
    }
    
}