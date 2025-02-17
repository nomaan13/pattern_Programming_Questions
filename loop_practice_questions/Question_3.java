package loop_practice_questions;
import java.util.Scanner;
/*
    Write a program that prompts the user to input a positive integer. It should then print the multiplication table of that number.
* */
public class Question_3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter table you want : ");
        int n =sc.nextInt();
        int tab =1;

        if (n<0){
            System.out.println("Please enter a positive integer value!!");
        }
        else {
        for (int i=1;i<=10;i++) {
            tab = n * i;
            System.out.println(n + " * " + i + " = " + tab);

        }}
    }
}
