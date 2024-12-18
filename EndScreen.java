import java.util.HashMap;
import java.util.Map;

import greenfoot.*;
public class EndScreen extends World{
    
    public EndScreen(int right, int wrong, int total, boolean win)
    {
        super(600,400,1);
        setBackground("EndScreen.png");
        Label endText;// creating a label for the win text
        //checks for a win
        if(win==true)
        {
            endText=new Label("You win!",50);
        }
        else
        {
            endText=new Label("Game Over",50);
        }
        addObject(endText, 300, 150);
        //displays the post-game stats
         Map<String, Integer> endStats = new HashMap<>();
        endStats.put("Correct Guesses", right);
        endStats.put("Wrong Guesses", wrong);
        endStats.put("Total Guesses", total);
        int y = 200;
        // actually adding the post-game stats to the screen
        for (Map.Entry<String, Integer> entry : endStats.entrySet())
         {
            Label scoreLabel = new Label(entry.getKey() + ": " + entry.getValue(), 24);
            addObject(scoreLabel, 300, y);
            y += 50;
        }
    }
}
