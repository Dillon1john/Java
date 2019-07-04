package iofilepractice;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.*;

public class iopract
{
    public static void main(String [] args) throws IOException
    {
        /*
        PrintWriter outputfile = new PrintWriter("FourStudents.txt");
        outputfile.println("Nicole");
        outputfile.println("Luis");
        outputfile.println("Jayvon");
        outputfile.println("Charlie");
        */

        String filename;
        String studentName;
        int numStudents;

        Scanner keyboard= new Scanner(System.in);
        System.out.println("How many students in class today?");
        numStudents= keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("Enter the filename");

        filename= keyboard.nextLine();

        FileWriter fw= new FileWriter("students.txt", true);

        PrintWriter outputfile= new PrintWriter(filename);
        for(int i=1; i<=numStudents; i++)
        {
            System.out.println("Enter the name of the student " +i);
            studentName=keyboard.nextLine();
            outputfile.println(studentName);
        }


        outputfile.close();
    }
}
