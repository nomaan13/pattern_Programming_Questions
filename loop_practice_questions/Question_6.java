package loop_practice_questions;

import java.util.Scanner;

/*Write a program that prompts the user to input an integer
and then outputs the number with the digits reversed.
For example, if the input is 12345, the output should be 54321.
*/
public class Question_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int m=n;

        int rem ;
        int rev=0;

        while(m>0){
            rem = m%10;
            rev = rev*10+rem;
            m=m/10;

        }
        System.out.println("Reverse of " +n +" is : "+rev);
    }
}
