package metpra;

public class practformeth {
    //loopCall
    public static void main(String [] args){
        System.out.println("Hello from the main method");
        for(int i=0; i<5; i++)
        displayMessage();
        System.out.println("back in main method");
    }
    public static void displayMessage()
    {
        System.out.println("hello from displayMessage");

    }
}
