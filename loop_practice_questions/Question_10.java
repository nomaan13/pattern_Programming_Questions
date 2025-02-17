package loop_practice_questions;
import java.util.Scanner;
/*
    Write a do-while loop that asks the user to enter two numbers.
    The numbers should be added and the sum displayed.
     The loop should ask the user whether he or she wishes to perform the operation again.
      If so, the loop should repeat; otherwise it should terminate.
 */
public class Question_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p;
        do {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int sum = a+b;
            System.out.println("Sum of " +a +" and " +b +" is : "+sum);

            System.out.println("press 1 for repeat : \npress other to exit");
            p=sc.nextInt();
        }while(p==1);

    }
}
