package ifelsepract;
import java.util.Scanner;

public class ifelseprac {
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        System.out.println("Enter number!");
        int num;
        num=keyboard.nextInt();
        if(num>=0 && num<=20)
            System.out.println("Valid!");
        else
            System.out.println("Not Valid");


    }
}
