
/*Number Guessing Game: Program generates a random number; 
the player gets limited attempts to guess it while receiving "too high" or "too low" hints
*/
import java.util.Scanner;  // WHY TF DO YOU HAVE TO IMPORT SOMETHING JUST TO TAKE INPUT

public class firstpractice {

    public static void main(String[] args) {

        int randNum = (int)(Math.random() * 11); //generates a random number from 0-10
        String hint = "placeholder"; //sets it up at the beginning for the loop

        System.out.println("this is a number guessing game. i will pick a number from 1-10 and you have to guess it.");

        while(hint!="correct!"){ //loops until you guess it
            Scanner obj = new Scanner(System.in); //creates the scanner object
            System.out.println("your guess: ");

            String userGuessStr = obj.nextLine();
            //System.out.println("you guessed: " + userGuessStr);
            int userGuess = Integer.valueOf(userGuessStr); //makes the input an int

            hint = check(randNum, userGuess);
            System.out.println(hint);//prints it
        }

    }
        public static String check(int answer, int guess){ //a is answer b is guess
        if (answer > guess) {
            return "too low";
        } else if (answer < guess) {
            return "too high";
        } else if (answer==guess){
            return "correct!";
        } else{
            return"wtf";
        }
    }
}
 

//*add different difficulkties with bigger raneg of number, and hints that say way too 
// low and a little too low. make the range for that diff*10 or somehting, so for 1-10 
// very high would be 5 away, and 1-100 very high wouuld be 50 away for example*/