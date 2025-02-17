package basics;

import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int a = sc.nextInt();
        System.out.print("Enter its power: ");
        int b = sc.nextInt();
        int result=1;

        int i =1;
        while(i<=b){
            result = a*result;
            i++;
        }
        System.out.println(a+" to the power " + b +" is : " + result);
    }
}
