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
        for (Map.Entry<String, Integer> entry : endStats.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
