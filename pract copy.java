package retrypract;
import java.util.Scanner;
import java.io.*;

public class pract
{
    public static void main(String[] args) throws IOException
    {
        /*
        PrintWriter outputfile= new PrintWriter("spring.txt");
        outputfile.println("Spring is here");
        outputfile.println("Flowers are blooming");
        outputfile.println("The sun is shining");
        outputfile.close();
        */
        /*
        File myfile = new File("spring.txt");
        Scanner inputfile = new Scanner(myfile);

        while (inputfile.hasNext())
        {
            String line;
            line = inputfile.nextLine();

            System.out.println(line);



        }

        inputfile.close();
        */
        File myfile = new File("song.txt");
        Scanner in = new Scanner(myfile);
        //Read until the end of the file
        int count=0;

        while(in.hasNext())
        {
            String line= in.nextLine();
            count++;
        }
        System.out.println("There are "+count+ " lines in this file");
        in.close();
        //close the file when done
    }
}
