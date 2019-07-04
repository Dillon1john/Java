package switchpracitce;
import java.util.Scanner;
public class switchpract {
    public static void main(String[] args){
        Scanner keyboard= new Scanner (System.in);
        System.out.println("Enter a 1, 2, or 3");
        int num= keyboard.nextInt();

        switch(num)
        {
            case 1:
                System.out.println("You've entered a 1");
                break;
            case 2:
                System.out.println("You've entered a 2");
                break;
            case 3:
                System.out.println("You've entered a 3");
                break;
            default:
                System.out.println("You didn't enter a 1, 2, or 3");
        }
    }
}
