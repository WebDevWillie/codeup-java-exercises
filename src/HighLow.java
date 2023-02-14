import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main(String[] args){

        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scan = new Scanner(System.in);
        int guess;
        System.out.print("Guess a number between 1 and 100: ");
            int count = 0;
            while (count < 10){
                guess = scan.nextInt();
                if (guess == number) {
                    System.out.println("GOOD GUESS!");
                    break;
                } else if (guess < number) {
                    System.out.println("HIGHER! You have " + (10 - count) + " guesses left.");
                } else {
                    System.out.println("LOWER! " + (10 - count) + " guesses left.");
                }
                count++;
            }

            if (count == 10){
                System.out.println("You lose!");
            }
    }

}
