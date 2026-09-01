import java.util.Scanner; 

public class numguess2 {

    public static void main(String[] args) {

        int randNum = (int)(Math.random() * 11); //generates a random number from 0-10
        int attempts = 0;
        String hint = "placeholder"; //sets it up at the beginning for the loop

        System.out.println("This is a number guessing game. I will pick a number from 0-10 and you have to guess it.");

        while(!hint.contains("Correct!")){ //loops until you guess it
            Scanner input = new Scanner(System.in); //creates the scanner object
            System.out.print("Your guess: ");
            String userGuessStr = input.nextLine();

            try {
                int userGuess = Integer.valueOf(userGuessStr); //makes the input an int

                hint = check(randNum, userGuess, attempts);//checks if its higher or lower
                System.out.println(hint);
                attempts+=1; //puts your attempts up by 1 
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, please enter a whole number from 0-10");
            }
            
        }

    }
        public static String check(int answer, int guess, int attempt){ //a is answer b is guess
        if (answer > guess) {
            return "Too low";
        } else if (answer < guess) {
            return "Too high";
        } else{
            return "Correct! You got it in "+ attempt + " guesses";
        }
    }
}
