package basics;
import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int factorial=1;
        int i =1;


        while (i<=a){
            factorial *= i;
            i++;
        }
        System.out.println("Factorial of "+a+" is :" + factorial);


    }
}
