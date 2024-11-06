import greenfoot.*;

public class MenuScreen extends World
{
    private Queues<GreenfootImage> themeQueue;
    private GreenfootImage currentTheme;
    private GreenfootImage skullImage;
    private GreenfootImage titleImage;
    
    private Label themeLabel;
    public static int themeType=0;
    
    public MenuScreen()
    {
        super(600,400,1);
        themeType=0;
        themeQueue = new Queues<>();
        loadThemes();
        setBackground("Brown copy.png");
        currentTheme = themeQueue.peek();
        themeLabel = new Label(currentTheme, 100, 100);
        themeLabel.setImage(currentTheme);
        skullImage = new GreenfootImage("Skull.png");
        skullImage.scale(100, 100); 
        Label skull1 = new Label(skullImage, "", 0);
        Label skull2 = new Label(skullImage, "", 0);
        skull1.setImage(skullImage);
        skull2.setImage(skullImage);

        titleImage = new GreenfootImage("Title.png"); 
        Label title = new Label(titleImage, "", 0);
        title.setImage(titleImage);

        addObject(themeLabel, 300, 250);
        addObject(new Button(this::goToGameScreen, "StartButtonIdle.png",114, 56), 300, 350);
        addObject(new Button(this::cycleTheme, "Theme.png",114, 56), 300, 275);
        addObject(skull1, 100, 250);
        addObject(skull2, 500, 250);
        addObject(title, 300, 100);

    }
    private void loadThemes() 
    {
        themeQueue.enqueue(new GreenfootImage("Animal.png"));
        themeQueue.enqueue(new GreenfootImage("Food.png"));
        themeQueue.enqueue(new GreenfootImage("Countries.png"));
    }

    public void cycleTheme() 
    {
        GreenfootImage firstTheme = themeQueue.dequeue();
        themeQueue.enqueue(firstTheme);
        currentTheme = themeQueue.peek();
        themeLabel.setImage(currentTheme);
        if(themeType<2){
            themeType++;
        }
        else if(themeType==2)
        {
            themeType=0;
        }
    }
    public void goToGameScreen() 
    {
        Greenfoot.setWorld(new GameScreen()); 
    }
}
