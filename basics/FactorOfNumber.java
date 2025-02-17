package basics;
import java.util.Scanner;

public class FactorOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        int i =2;

        while(i<=a/2){
            if (a/2%i==0)
            System.out.println(i);
            i++;
        }
    }
}
