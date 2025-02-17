package loop_practice_questions;
/*
    Write a program to enter the numbers till the user wants
    and at the end it should display the count of positive, negative and zeros entered
 */

import java.util.Scanner;

public class Question_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q;
        int positive=0;
        int negative=0;
        int zero=0;

        do {
            System.out.print("Enter number: ");
            int p= sc.nextInt();

            if (p>0){
                positive++;
            } else if (p<0) {
                negative++;

            }
            else zero++;

            System.out.println("Press 1 to enter again else press to exit");
            q=sc.nextInt();
        }while (q==1);

        System.out.println("Total count of positive number is : " + positive);
        System.out.println("Total count of negative number is : " + negative);
        System.out.println("Total count of zero number is : " + zero);
    }
}
