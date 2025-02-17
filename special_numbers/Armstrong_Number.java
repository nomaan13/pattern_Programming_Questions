package special_numbers;

import java.util.Scanner;

public class Armstrong_Number {
    public static int countDigit(int n ){
        int count=0;
        while (n>0){
            count++;
            n=n/10;
        }
        return count ;
    }
//    public static int getPow(int a , int b){
//        int pow = 1;
//        for (int i =1;i<=b;i++){
//            pow = pow*a;
//        }
//        return  pow;
//    }


    public static int getSum(int n){
        int sum =0;
        int x = countDigit(n);

        while (n>0){
            int rem = n%10;
//            sum = sum + getPow(rem,x);
            sum = sum + (int)Math.pow(rem,x);
            n=n/10;
        }
        return sum;

    }

    //*****************************Method Ends******************************************

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here:");
        int n= sc.nextInt();


        if (getSum(n)==n){
            System.out.println("Entered number is a Armstrong Number!!");
        }
        else
            System.out.println("Entered number is not a Armstrong Number!!");
    }
}


