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
    Label letterOne = null;
    Label letterTwo = null;
    Label letterThree = null;
    Label letterFour = null;
    Label letterFive = null;
    Label letterSix = null;
    Label letterSeven = null;
    Label letterEight = null;
    Label letterNine = null;
    Label letterTen = null;
    Label letterEleven = null;
    int letter=0;
    public int index = Greenfoot.getRandomNumber(74);
    public GameScreen(World menuScreen) {
        super(600, 400, 1);

        if (MenuScreen.themeType==0){
            myStr=AnimalList.animals[index];
            char[] charArray = myStr.toCharArray();
            for (char s : charArray) {
                if(letter==0){
                    firstLetter = s;
                }else if(letter==1){
                    secondLetter = s;
                }else if(letter==2){
                    thirdLetter = s;
                }
                else if(letter==3){
                    fourthLetter = s;
                }
                else if(letter==4){
                    fifthLetter = s;
                }
                else if(letter==5){
                    sixthLetter = s;
                }
                else if(letter==6){
                    seventhLetter = s;
                }
                else if(letter==7){
                    eighthLetter = s;
                }
                else if(letter==8){
                    ninthLetter = s;
                }
                else if(letter==9){
                    tenthLetter = s;
                }
                else if(letter==10){
                    eleventhLetter = s;
                }
                letter++;
            
            }
        }

        else if(MenuScreen.themeType==1) {
            myStr=FoodList.food[index];
            char[] charArray = myStr.toCharArray();
            for (char s : charArray) {
                if(letter==0){
                    firstLetter = s;
                }else if(letter==1){
                    secondLetter = s;
                }else if(letter==2){
                    thirdLetter = s;
                }
                else if(letter==3){
                    fourthLetter = s;
                }
                else if(letter==4){
                    fifthLetter = s;
                }
                else if(letter==5){
                    sixthLetter = s;
                }
                else if(letter==6){
                    seventhLetter = s;
                }
                else if(letter==7){
                    eighthLetter = s;
                }
                else if(letter==8){
                    ninthLetter = s;
                }
                else if(letter==9){
                    tenthLetter = s;
                }
                else if(letter==10){
                    eleventhLetter = s;
                }
                letter++;
            
            }
        }

        else if(MenuScreen.themeType==2)
        {
            myStr=CountriesList.countries[index];
            char[] charArray = myStr.toCharArray();
            for (char s : charArray) {
                if(letter==0){
                    firstLetter = s;
                }else if(letter==1){
                    secondLetter = s;
                }else if(letter==2){
                    thirdLetter = s;
                }
                else if(letter==3){
                    fourthLetter = s;
                }
                else if(letter==4){
                    fifthLetter = s;
                }
                else if(letter==5){
                    sixthLetter = s;
                }
                else if(letter==6){
                    seventhLetter = s;
                }
                else if(letter==7){
                    eighthLetter = s;
                }
                else if(letter==8){
                    ninthLetter = s;
                }
                else if(letter==9){
                    tenthLetter = s;
                }
                else if(letter==10){
                    eleventhLetter = s;
                }
                letter++;
            
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
        addObject(new Button(this::inputMethod, "StartButtonIdle.png",114, 56), 300, 350);

    }
    public void inputMethod()
    {
        char[] charArray = { firstLetter, secondLetter, thirdLetter, fourthLetter, fifthLetter, 
                            sixthLetter, seventhLetter, eighthLetter, ninthLetter, tenthLetter, 
                            eleventhLetter };

        String input = Greenfoot.ask("Input");
        if (input.length() == 1) {
            char answer = input.charAt(0);

            for (int i = 0; i < charArray.length; i++)
            {
                if (answer == charArray[i]) {

                    revealLetter(i, answer);
                    break; 
                }
            }
        }
    }

    public void revealLetter(int index, char letter)
    {
        switch (index) {
            case 0: letterOne.setValue(letter); break;
            case 1: letterTwo.setValue(letter); break;
            case 2: letterThree.setValue(letter); break;
            case 3: letterFour.setValue(letter); break;
            case 4: letterFive.setValue(letter); break;
            case 5: letterSix.setValue(letter); break;
            case 6: letterSeven.setValue(letter); break;
            case 7: letterEight.setValue(letter); break;
            case 8: letterNine.setValue(letter); break;
            case 9: letterTen.setValue(letter); break;
            case 10: letterEleven.setValue(letter); break;
            
        }
    }
}
