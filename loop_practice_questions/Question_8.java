package loop_practice_questions;
import java.util.Scanner;

/**
 * Write a program that prompts the user to input a positive integer.
 * It should then output a message indicating whether the number is a prime number.
 */

public class Question_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here : ");
        int n =sc.nextInt();
        int count =0;

            for (int i =2;i<=n/2;i++){
                if (n%i==0){
                    count++;

                }
            }
            if (count>1){
                System.out.println("Entered number is not a prime number");
            }
            else
                System.out.println("It is a Prime Number");



    }
}
