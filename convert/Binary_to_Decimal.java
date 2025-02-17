package convert;

import java.util.Scanner;

public class Binary_to_Decimal {
    public static void getDecimal(int n) {
        int dec = 0;
        int comp = 1;
        while (n > 0) {
            int rem = n % 10;
            dec = dec + rem * comp;
            comp = comp * 2;
            n = n / 10;
        }
        System.out.println("Decimal conversion is : " + dec);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Binary Number:");
        int n = sc.nextInt();
        getDecimal(n);
    }
}