package filearray;
import java.io.*;
import java.util.Scanner;
public class filearray {
    public static void main(String[] args) throws IOException {
        int[] nums = {14, 9, 13, 43, 15};
        /*
        PrintWriter outputfile= new PrintWriter("values.txt");
        for (int i=0; i < nums.length; i++){
            outputfile.print(nums[i]+" ");

        }
        outputfile.close();
        */
        int[] arrayB = new int[5];
        int i = 0;
        File myFile = new File("values.txt");
        Scanner input = new Scanner(myFile);
        while (input.hasNext() && i < arrayB.length) {
            arrayB[i] = input.nextInt();
            i++;

        }
        input.close();

        for (int j = 0; j < arrayB.length; j++) {
            System.out.print(arrayB[j] + " ");
        }
    }
}
