package hw2;
import java.util.Scanner;
public class hw2 {
    public static void main(String [] args){
        Scanner keyboard= new Scanner(System.in);
        System.out.println("Enter your name:");
        String name;
        name= keyboard.nextLine();

        System.out.println("Enter your height: ");
        double height;
        height= keyboard.nextDouble();

        System.out.println("Enter your weight: ");
        double weight;
        weight= keyboard.nextDouble();

        double bmi;
        bmi=((weight*703)/(height*height));
        System.out.println(bmi);

        if(bmi<=18.5)
            System.out.println(name+", you are underweight");
        if((bmi>=18.5)&&(bmi<=24.9))
            System.out.println(name+", you have normal weight");
        if ((bmi>=25)&&(bmi<=29.9))
            System.out.println(name+", you are overweight");
        if (bmi>=30)
            System.out.println(name+", you are obese");



    }
}
