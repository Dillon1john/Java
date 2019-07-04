package PassbyString;

public class pbs {
    public static void main(String[] arg){
        String name= "Shakespeare";
        System.out.println("in main, name is "+name);
        changeName(name);
        System.out.println("back in main, name is " + name);

    }
    public static void changeName(String s){
        s="Dickens";
        System.out.println("in changeName, name is "+ s);
    }
}
