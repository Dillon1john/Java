package homework1;
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        System.out.println("Enter your name");
        String name;
        name=keyboard.nextLine();

        System.out.println("Enter first number");
        int num1;
        num1=keyboard.nextInt();

        System.out.println("Enter second number");
        int num2;
        num2=keyboard.nextInt();

        System.out.println("Enter third number");
        int num3;
        num3=keyboard.nextInt();

        int sum;
        sum=(num1+num2+num3);
        System.out.println(sum);



    }
}
