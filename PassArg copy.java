package PassArg;

public class PassArg {
    public static void main(String[] args)
    {
    /* int x= 10;
     displayValue();
     displayValue(Integer.parseInt("700"));
     */
     showSum(3,7);

    }
    public static void showSum(double x, double y)
    {
        double sum= x+y;
        System.out.println(sum);

    }

    public static void displayValue(int num)
    {
        System.out.println("The value is " +num);

    }

}
