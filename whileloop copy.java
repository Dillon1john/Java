package whileloop;

public class whileloop {
    public static void main(String[] args)
    {
        int number= 60;
        while(number>=20)
        {
            if (number==40)
            {
                System.out.println("##");
            }
            else
                System.out.println(number);
           //number=number-2;
            number-=2;
        }
    }

}
