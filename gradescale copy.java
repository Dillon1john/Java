package gradescale;
import java.util.Scanner;

public class gradescale {
    public static void main(String[] args){
        Scanner keyboard= new Scanner (System.in);
        System.out.println("What grade did you get?");
        double grade;
        grade=keyboard.nextDouble();

        if (grade<=100 && grade>=93)
            System.out.println("You received an A");
        if(grade<=92.9 && grade>=90)
            System.out.println("You received an A-");
        if(grade<=89.9 && grade>=87)
            System.out.println("You received a B+");
        if(grade<=86.9 && grade>=83)
            System.out.println("You received a B");
        if(grade<=82.9 && grade>=80)
            System.out.println("You received a B-");
        if(grade<=79.9 && grade>=77)
            System.out.println("You received a C+");
        if(grade<=76.9 && grade>=70)
            System.out.println("You received a C");
        if(grade<=69.9 && grade>=60)
            System.out.println("You received a D");
        if(grade<=59.9)
            System.out.println("You received an F");


    }

}
