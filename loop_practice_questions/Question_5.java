package loop_practice_questions;
import java.util.Scanner;

/*Two numbers are entered through the keyboard.
Write a program to find the value of one number raised to the power of another.
(Do not use Java built-in method)
*/
public class Question_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base number: ");
        int a = sc.nextInt();
        System.out.print("Enter the power: ");
        int b = sc.nextInt();

        int pow=1;

        for (int i =1;i<=b;i++){
            pow  *= a;
        }
        System.out.println(a+" power " + b +" is :" +  pow);


    }
}
