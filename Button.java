import greenfoot.*;

public class Button extends Actor {
    private Runnable action;

    public Button(Runnable action, String imageFileName, int width, int height) {
        this.action = action;
        GreenfootImage image = new GreenfootImage(imageFileName);
        image.scale(width, height);
        setImage(image);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            action.run();
        }
    }
}
