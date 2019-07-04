package arraydemo1;
import java.util.Scanner;
public class array1 {
    public static void main(String [] args){
        Scanner keyboard= new Scanner (System.in);
        int employees = 3 ;
        int [] hours= new int[employees];

        System.out.println("Enter the amount of hours worked by employee 1");
        hours[0]= keyboard.nextInt();
        System.out.println("Enter the amount of hours worked by employee 2");
        hours[1]= keyboard.nextInt();
        System.out.println("Enter the amount of hours worked by employee 3");
        hours[2]= keyboard.nextInt();
        System.out.println("Employee 1: "+hours[0]+" Employee 2: "+hours[1]+" Employee 3: "+hours[2]);
    }
}
