package PassbyValue;

public class pbv {
    public static void main(String [] args)
    {
        int number= 99;
        System.out.println(number);
        changeMe(number);
        System.out.println(number);
    }
    public static void changeMe(int value)
    {
        value= 5;
        System.out.println(value);
    }
}
