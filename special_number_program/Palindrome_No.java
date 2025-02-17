package special_number_program;
import java.util.Scanner;

public class Palindrome_No {
    public static boolean isPalindrom(int a ){
        int rem;
        int rev=0;

        while(a>0){
            rem = a%10;
            rev =10*rev + rem;
            a/=10;
        }
        if (rev==a){
            System.out.println("Entered number is a Palindrome number!!!!!");
            return true;
        }
        else {
            System.out.println("Entered number is not a Palindrome number!!!!!!!!");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int k = sc.nextInt();
        if (isPalindrom(k));
    }
}
