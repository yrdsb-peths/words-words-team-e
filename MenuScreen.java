import greenfoot.*;

public class MenuScreen extends World
{
    private Queues<GreenfootImage> themeQueue;
    private GreenfootImage currentTheme;
    private Label themeLabel;
    public static int themeType=0;
    public MenuScreen()
    {
        super(600,400,1);
        themeQueue = new Queues<>();
        loadThemes();
        setBackground("Brown copy.png");
        currentTheme = themeQueue.peek();
        themeLabel = new Label(currentTheme, 100, 100);
        themeLabel.setImage(currentTheme);
        Label themeCycleName= new Label("Cycle Themes", 25);
        addObject(themeLabel, 300, 200);
        addObject(themeCycleName, 150, 250);
        addObject(new Button(this::cycleTheme), 300, 275);
        
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
        else
        {
            themeType=0;
        }
    }
}
