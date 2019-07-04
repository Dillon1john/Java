package grosspaycalc;
import java.util.Scanner;
//Dillon John/*

public class grosspaycalc {
    public static void main(String[] args){
        Scanner keyboard=new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name;
        name=keyboard.nextLine();

        System.out.println("How many hours did you work this week?");
        int hours;
        hours=keyboard.nextInt();

        System.out.println("What is your pay rate?");
        int payrate;
        payrate=keyboard.nextInt();

        int grosspay;
        grosspay=(payrate*hours);
        System.out.println("Your grosspay is: "+grosspay);

        double payafterfederal;
        payafterfederal=(grosspay-(grosspay*.25));
        System.out.println("Your pay after federal tax is: "+payafterfederal);

        double payafterstate;
        payafterstate=(payafterfederal-(payafterfederal*.05));
        System.out.println("Your pay after state tax is: "+payafterstate);

    }
}
