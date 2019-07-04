package Passelement;

public class Passelement {
    public static void main(String [] args){
        int [] nums={10, 8, 6, 4};

        for(int i=0; i<nums.length;i++){
            showValue(nums[i]);
        }
    }   //this code passes array list to other method and calls that method which prints
    public static void showValue(int n){

        System.out.print(n + " ");
    }
}
