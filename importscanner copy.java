package importscanner;
import java.util.Scanner;

public class importscanner {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        int birthMonth;
        double price;
        String name;
        System.out.println("Enter your birth month");//makes user input birth month*/
        birthMonth = Keyboard.nextInt();
        System.out.println("Enter a price");//makes user input price*/
        price=Keyboard.nextDouble();
        System.out.println("Enter your name");//makes user input name*/
        name=Keyboard.nextLine();
    }
}