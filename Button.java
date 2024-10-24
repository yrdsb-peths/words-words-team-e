import greenfoot.*;

public class Button extends Actor
{
    private Runnable action;

    public Button(Runnable action) {
        this.action = action;
        setImage(new GreenfootImage("pixil-frame-0 (6).png"));
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            action.run();
        }
    }
}
