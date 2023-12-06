import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void main(String[] args) {
       System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?"); 
      Scanner num = new Scanner(System.in);
      System.out.print("Type a number: ");
      int guessNum = num.nextInt(); // User input
      System.out.println("Your guess is "+guessNum); // Output user input
      
      Random random = new Random();
      int number = random.nextInt(100) + 1; // Random number between 1 and 100
      System.out.println("The number I was thinking is "+number); // Output random number
      int off = Math.abs(number - guessNum); // Difference between random number and user input
      System.out.println("You were off by "+off); // Output difference

      
    }
}