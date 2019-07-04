package input;
import java.util.Scanner;

public class input {

   public static void main(String[] args) {
        Scanner keyboard=new Scanner (System.in);
        System.out.println("Enter your name");
        String name;
        name=keyboard.nextLine();

        System.out.println("Enter your number");
        int num;
        num=keyboard.nextInt();

        System.out.println("Enter a price");
        double price;
        price= keyboard.nextDouble();

        System.out.println(name);
        System.out.println(num);
        System.out.println(price);

    }
}
