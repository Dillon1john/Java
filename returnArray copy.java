package returnArray;

public class returnArray {
    public static void main(String [] args){
        double [] m = getArray();

        for(int i = 0; i< m.length; i++){
            System.out.print(m[i]+ " ");

        }

    }
    public static double [] getArray(){
        double [] array = {3.7, 13.24, 8.12, 5.9};
        return array;
    }
}
