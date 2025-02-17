package special_numbers;

import java.util.Scanner;

public class Disarium_Number {
    public static int countDigit(int n ){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count;
    }
    public static int pow(int a, int b){
        int pow=1;
        for (int i =1;i<=b;i++){
            pow = pow*a;
        }
        return pow;
    }

    public static boolean isDisarium(int n){
        int a =n;
        int sum = 0;
        int digit= countDigit(n);

        while (n>0){
            int rem = n%10;
            sum = sum + pow(rem,digit);
            n=n/10;
            digit--;

        }
        return a==sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check:");
        int n = sc.nextInt();
        if (isDisarium(n)){
            System.out.println("It is a Disarium Number:");
        }
        else
            System.out.println("It is not a Disarium Number: ");
    }
}
