package forlooppract;
import java.util.Scanner;

public class flp {
    public static void main(String [] args){
        Scanner keyboard= new Scanner (System.in);
        int days;
        double spent, totalSpent=0;

        System.out.println("How many days are you accounting for?");
        days= keyboard.nextInt();

        for(int count=1; count<=days; count++){
            System.out.println("Enter the total money spent for day "+count+" :");
            spent=keyboard.nextDouble();

            totalSpent+=spent;
        }

        System.out.printf("Total money spent is $%,.2f",totalSpent);
    }
}
