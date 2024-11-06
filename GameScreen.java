import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import greenfoot.*;
public class GameScreen extends World 
{
    private Queues<GreenfootImage> hangManQueue;
    private GreenfootImage currentHangMan;
    private Label hangManLabel;
    private Label rightOrWrongText;
    public static int hangManType=0;
    Set<Character> guessedLetters = new HashSet<>();
    String myStr;
    int revealedCount = 0;
    int correctGuessesCount=0;
    int wrongLetterCount=0;
    int totalGuesses=0;
    boolean win=false;
    char firstLetter;
    char secondLetter;
    char thirdLetter;
    char fourthLetter;
    char fifthLetter;
    char sixthLetter;
    char seventhLetter;
    char eighthLetter;
    char ninthLetter;
    char tenthLetter;
    char eleventhLetter;
    Label letterOne = new Label("_",50);
    Label letterTwo = new Label("_", 50);
    Label letterThree = new Label("_",50);
    Label letterFour = new Label("_",50);
    Label letterFive = new Label("_",50);
    Label letterSix = new Label("_",50);
    Label letterSeven = new Label("_",50);
    Label letterEight = new Label("_",50);
    Label letterNine = new Label("_",50);
    Label letterTen = new Label("_",50);
    Label letterEleven = new Label("_",50);
    int letter=0;
    public int index = Greenfoot.getRandomNumber(74);
    GreenfootSound winSound = new GreenfootSound("winMusic.mp3");
    GreenfootSound loseSound = new GreenfootSound("loseMusic.mp3");
    GreenfootSound backgroudMusic = new GreenfootSound("backgroundMusic.mp3");
    
    public GameScreen() 
    {
        super(600, 400, 1);
        setBackground("GameBackground.png");
        backgroudMusic.playLoop();
        hangManType=0;
        hangManQueue = new Queues<>();
        loadHangMan();
        currentHangMan = hangManQueue.peek();
        hangManLabel = new Label(currentHangMan, "",100);
        hangManLabel.setImage(currentHangMan);
        currentHangMan.scale(100, 100); 
        addObject(hangManLabel, 300, 135);
        rightOrWrongText= new Label("", 25);
        addObject(rightOrWrongText, 300,275);
        addObject(new Button(this::inputMethod, "GuessButton.png",114, 56), 300, 350);


        RandomStringPicker(MenuScreen.themeType);
        
        
        char[] charArray = myStr.toCharArray();
        for (int i = 0; i < charArray.length && i < 11; i++) 
        {
            switch (i) {
                case 0: firstLetter = charArray[i]; break;
                case 1: secondLetter = charArray[i]; break;
                case 2: thirdLetter = charArray[i]; break;
                case 3: fourthLetter = charArray[i]; break;
                case 4: fifthLetter = charArray[i]; break;
                case 5: sixthLetter = charArray[i]; break;
                case 6: seventhLetter = charArray[i]; break;
                case 7: eighthLetter = charArray[i]; break;
                case 8: ninthLetter = charArray[i]; break;
                case 9: tenthLetter = charArray[i]; break;
                case 10: eleventhLetter = charArray[i]; break;
            }
        }
        Label[] labels = {letterOne, letterTwo, letterThree, letterFour, letterFive,letterSix, letterSeven, letterEight, letterNine, letterTen, letterEleven};
            for (int i = 0; i < myStr.length(); i++) 
            {
                addObject(labels[i], 50 + i * 50, 200); 
            }

    }

    public void inputMethod() 
    {
        char[] charArray = { firstLetter, secondLetter, thirdLetter, fourthLetter, fifthLetter, 
                            sixthLetter, seventhLetter, eighthLetter, ninthLetter, tenthLetter, 
                            eleventhLetter };

        String input = Greenfoot.ask("Input");
        totalGuesses++;
        if (input == null || input.isEmpty()) 
        {
            return;
        }

        if (input.length() == 1) 
        {
            char answer = Character.toLowerCase(input.charAt(0));
            if (guessedLetters.contains(answer)) {
                rightOrWrongText.setValue("Letter already Guessed");
                return;
            }
            System.out.println("User input: " + answer);
            guessedLetters.add(answer);
            boolean found = false;

            for (int i = 0; i < charArray.length; i++) 
            {
                if (answer == Character.toLowerCase(charArray[i])) 
                {
                    rightOrWrongText.setValue("Correct!");
                    revealLetter(i, charArray[i]);
                    revealedCount++;
                    found = true;
                    
                }
            }

            if (found) 
            {
                correctGuessesCount++;
                checkGameEnd();
            } 
            else 
            {
                rightOrWrongText.setValue("Sorry try again!");
                wrongLetterCount++;
                cycleHangMan();
                checkGameEnd();
            }
        } 
        else 
        {
            rightOrWrongText.setValue("Put a letter...");
        }
    }

    public void revealLetter(int index, char letter) 
    {
        String letterStr = Character.toString(letter); 
        switch (index) 
        {
            case 0: letterOne.setValue(letterStr); break;
            case 1: letterTwo.setValue(letterStr); break;
            case 2: letterThree.setValue(letterStr); break;
            case 3: letterFour.setValue(letterStr); break;
            case 4: letterFive.setValue(letterStr); break;
            case 5: letterSix.setValue(letterStr); break;
            case 6: letterSeven.setValue(letterStr); break;
            case 7: letterEight.setValue(letterStr); break;
            case 8: letterNine.setValue(letterStr); break;
            case 9: letterTen.setValue(letterStr); break;
            case 10: letterEleven.setValue(letterStr); break;
        }
    }
    private void checkGameEnd() 
    {
        
        if (revealedCount == myStr.length()) 
        {
            backgroudMusic.stop();
            win=true;
            winSound.play();
            Greenfoot.setWorld(new EndScreen(correctGuessesCount, wrongLetterCount,totalGuesses,win)); 
            
        }
        else if(wrongLetterCount>=6)
        {
            backgroudMusic.stop();
            loseSound.play();
            Greenfoot.setWorld(new EndScreen(revealedCount, wrongLetterCount,totalGuesses,win)); 
        }
    }
    private void loadHangMan() 
    {
        hangManQueue.enqueue(new GreenfootImage("Hangman0.png"));
        hangManQueue.enqueue(new GreenfootImage("Hangman1.png"));
        hangManQueue.enqueue(new GreenfootImage("Hangman2.png"));
        hangManQueue.enqueue(new GreenfootImage("Hangman3.png"));
        hangManQueue.enqueue(new GreenfootImage("Hangman4.png"));
        hangManQueue.enqueue(new GreenfootImage("Hangman5.png"));
        hangManQueue.enqueue(new GreenfootImage("Hangman6.png"));
    }
    
    public void cycleHangMan() 
    {
        GreenfootImage firstHangMan = hangManQueue.dequeue();
        hangManQueue.enqueue(firstHangMan);
        currentHangMan = hangManQueue.peek();
        hangManLabel.setImage(currentHangMan);
        if(hangManType<2){
            hangManType++;
        }
        else if(hangManType==2)
        {
            hangManType=0;
        }
    }
    public void RandomStringPicker(int theme) {
        String[][] allArrays = {AnimalList.animals, CountriesList.countries, FoodList.food};
        
        Random rand = new Random();      
        int randomCol = rand.nextInt(allArrays[theme].length);  


        String randomString = allArrays[theme][randomCol];
        myStr=randomString;
    }

}
