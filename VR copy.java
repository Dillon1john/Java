package ValueReturn;

public class VR {
    public static void main(String[] arg){
        int num1, num2, total;
        num1=20;
        num2= 40;
        total= sum(num1, num2);
        System.out.println("The sum is "+ total);
    }
    public static int sum(int value1, int value2){
        int result;
        result= value1+value2;
        return result;
    }
}

