import greenfoot.*;
public class GameScreen extends World {
    String myStr;
    int revealedCount = 0;
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
        System.out.println(charArray);

        String input = Greenfoot.ask("Input");
        if (input == null || input.isEmpty()) {
            System.out.println("Input is null or empty");
            return;
        }

        if (input.length() == 1) {
            char answer = Character.toLowerCase(input.charAt(0));
            System.out.println("User input: " + answer);
            boolean found = false;

            for (int i = 0; i < charArray.length; i++) {
                if (answer == Character.toLowerCase(charArray[i])) {
                    System.out.println("Match found at index: " + i);
                    revealLetter(i, charArray[i]);
                    found = true;
                    revealedCount++;
                }
            }

            if (found) {
                checkGameEnd();
            } else {
                System.out.println("No match found for: " + answer);
            }
        } else {
            System.out.println("Input length is not 1: " + input.length());
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
    private void checkGameEnd() {
        if (revealedCount == myStr.length()) {
            System.out.println("Congratulations! You've found the word: " + myStr);
            
            Greenfoot.stop(); 
            
        }
    }

}
