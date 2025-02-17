package special_numbers;

import java.util.Scanner;

public class Automorphic_Number {

         public static boolean isAutomorphicNumber(int n){
             int sq = n*n;
             while(n!=0){
                 int rem = n%10;
                 if (rem != sq%10){
                     return false;
                 }
                 n/=10;
                 sq/=10;
             }
             return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter a number here: ");
        int n= sc.nextInt();
        if (isAutomorphicNumber(n)==true){
            System.out.println("Enterd number is an automorphic number");
        }
        else
            System.out.println("Entered number is not an automorphic number");
    }
}
