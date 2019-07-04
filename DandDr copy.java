package deepandDeeper;

public class DandDr {
    public static void main(String [] args){
        System.out.println("Hello from main");
        deep();
        System.out.println("Back in main");

    }
    public static void deep(){
        System.out.println("Hello from deep");
        deeper();
        System.out.println("back in deep");

    }
    public static void deeper(){
        System.out.println("Hello from deeper");
    }
}
