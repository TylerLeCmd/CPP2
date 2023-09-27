import java.util.Random;
import java.util.Scanner;

//Uncompleted Version of Game
//by Dallin Soukip and Tyler Le
public class Obsurdle {
    public static void main(String[] args) {
        // Import Functions
        Wordlist pintoBeans = new Wordlist();
        Random randVal = new Random();
        Scanner beans = new Scanner(System.in);
        Match sameT = new Match();

        // Boolean Dec. / Variable Dec.
        boolean runtime = true;
        boolean lengthMatch = true;
        boolean win = false;
        int guessNum = 0;

        // Grab a value for the array; Chooses word (Initial Pick)
        int wordNum = randVal.nextInt(500);
        String chosenWord = pintoBeans.wordsLong[wordNum].toLowerCase();
        char[] cLetters = chosenWord.toCharArray();

        // Start Menu
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("| O | B | S | U | R | D | L |");
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("| E | □ | - | S | - | R | □ |");
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("| ■ | E | O | B | ■ | U | R |");
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("| □ | L | ■ | O | B | - | U |");
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("| R | - | L | - | O | □ | S |");
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("| - | R | □ | L | ■ | O | ■ |");
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("| S | - | R | ■ | L | E | □ |");
        System.out.println(" --- --- --- --- --- --- --- ");
        System.out.println("                ");
        System.out.println("                ");
        System.out.println("Welcome to OBSURDLE.");
        System.out.println("The rules are similar to Wordle:");
        System.out.println("You are trying to guess a seven-letter word.");
        System.out.println("You'll be told whether you get a letter correctly guessed by these indicators: □ ■");
        System.out.println("Example Word: Poggers");
        System.out.println("| ■ | - | - | - | - | □ | □ |");
        System.out.println();
        System.out.println("| □ | indicates a right letter, wrong position,");
        System.out.println("| ■ | indicates a right letter, right position,");
        System.out.println("| - | indicates a wrong letter.");
        System.out.println();
        System.out.println("You will get 7 tries to get the word.");
        System.out.println("[Press ENTER to continue]");
        beans.nextLine();

        // Game Logic
        while (runtime) {
            while (!win) {
                if (!lengthMatch) {
                    System.out.println("Your word isn't seven letters long! Please try again!");
                    lengthMatch = true;
                }
                if (guessNum == 0) {
                    System.out.println("To begin, guess a 7-letter word.");
                } else if (guessNum <= 6) {
                    System.out.println("\n" + "Make another guess!");
                    System.out.println("Guesses Left = " + (7 - guessNum));
                } else if (guessNum > 6) {
                    System.out.println();
                    System.out.println("Sorry, the word was " + chosenWord + ".");
                    System.out.println("Oops, you're out of tries!");
                    win = true;
                }
                if (guessNum <= 6) {
                    String guess = beans.nextLine();
                    // Word Validity
                    char[] gLetters = guess.toCharArray();
                    if (guess.length() != 7) {
                        lengthMatch = false;
                    }
                    // // Game Logic
                    if (lengthMatch) {
                        System.out.print("|");
                        for (int i = 0; i < 7; i++) {
                            System.out.print(" " + gLetters[i] + " |");
                        }
                        System.out.println();
                        sameT.setWords(chosenWord, guess);
                        if (sameT.matchText().equals("| ■ | ■ | ■ | ■ | ■ | ■ | ■ |")) {
                            System.out.println(sameT.matchText());
                            System.out.println("You won! The word was " + chosenWord + "!");
                            System.out.println("You guessed the word in " + guessNum + " tries!");
                            win = true;
                        } else {
                            System.out.print(sameT.matchText());
                            guessNum++;
                        }
                    }
                }
            }
            System.out.println("Do you want to play again?");
            String restart = beans.nextLine();
            if (restart.toLowerCase().equals("y")) {
                runtime = true;
                win = false;
                guessNum = 0;
                wordNum = randVal.nextInt(500);
                chosenWord = pintoBeans.wordsLong[wordNum].toLowerCase();
            } else if (restart.toLowerCase().equals("n")) {
                System.out.println("Thanks for playing!");
                runtime = false;
            }
        }
        beans.close();
    }
}
