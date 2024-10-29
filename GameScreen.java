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
    int letter=0;
    public int index = Greenfoot.getRandomNumber(74);
    public GameScreen() {
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
                letter++;
            
            }
        }

        else {
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
                letter++;
            
            }
        
        }
        Label letterOne = new Label(String.valueOf(firstLetter), 100);
        addObject(letterOne, 200, 200);
        Label letterTwo = new Label(String.valueOf(secondLetterLetter), 100);
        addObject(letterTwo, 250, 200);
        Label letterThree = new Label(String.valueOf(thirdLetter), 100);
        addObject(letterThree, 300, 200);
        Label letterFour = new Label(String.valueOf(fourthLetter), 100);
        addObject(letterFour, 350, 200);
        Label letterFive = new Label(String.valueOf(fifthLetter), 100);
        addObject(letterFive, 400, 200);
        Label letterSix = new Label(String.valueOf(sixthLetter), 100);
        addObject(letterSix, 450, 200);
        Label letterSeven = new Label(String.valueOf(seventhLetter), 100);
        addObject(letterSeven, 500, 200);
        Label letterEight = new Label(String.valueOf(eighthLetter), 100);
        addObject(letterEight, 550, 200);
        Label letterNine = new Label(String.valueOf(ninthLetter), 100);
        addObject(letterNine, 600, 200);
        

    }

    
}