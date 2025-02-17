//WAJP to check entered number is a Palindrome number or not************************************************************
//************************************Without reversing*****************************************************************
package special_numbers;

import java.util.Scanner;

public class Palindrome_number {
    public static boolean checkPalindromeNo(int n){
        int a = n ;
        int b = n ;
        int rev = 0 ;
        int count=0;

        while (n>0){
            count++;
            n/=10;
        }

        int x=count-1;
        int i= 1;
        while (i<count/2){
            int right_digit = a%10;
            int left_digit = (int) (a/Math.pow(10,x))%10;
            if (right_digit!=left_digit){
                return false;
            }
            x--;
            i++;
            a=a/10;

        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int n = sc.nextInt();
        if (checkPalindromeNo(n)){
            System.out.println("The entered number is a Palindrome number");
        }
        else {
            System.out.println("The entered number is not a Palindrome number.");
        }
    }
}
