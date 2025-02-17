package loop_practice_questions;

import java.util.Scanner;

/*
    Write a program to calculate HCF of Two given number.
*/
public class Question_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number : ");
        int n = sc.nextInt();
        System.out.print("Enter second number: ");
        int m =sc.nextInt();

        int hcf=1;

        for (int i=1;i<=n ||i<=m ;i++ ){
            if (n%i==0 && m%i==0){
                hcf=i;
            }
        }
        System.out.println("HCF OF "+m+" & "+n+" is : " + hcf);



    }
}
