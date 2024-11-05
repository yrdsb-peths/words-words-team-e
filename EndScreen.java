import java.util.HashMap;
import java.util.Map;

import greenfoot.*;
public class EndScreen extends World{
    
    public EndScreen(int right, int wrong, int total){
        super(600,400,1);
         Map<String, Integer> endStats = new HashMap<>();
        endStats.put("Right", right);
        endStats.put("Wrong", wrong);
        endStats.put("Total", total);
        int y = 100;

        for (Map.Entry<String, Integer> entry : endStats.entrySet())
         {
            Label scoreLabel = new Label(entry.getKey() + ": " + entry.getValue(), 24);
            addObject(scoreLabel, 300, y);
            y += 50;
        }
    }
}
