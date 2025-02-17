package exception_handling;
import java.util.Scanner;
public class Unchecked_exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number:");
        int a= sc.nextInt();
        System.out.print("Enter second number:");
        int b = sc.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        try {
            System.out.println(a/b);

        }catch (ArithmeticException ae ){
            System.out.println("Infinity");
        }

        System.out.println(10/0);
        System.out.println("END");

    }
}
