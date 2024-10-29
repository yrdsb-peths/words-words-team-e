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
                System.out.println(s);
            
            }
        }

        else if(MenuScreen.themeType==1) {
            myStr=FoodList.food[index];
            char[] charArray = myStr.toCharArray();
            for (char s : charArray) {
                System.out.println(s);
            
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
        
    }

    
}