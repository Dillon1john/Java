package switchcw;
import java.util.Scanner;
public class switchmar7 {
    public static void main(String [] args){
        Scanner keyboard= new Scanner (System.in);
        System.out.println("Enter a number between 1 and 10");
        int num=keyboard.nextInt();

        switch(num){

            case 1:
                System.out.println("1,uno,yi");
                break;
            case 2:
                System.out.println("2, dos,er");
                break;
            case 3:
                System.out.println("3,tres,san");
                break;
            case 4:
                System.out.println("4,cuatro,si");
                break;
            case 5:
                System.out.println("5,cinco,wu");
                break;
            case 6:
                System.out.println("6, seis,liu");
                break;
            case 7:
                System.out.println("7,siete,qi");
                break;
            case 8:
                System.out.println("8,ocho,ba");
                break;
            case 9:
                System.out.println("9,nueve,jiu");
                break;
            case 10:
                System.out.println("10,diez,shi");
            default:
                System.out.println("Number must be between 1 and 10");

        }
    }
}
