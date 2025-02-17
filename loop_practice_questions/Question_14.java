package loop_practice_questions;

import java.util.Scanner;

/*
*   Write a program to print Fibonacci series of n terms where n is input by user :
        0 1 1 2 3 5 8 13 21 .....
* */
public class Question_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of terms of Fibonacci serise: ");
        int n = sc.nextInt();

        int first=0;
        int second=1;
        int sum =0;

        for (int i =1;i<=n;i++){
            System.out.print(first + " ");
            sum = first + second ;
            first = second;
            second = sum ;
        }

    }
}
