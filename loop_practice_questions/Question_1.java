package loop_practice_questions;

/*
    Write a program to print numbers from 1 to 10.
 */

public class Question_1 {

    public static void main(String[] args) {
        int n =1;
        int m=n;
        System.out.println("============================================USING FOR LOOP========================================================");
        for (int i =1;i<=10;i++){
            System.out.print(i + " ");
        }

        System.out.println("\n============================================USING WHILE LOOP========================================================");
        while(n<=10){
            System.out.print(n+ " ");
            n++;
        }
        System.out.println("\n============================================USING DO-WHILE LOOP========================================================");
        do {
            System.out.print(m+" ");
            m++;
        }while(m<=10);
    }
}
