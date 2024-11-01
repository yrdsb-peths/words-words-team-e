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
        Label letterOne = null;
        addObject(letterOne, 150, 200);
        Label letterTwo = null;
        addObject(letterTwo, 200, 200);
        Label letterThree = null;
        addObject(letterThree, 250, 200);
        Label letterFour = null;
        addObject(letterFour, 300, 200);
        Label letterFive = null;
        addObject(letterFive, 350, 200);
        Label letterSix = null;
        addObject(letterSix, 400, 200);
        Label letterSeven = null;
        addObject(letterSeven, 450, 200);
        Label letterEight = null;
        addObject(letterEight, 500, 200);
        Label letterNine = null;
        addObject(letterNine, 550, 200);
        Label letterTen = null;
        addObject(letterTen, 600, 200);
        Label letterEleven = null;
        addObject(letterEleven, 650, 200);
        addObject(new Button(this::inputMethod, "StartButtonIdle.png",114, 56), 300, 350);

    }
    public void inputMethod()
    {
        char[] charArray = new char[11];
        charArray[0] = firstLetter;
        charArray[1] = secondLetter;
        charArray[2] = thirdLetter;
        charArray[3] = fourthLetter;
        charArray[4] = fifthLetter;
        charArray[5] = sixthLetter;
        charArray[6] = seventhLetter;
        charArray[7] = eighthLetter;
        charArray[8] = ninthLetter;
        charArray[9] = tenthLetter;
        charArray[10] = eleventhLetter;
        String input= Greenfoot.ask("Input");
        char[] answer=input.toCharArray();
        for(int i=0; i<charArray.length; i++)
        {
            if(answer[0]==charArray[i]){
                System.out.println("Nice");
            }
        }

    }
    
}