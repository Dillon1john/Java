package cw4range;

public class cw4 {
    public static void main(String [] args){
        int [] numbers={5,7,2,4,9};
        int highest= numbers[0];
        for(int i=1; i< numbers.length; i++){
            if (numbers[i]> highest)
                highest= numbers[i];

        }
        int lowest = numbers[0];
        for(int i=1; i<numbers.length; i++){
            if(numbers[i]< lowest)
                lowest=numbers[i];
        }
        System.out.println("The range is: "+(highest-lowest));
    }

}
