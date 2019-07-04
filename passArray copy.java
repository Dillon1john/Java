package passArray;

public class passArray {
    public static void main(String [] args){
        int [] numbers={8, 10, 25, 14, 7};
        showArray(numbers);
    }
    public static void showArray(int [] n){
        for (int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
    }
