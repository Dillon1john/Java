package getagee;
import java.util.Scanner;

public class getAge {
    public static void main(String [] args){
        Scanner keyboard= new Scanner (System.in);
        System.out.println("input your age");
        int age= keyboard.nextInt();

        if(age<=21)
            qualify();
        else
            noQualify();

    }
    public static void qualify(){
        System.out.println("You are allowed to drink alcohol");
    }
    public static void noQualify(){
        System.out.println("You are not allowed to drink alcohol, sorry");
    }
}
