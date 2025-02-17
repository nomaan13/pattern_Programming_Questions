package loop_practice_questions;
import java.util.Scanner;
/*
    Write a program to find the factorial value of any number entered through the keyboard.
* */
public class Question_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter a number you want factorial of : ");
        int n=sc.nextInt();

        int fact = 1;
        for (int i =1;i<=n;i++){
            fact *=i;
        }
        System.out.println("Factorial of " +n +" is : " + fact);
    }
}
