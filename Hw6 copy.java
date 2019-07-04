package Homework6;
import java.util.Scanner;
public class Hw6 {
    public static void main(String [] args){
        Scanner keyboard= new Scanner (System.in);
        double numpen,numnick,numquat,numhalf;
        System.out.print("How many pennies do you have");
        numpen= keyboard.nextDouble();
        System.out.print("How many nickels do you have");
        numnick= keyboard.nextDouble();
        System.out.print("How many quaters do you have");
        numquat= keyboard.nextDouble();
        System.out.print("How many half dollars do you have");
        numhalf= keyboard.nextDouble();
        theDollarAmount(numpen);

    }
    public static double theDollarAmount(double numpen,double numnick, double numquat, double numhalf,) {
        Scanner keyboard= new Scanner (System.in);
        double total=((.01*numpen)+(.05*numnick)+(.25*numquat)+(.50*numhalf));
        System.out.println("$"+total);
        return total;
    }
    }
