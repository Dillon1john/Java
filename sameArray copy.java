package sameArray;

public class sameArray {
    public static void main(String [] args){
        int [] array1={2,4,6,8,10};
        int[] array2= array1;


        array1[0]= 200;
        array2[2]=600;

        for(int i=0;i<array1.length;i++){
            System.out.print(array1[i]+ " ");
        }
        System.out.println();
        for(int j=0;j<array1.length;j++) {
            System.out.print(array2[j] + " ");
        }
    }
}
