package Homework7;
import java.util.Scanner;
public class Hw7
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many numbers would you like to add to the list?");
        int numbers = keyboard.nextInt();
        int[] list1 = new int[numbers];
        for (int i = 0; i < list1.length; i++)
        {
            System.out.print("Enter number: ");
            list1[i] = keyboard.nextInt();

        }
        stretch(list1);
    }
    public static void stretch(int [] list2)
    {
        for (int i=0;i<list2.length;i++)
        {
            list2[i]= list2[i]/2;
            System.out.print("     "+list2[i]+"    "+list2[i]+"   ");
            if(list2[i]%2>=1){
                int odd=list2[i]%2+list2[i];
                System.out.println(odd+"  "+list2[i]);
            }

        }

    }
}
