import greenfoot.*;
public class GameScreen extends World {
    String myStr;
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
    Label letterOne = new Label("",50);
    Label letterTwo = new Label("", 50);
    Label letterThree = new Label("",50);
    Label letterFour = new Label("",50);
    Label letterFive = new Label("",50);
    Label letterSix = new Label("",50);
    Label letterSeven = new Label("",50);
    Label letterEight = new Label("",50);
    Label letterNine = new Label("",50);
    Label letterTen = new Label("",50);
    Label letterEleven = new Label("",50);
    int letter=0;
    public int index = Greenfoot.getRandomNumber(74);
    public GameScreen() {
    super(600, 400, 1);

    if (MenuScreen.themeType == 0) {
        myStr = AnimalList.animals[index];
    } else if (MenuScreen.themeType == 1) {
        myStr = FoodList.food[index];
    } else if (MenuScreen.themeType == 2) {
        myStr = CountriesList.countries[index];
    }

    char[] charArray = myStr.toCharArray();
    for (int i = 0; i < charArray.length && i < 11; i++) {
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

    addObject(letterOne, 150, 200);
    addObject(letterTwo, 200, 200);
    addObject(letterThree, 250, 200);
    addObject(letterFour, 300, 200);
    addObject(letterFive, 350, 200);
    addObject(letterSix, 400, 200);
    addObject(letterSeven, 450, 200);
    addObject(letterEight, 500, 200);
    addObject(letterNine, 550, 200);
    addObject(letterTen, 600, 200);
    addObject(letterEleven, 650, 200);
    addObject(new Button(this::inputMethod, "StartButtonIdle.png", 114, 56), 300, 350);
}

    public void inputMethod() {
        char[] charArray = { firstLetter, secondLetter, thirdLetter, fourthLetter, fifthLetter, 
                             sixthLetter, seventhLetter, eighthLetter, ninthLetter, tenthLetter, 
                             eleventhLetter };
    
        String input = Greenfoot.ask("Input");
        if (input == null || input.isEmpty()) {
            System.out.println("null or empty");
            return;
        }
        if (input.length() == 1) {
            char answer = input.charAt(0);
            System.out.println(answer);
    
            for (int i = 0; i < charArray.length; i++) {
                System.out.println(charArray[i]);
                if (answer == charArray[i]) {
                    System.out.println(i);
                    revealLetter(i, answer);
                    break;
                }
            }
        }
    }
    

    public void revealLetter(int index, char letter) {
        String letterStr = Character.toString(letter); 
        switch (index) {
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
}
