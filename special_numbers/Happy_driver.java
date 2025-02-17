package special_numbers;

import java.util.Scanner;

public class Happy_driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check:");
        int n = sc.nextInt();
        if (Happy_Number.checkHappy(n)){
            System.out.println("Enterd number is a Happy number.");
        }
        else
            System.out.println("Entered number is not a Happy number.");
}
}

