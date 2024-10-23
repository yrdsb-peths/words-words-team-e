import greenfoot.*;

public class Button extends Actor 
{
    private Runnable action;

    public Button(Runnable action) 
    {
        this.action = action;
        GreenfootImage image = new GreenfootImage("images/pixil-frame-0 (6).png");
        setImage(image);
    }

    public void act() 
    {
        if (Greenfoot.mouseClicked(this))
         {
            if (action != null)
             {
                action.run();
            }
        }
    }
}