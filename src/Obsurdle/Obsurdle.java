import java.util.Random;
import java.util.Scanner;

public class Obsurdle {
    public static void main(String[] args) {
        // Import Functions
        Wordlist pintoBeans = new Wordlist();
        Random randVal = new Random();
        Scanner beans = new Scanner(System.in);

        // Boolean Dec.
        boolean runtime = true;
        boolean lengthMatch = true;

        // Grab a value for the array; Chooses word
        int wordNum = randVal.nextInt(500);
        String chosenWord = pintoBeans.wordsLong[wordNum].toLowerCase();
        char[] cLetters = chosenWord.toCharArray();

        // Output Logic
        while (runtime) {
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("| O| B| S| U| R| D| L|");
            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("| E| O| B| S| U| R| D|");
            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("| L| E| O| B| S| U| R|");
            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("| D| L| E| O| B| S| U|");
            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("| R| D| L| E| O| B| S|");
            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("| U| R| D| L| E| O| B|");
            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("| S| U| R| D| L| E| O|");
            System.out.println(" -- -- -- -- -- -- -- ");
            System.out.println("                ");
            System.out.println("                ");
            System.out.println("Welcome to OBSURDLE.");
            if (!lengthMatch){
                System.out.println("Your word isn't seven letters long! Please try again!");
            }
            System.out.println("To begin, guess a 7-letter word.");
            String guess = beans.nextLine();

            // Word Validity
            char[] gLetters = guess.toCharArray();
            try{
                char sev = gLetters[6];
                char eig = gLetters [7];
            }catch(Exception e){

            }
            // Game Logic
            // System.out.println(chosenWord);
            // System.out.println("beans");
            // for (int i = 0; i < 7; i++) {
            //     System.out.println(cLetters[i] + " " + gLetters[i]);
            // }
            // beans.close();
        }
    }
}
