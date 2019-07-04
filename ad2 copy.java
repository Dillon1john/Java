package arraydemo2;
import java.util.Scanner;
public class ad2 {
    public static void main(String [] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("how many numbers? ");
        int employees =keyboard.nextInt();
        int[] hours = new int[employees];
        for(int i=0; i<employees; i++)
        {
         System.out.println("Enter the amount of hours worked by the employee"+(i+1));
         hours[i]=keyboard.nextInt();
        }
        for (int j=0 ; j<employees; j++){
            System.out.println("Employee "+(j+1)+" worked "+hours[j]+" hours");
        }
    }
}
