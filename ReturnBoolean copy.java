package Returnboolean;

public class ReturnBoolean {
    public static void main(String[] args){
        int value=5;
        if(isValid(value))
            System.out.println("The number is within range");
        else
            System.out.println("The number is not within range");
    }
    public static boolean isValid(int x){
        boolean status;
        if(x>=1&& x<=100)
            status=true;
        else
            status=false;
    }
}
