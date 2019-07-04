package homework4;
import java.util.Scanner;
import java.util.Random;
public class hw4 {
    public static void main(String[] arg){
        Scanner keyboard= new Scanner (System.in);
        Random r = new Random();
        int low = 1;
        int high = 100;
        int number = r.nextInt(high-low) + low;
        int tries=0;
        System.out.println("This program allows you to play a guessing game.");
        System.out.println("I will think of a number between 1 and 100 and will allow you to guess until you get it. For each guess, I will tell you whether the right answer is higher or lower than your guess.");
        System.out.println("I am thinking of a number between 1 and 100...");

        int guess;
        System.out.println("Enter number: ");
        guess=0;
        tries++;


         while(guess!=number)
         {
             guess=keyboard.nextInt();
            if (guess < number)
            {
                 System.out.println("higher!");
            }
            else if (guess > number)
            {
                 System.out.println("lower.");
            }
            else if (guess < low || guess > high)
            {
                 System.out.println("Invalid choice!! Try again.");
            }
            tries++;
         }
         System.out.println("Congrats! you won in "+tries+" tries!");
    }
}
