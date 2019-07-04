package Homework5;
import java.util.Scanner;
import java.util.Random;
public class Hw5 {
    public static void main(String[] args){
        Scanner keyboard= new Scanner (System.in);
        Random r= new Random();
        int low=1;
        int high=3;
        int number = r.nextInt(high-low)+ low;
        if (number==1){
            String rps="rock";
        }
        if (number==2){
        String rps="paper";
        }
        if (number==3){
            String rps="scissors";
        }
        System.out.println("Pick '1' for rock, '2' for paper, and '3' for scissors");
        int userChoice= keyboard.nextInt();
        switch(userChoice){
            case 1:
                System.out.println("You have chosen rock");
                if (number==1){
                    System.out.println("Draw! Rock ties with rock.");
                }
                if (number==2){
                    System.out.println("You lose! Paper beats rock");
                }
                if (number==3){
                    System.out.println("You win! Rock beats scissors");
                }
                break;
            case 2:
                System.out.println("You have chosen Paper");
                if (number==1){
                    System.out.println("You win! Paper beats rock.");
                }
                if (number==2){
                    System.out.println("Draw! Paper ties with paper ");
                }
                if (number==3){
                    System.out.println("You lose! Scissors beat paper");
                }
                break;
            case 3:
                System.out.println("You have chosen Scissors");
                if (number==1){
                    System.out.println("You lose! Rock beats scissors.");
                }
                if (number==2){
                    System.out.println("You win! Scissors beat paper");
                }
                if (number==3){
                    System.out.println("Draw! Scissors tie with scissors");
                }
                break;


        }

    }

}
