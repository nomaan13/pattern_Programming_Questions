package loop_practice_questions;
/*
    Write a program to enter the numbers till the user wants
    and at the end the program should display the
    largest and smallest numbers entered.
 */

import java.util.Scanner;

public class Question_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest=0;
        int smallest=Integer.MAX_VALUE;
        char ch ;
        do {
            System.out.print("ENter number: ");
            int n = sc.nextInt();
            if (n>largest){
                largest=n;
            } else if (n<smallest) {
                smallest=n;

            }


            System.out.print("Press Y or y to re-entered:");
            ch = sc.next().charAt(0);
        }while(ch=='y' || ch=='Y');

        System.out.println("Largest entered number is : " + largest);
        System.out.println("Smallest entered number is : " + smallest);


    }
}

