package Homework8;

import java.util.Scanner;

public class hw8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many numbers would you like to add to the list?");
        int numbers = keyboard.nextInt();
        int[] list1 = new int[numbers];
        for (int i = 0; i < list1.length; i++) {
            System.out.print("Enter number: ");
            list1[i] = keyboard.nextInt();

        }
        shrink(list1);
    }

    public static void shrink(int[] list2) {
        for (int i = 1; i < list2.length; i++) {
            System.out.print(list2[i]+list2[i-1]+"  ");


            }
        }
    }

