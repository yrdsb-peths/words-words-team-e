import greenfoot.*;

public class MenuScreen extends World
{
    private Queues<Label> themeQueue;
    private Label currentTheme;
    private Label themeLabel;
    public MenuScreen()
    {
        super(600,400,1);
        themeQueue = new Queues<>();
        loadThemes();
        currentTheme = themeQueue.peek();
        themeLabel = new Label(currentTheme, 100, 100);
        themeLabel.equals(currentTheme);
        Label themeCycleName= new Label("cycle Avatars", 25);
        addObject(themeCycleName, 300, 250);
        addObject(new Button(this::cycleTheme), 300, 275);

    }
    private void loadThemes() 
    {
        themeQueue.enqueue(new Label("Animals",50));
        themeQueue.enqueue(new Label("Food", 50));
        themeQueue.enqueue(new Label("Countries", 50));
    }

    public void cycleTheme() 
    {
        Label firstTheme = themeQueue.dequeue();
        themeQueue.enqueue(firstTheme);
        currentTheme = themeQueue.peek();
        themeLabel.equals(currentTheme);
    
    }
}
