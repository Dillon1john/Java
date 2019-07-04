package homework3;
import java.util.Scanner;
import java.io.*;
public class hw3 {
    public static void main(String [] args) throws IOException
    {
        PrintWriter outputfile= new PrintWriter("beerBottles.txt");
        int number=99;
        int end=1;
        int numberNext=number-1;
        outputfile.println(number + " bottles of beer on the wall, " + number+" bottles of beer. Take one down, pass it around, " + numberNext + " bottles of beer on the wall");

        while (number>end)
        {
            number--;
            numberNext= number-1;
            outputfile.println(number + " bottles of beer on the wall, " + number+" bottles of beer. Take one down, pass it around, " + numberNext + " bottles of beer on the wall");

        }
        outputfile.close();
    }

}
