package practice321;

import java.util.Scanner;

public class practicewhile {
    public static void main(String [] args){
        Scanner keyboard= new Scanner (System.in);
        /*int days;
        double spent, totalSpent=0;

        System.out.println("How many days are you accounting for?");
        days= keyboard.nextInt();

        for(int count=1; count<=days; count++){
            System.out.println("Enter the total money spent for day "+count+" :");
            spent=keyboard.nextDouble();

            totalSpent+=spent;
        }

        System.out.printf("Total money spent is $%,.2f",totalSpent);*/

        /*int points, totalPoints=0;
        System.out.println("Enter a number");
        points=keyboard.nextInt();

        while (points!=-1)
        {
                totalPoints+=points;
                System.out.println("Enter a number");
                points= keyboard.nextInt();

        }

        System.out.println(totalPoints);*/
       /* for(int hours=1; hours<=2; hours++)
        {
            for(int minutes=0; minutes<=59; minutes++)
            {
                for(int seconds=0; seconds<=59; seconds++)
                {
                    System.out.printf("%02d:%02d:%02d\n", hours, minutes, seconds);
                    System.out.println(hours+ " : "+minutes+" : "+ seconds);
                }
            }
        }
        */
       for(int i=0; i<=50; i++)
       {
           if(i==25)
               continue;/*or break;*/
           System.out.println(i);
       }
    }
}
