package iopract;
import java.util.Scanner;
import java.io.*;
public class iopract {
    public static void main(String[] args) throws IOException
    {
        /*
        PrintWriter outputfile= new PrintWriter("spring.txt");
        outputfile.println("Spring is here");
        outputfile.println("Flowers are blooming");
        outputfile.println("The sun is shining");
        outputfile.close();
        */

        File myfile= new File("spring.txt");
        Scanner inputfile= new Scanner(myfile);

        while (inputfile.hasNext())
        {
            String line;
            line = inputfile.nextLine();

            System.out.println(line);


        }
        inputfile.close();
    }



}
