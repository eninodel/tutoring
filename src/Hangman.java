import java.util.*;
import java.io.*;

/*
* To code hangman, think about having a main loop that runs the game.
* This loop should take in use input, parse it, and check if it is a correct guess or not.
* Then, the program should tell the user how many guesses they have or if the game is over.
* */

public class Hangman {
    public static void main(String args[]) throws FileNotFoundException{
        String[] possibleWords = {"difference", "array"}; // feel free to add any new words!
        Random rand = new Random();
        String randomWord = possibleWords[rand.nextInt(possibleWords.length)]; // gets random word from possibleWords

        // Feel free to change any code or used this existing code!
        while(some condition here){
            // get user input, then probably check it in some way...
            // Also need to give user feed back on if the guess was right or not and the game status
        }
    }

}
